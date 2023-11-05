///<reference path="definitions/external/tsd.d.ts"/>
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.multilinePlaceholder = function () {
        return this.each(function () {
            var $originalElement = $(this);
            var $textarea = $originalElement.find('textarea');
            var placeholder = $textarea.attr('placeholder');
            var multilinePlaceholder = placeholder.replace(/\\n/g, '\n');
            $textarea.attr('placeholder', multilinePlaceholder);
        });
    };
}(jQuery));

//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbImJ1dHRlcmZhY2VzLW11bHRpbGluZS1wbGFjZWhvbGRlci5qcXVlcnkudHMiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUEsb0RBQW9EO0FBRXBELENBQUMsVUFBVSxDQUFLO0lBQ1oscUZBQXFGO0lBQ3JGLENBQUMsQ0FBQyxFQUFFLENBQUMsb0JBQW9CLEdBQUc7UUFFeEIsTUFBTSxDQUFDLElBQUksQ0FBQyxJQUFJLENBQUM7WUFDYixJQUFJLGdCQUFnQixHQUFHLENBQUMsQ0FBQyxJQUFJLENBQUMsQ0FBQztZQUMvQixJQUFJLFNBQVMsR0FBRyxnQkFBZ0IsQ0FBQyxJQUFJLENBQUMsVUFBVSxDQUFDLENBQUM7WUFDbEQsSUFBSSxXQUFXLEdBQUcsU0FBUyxDQUFDLElBQUksQ0FBQyxhQUFhLENBQUMsQ0FBQztZQUNoRCxJQUFJLG9CQUFvQixHQUFHLFdBQVcsQ0FBQyxPQUFPLENBQUMsTUFBTSxFQUFFLElBQUksQ0FBQyxDQUFDO1lBQzdELFNBQVMsQ0FBQyxJQUFJLENBQUMsYUFBYSxFQUFFLG9CQUFvQixDQUFDLENBQUM7UUFDeEQsQ0FBQyxDQUFDLENBQUM7SUFFUCxDQUFDLENBQUM7QUFDTixDQUFDLENBQUMsTUFBTSxDQUFDLENBQUMsQ0FBQyIsImZpbGUiOiJidXR0ZXJmYWNlcy1tdWx0aWxpbmUtcGxhY2Vob2xkZXIuanF1ZXJ5LmpzIiwic291cmNlc0NvbnRlbnQiOlsiLy8vPHJlZmVyZW5jZSBwYXRoPVwiZGVmaW5pdGlvbnMvZXh0ZXJuYWwvdHNkLmQudHNcIi8+XG5cbihmdW5jdGlvbiAoJDphbnkpIHtcbiAgICAvLyBleHRlbmQgalF1ZXJ5IC0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tXG4gICAgJC5mbi5tdWx0aWxpbmVQbGFjZWhvbGRlciA9IGZ1bmN0aW9uICgpIHtcblxuICAgICAgICByZXR1cm4gdGhpcy5lYWNoKGZ1bmN0aW9uICgpIHtcbiAgICAgICAgICAgIHZhciAkb3JpZ2luYWxFbGVtZW50ID0gJCh0aGlzKTtcbiAgICAgICAgICAgIHZhciAkdGV4dGFyZWEgPSAkb3JpZ2luYWxFbGVtZW50LmZpbmQoJ3RleHRhcmVhJyk7XG4gICAgICAgICAgICB2YXIgcGxhY2Vob2xkZXIgPSAkdGV4dGFyZWEuYXR0cigncGxhY2Vob2xkZXInKTtcbiAgICAgICAgICAgIHZhciBtdWx0aWxpbmVQbGFjZWhvbGRlciA9IHBsYWNlaG9sZGVyLnJlcGxhY2UoL1xcXFxuL2csICdcXG4nKTtcbiAgICAgICAgICAgICR0ZXh0YXJlYS5hdHRyKCdwbGFjZWhvbGRlcicsIG11bHRpbGluZVBsYWNlaG9sZGVyKTtcbiAgICAgICAgfSk7XG5cbiAgICB9O1xufShqUXVlcnkpKTsiXSwic291cmNlUm9vdCI6Ii9zb3VyY2UvIn0=
