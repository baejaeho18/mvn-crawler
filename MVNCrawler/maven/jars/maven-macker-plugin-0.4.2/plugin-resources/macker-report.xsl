<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/macker-report">
		<document>

			<properties>
				<title>Macker</title>
			</properties>

			<body>
				<xsl:apply-templates select="ruleset"/>
			</body>
		</document>
	</xsl:template>

	<xsl:template match="//ruleset">
		<xsl:element name="section">
			<xsl:attribute name="name">
				<xsl:value-of select="@name"/>
			</xsl:attribute>
			<table>
				<tr>
					<th>Severity</th>
					<th>Message</th>
					<th>From</th>
					<th>To</th>
				</tr>
				<xsl:apply-templates select="descendant::access-rule-violation"/>
			</table>
		</xsl:element>
	</xsl:template>

	<xsl:template match="access-rule-violation">
		<tr>
			<td>
				<xsl:value-of select="@severity"/>
			</td>
			<td>
				<xsl:value-of select="message"/>
			</td>
			<td>
				<xsl:value-of select="from/full-name"/>
			</td>
			<td>
				<xsl:value-of select="to/full-name"/>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet><!-- Stylus Studio meta-information - (c)1998-2004. Sonic Software Corporation. All rights reserved.
<metaInformation>
<scenarios ><scenario default="yes" name="macker&#x2D;raw&#x2D;report.xml" userelativepaths="yes" externalpreview="no" url="macker&#x2D;raw&#x2D;report.xml" htmlbaseurl="" outputurl="" processortype="internal" profilemode="0" profiledepth="" profilelength="" urlprofilexml="" commandline="" additionalpath="" additionalclasspath="" postprocessortype="none" postprocesscommandline="" postprocessadditionalpath="" postprocessgeneratedext=""/></scenarios><MapperMetaTag><MapperInfo srcSchemaPathIsRelative="yes" srcSchemaInterpretAsXML="no" destSchemaPath="macker&#x2D;report.xml" destSchemaRoot="document" destSchemaPathIsRelative="yes" destSchemaInterpretAsXML="no" ><SourceSchema srcSchemaPath="macker&#x2D;raw&#x2D;report.xml" srcSchemaRoot="macker&#x2D;report" AssociatedInstance="" loaderFunction="document" loaderFunctionUsesURI="no"/></MapperInfo><MapperBlockPosition><template match="/"><block path="document/body/section/table/xsl:for&#x2D;each" x="180" y="252"/><block path="document/body/section/table/xsl:for&#x2D;each/tr/th[1]/xsl:value&#x2D;of" x="180" y="142"/><block path="document/body/section/table/xsl:for&#x2D;each/tr/th[2]/xsl:value&#x2D;of" x="220" y="142"/><block path="document/body/section/table/xsl:for&#x2D;each/tr/th[3]/xsl:value&#x2D;of" x="140" y="142"/><block path="document/body/section/table/xsl:for&#x2D;each/tr/th[4]/xsl:value&#x2D;of" x="100" y="142"/></template><template name="access&#x2D;rule&#x2D;violation"><block path="tr/tr[1]/xsl:value&#x2D;of" x="180" y="135"/><block path="tr/tr[2]/xsl:value&#x2D;of" x="220" y="135"/><block path="tr/tr[3]/xsl:value&#x2D;of" x="140" y="135"/><block path="tr/tr[4]/xsl:value&#x2D;of" x="100" y="135"/></template><template name="**/access&#x2D;rule&#x2D;violation"><block path="tr/tr[1]/xsl:value&#x2D;of" x="180" y="135"/><block path="tr/tr[2]/xsl:value&#x2D;of" x="220" y="135"/><block path="tr/tr[3]/xsl:value&#x2D;of" x="140" y="135"/><block path="tr/tr[4]/xsl:value&#x2D;of" x="100" y="135"/></template></MapperBlockPosition></MapperMetaTag>
</metaInformation>
-->