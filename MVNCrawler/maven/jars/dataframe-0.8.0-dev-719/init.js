(function () {
    window.DataFrame = window.DataFrame || new (function() {
        this.addTable = function(df) {
            let cols = df.cols;
            for(let i=0;i<cols.length;i++){
                for(let c of cols[i].children){
                    cols[c].parent = i;
                }
            }
            df.nrow = 0
            for(let i=0;i<df.cols.length;i++){
                if(df.cols[i].values.length > df.nrow) df.nrow = df.cols[i].values.length
            }
            if(df.id === df.rootId)
            {
                df.expandedFrames = new Set()
                df.childFrames = { }
                const table = this.getTableElement(df.id)
                table.df = df
                for(let i=0;i<df.cols.length;i++){
                    if(df.cols[i].children.length > 0) df.cols[i].expanded = true
                }
            }else {
                const rootDf = this.getTableData(df.rootId)
                rootDf.childFrames[df.id] = df
            }
        }

        this.computeRenderData = function(df) {
            let result = []
            let pos = 0
            for(let col=0;col<df.cols.length;col++){
                if(df.cols[col].parent === undefined)
                    pos += this.computeRenderDataRec(df.cols, col, pos, 0, result, false, false)
            }
            for(let i=0;i<result.length;i++){
                let row = result[i]
                for(let j=0;j<row.length;j++){
                    let cell = row[j]
                    if(j === 0)
                        cell.leftBd = false
                    if(j < row.length-1){
                        let nextData = row[j+1]
                        if(nextData.leftBd) cell.rightBd = true
                        else if(cell.rightBd) nextData.leftBd = true
                    } else cell.rightBd = false
                }
            }
            return result
        }

        this.computeRenderDataRec = function(cols, colId, pos, depth, result, leftBorder, rightBorder) {
            if(result.length === depth){
                const array = [];
                if(pos > 0)
                {
                    let j = 0
                    for(let i = 0; j < pos; i++)
                    {
                        let c = result[depth-1][i]
                        j += c.span
                        let copy = Object.assign({empty: true}, c)
                        array.push(copy)
                    }
                }
                result.push(array)
            }
            const col = cols[colId];
            let size = 0;
            if(col.expanded)
            {
                let childPos = pos
                for(let i=0;i<col.children.length;i++){
                    let child = col.children[i]
                    let childLeft = i === 0 && (col.children.length > 1 || leftBorder)
                    let childRight = i === col.children.length-1 && (col.children.length > 1 || rightBorder)
                    let childSize = this.computeRenderDataRec(cols, child, childPos, depth+1, result, childLeft, childRight)
                    childPos += childSize
                    size += childSize
                }
            }
            else{
                for(let i = depth+1;i<result.length;i++)
                    result[i].push({id: colId, span: 1, leftBd: leftBorder, rightBd: rightBorder, empty:true})
                size = 1
            }
            let left = leftBorder
            let right = rightBorder
            if(size > 1) {
                left = true
                right = true
            }
            result[depth].push({id: colId, span: size, leftBd: left, rightBd: right})
            return size
        }

        this.getTableElement = function (id) {
            return document.getElementById("df_" + id)
        }

        this.getTableData = function(id) {
            return this.getTableElement(id).df
        }

        this.createExpander = function(isExpanded) {
            const svgNs = "http://www.w3.org/2000/svg"
            let svg = document.createElementNS(svgNs, "svg")
            svg.classList.add("expanderSvg")
            let path = document.createElementNS(svgNs, "path")
            if(isExpanded){
                svg.setAttribute("viewBox", "0 -2 8 8")
                path.setAttribute("d", "M1 0 l-1 1 4 4 4 -4 -1 -1 -3 3Z")
            } else {
                svg.setAttribute("viewBox", "-2 0 8 8")
                path.setAttribute("d", "M1 0 l-1 1 3 3 -3 3 1 1 4 -4Z")
            }
            path.setAttribute("fill", "currentColor")
            svg.appendChild(path)
            return svg
        }

        this.renderTable = function(id) {

            let table = this.getTableElement(id)

            if(table === null) return

            table.innerHTML = ""

            let df = table.df
            let rootDf = df.rootId === df.id ? df : this.getTableData(df.rootId)

            // header
            let header = document.createElement("thead")
            table.appendChild(header)

            let renderData = this.computeRenderData(df)
            for(let j=0;j<renderData.length;j++){
                let rowData = renderData[j]
                let tr = document.createElement("tr");
                let isLastRow = j === renderData.length-1
                header.appendChild(tr);
                for(let i = 0;i<rowData.length;i++) {
                    let cell = rowData[i]
                    let th = document.createElement("th");
                    th.setAttribute("colspan", cell.span)
                    let colId = cell.id
                    let col = df.cols[colId];
                    if(!cell.empty) {
                        if(col.children.length === 0){
                            th.innerHTML = col.name
                        }else {
                            let link = document.createElement("a")
                            link.className = "expander"
                            let that = this
                            link.onclick = function () {
                                col.expanded = !col.expanded
                                that.renderTable(id)
                            }
                            link.appendChild(this.createExpander(col.expanded))
                            link.innerHTML += col.name
                            th.appendChild(link)
                        }
                    }
                    let classes = (cell.leftBd ? " leftBorder" : "") + (cell.rightBd ? " rightBorder" : "")
                    if(col.rightAlign)
                        classes += " rightAlign"
                    if(isLastRow)
                        classes += " bottomBorder"
                    if(classes.length > 0)
                        th.setAttribute("class", classes)
                    tr.appendChild(th)
                }
            }

            // body
            let body = document.createElement("tbody")
            table.appendChild(body)

            let columns = renderData.pop()
            for(let row = 0; row < df.nrow; row++) {
                let tr = document.createElement("tr");
                body.appendChild(tr)
                for(let i = 0; i<columns.length;i++) {
                    let cell = columns[i]
                    let td = document.createElement("td");
                    let colId = cell.id
                    let col = df.cols[colId]
                    let classes = (cell.leftBd ? " leftBorder" : "") + (cell.rightBd ? " rightBorder" : "")
                    if(col.rightAlign)
                        classes += " rightAlign"
                    if(classes.length > 0)
                        td.setAttribute("class", classes)
                    tr.appendChild(td)
                    let value = col.values[row]
                    if(value.frameId !== undefined) {
                        let frameId = value.frameId
                        let expanded = rootDf.expandedFrames.has(frameId)
                        let link = document.createElement("a")
                        link.className = "expander"
                        let that = this
                        link.onclick = function () {
                            if(rootDf.expandedFrames.has(frameId))
                                rootDf.expandedFrames.delete(frameId)
                            else rootDf.expandedFrames.add(frameId)
                            that.renderTable(id)
                        }
                        link.appendChild(this.createExpander(expanded))
                        link.innerHTML += value.value
                        if(expanded) {
                            td.appendChild(link)
                            td.appendChild(document.createElement("p"))
                            const childTable = document.createElement("table")
                            childTable.className = "dataframe"
                            childTable.id = "df_" + frameId
                            childTable.df = rootDf.childFrames[frameId]
                            td.appendChild(childTable)
                            this.renderTable(frameId)
                        } else {
                            td.appendChild(link)
                        }
                    }else if(value.style !== undefined) {
                        td.innerHTML = value.value
                        td.setAttribute("style", value.style)
                    }else td.innerHTML = value
                    this.nodeScriptReplace(td)
                }
            }
        }

        this.nodeScriptReplace = function(node) {
            if ( this.nodeScriptIs(node) === true ) {
                node.parentNode.replaceChild( this.nodeScriptClone(node) , node );
            }
            else {
                let i = -1, children = node.childNodes;
                while ( ++i < children.length ) {
                    this.nodeScriptReplace( children[i] );
                }
            }

            return node;
        }

        this.nodeScriptClone = function(node){
            let script  = document.createElement("script");
            script.text = node.innerHTML;

            let i = -1, attrs = node.attributes, attr;
            while ( ++i < attrs.length ) {
                script.setAttribute( (attr = attrs[i]).name, attr.value );
            }
            return script;
        }

        this.nodeScriptIs = function(node) {
            return node.tagName === 'SCRIPT';
        }
    })()

    window.call_DataFrame = window.call_DataFrame || function(f) {
        return f();
    };
})()
