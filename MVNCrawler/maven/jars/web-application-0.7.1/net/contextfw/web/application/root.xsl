<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:txt="http://contextfw.net/ns/txt">

<xsl:variable name="lang"><xsl:value-of select="/WebApplication/@lang"/><xsl:value-of select="/WebApplicationUpdate/@lang"/></xsl:variable>
<xsl:variable name="contextPath"><xsl:value-of select="/WebApplication/@contextPath"/><xsl:value-of select="/WebApplication.update/@contextPath"/></xsl:variable>
<xsl:variable name="webApplicationHandle"><xsl:value-of select="/WebApplication/@handle"/></xsl:variable>

<xsl:template match="/">
	<xsl:apply-templates select="/WebApplication.update" mode="context" />
	<xsl:apply-templates select="/WebApplication" mode="context" />
</xsl:template>

<xsl:template match="WebApplication.update" mode="context">
<updates xmlns:txt="http://contextfw.net/ns/txt"><xsl:apply-templates/>
<script>
<xsl:apply-templates select="//Script" mode="script" />
</script>
</updates>
</xsl:template>

<xsl:template match="Reload">
<script>window.location.reload();</script>
</xsl:template>

<xsl:template match="Redirect">
<script>window.location="<xsl:value-of select="@href" />";</script>
</xsl:template>

<xsl:template match="Script"><!-- LEAVE THIS EMPTY --></xsl:template>
<xsl:template match="Script" mode="script"><xsl:apply-templates mode="script" /></xsl:template>

<xsl:template match="WebApplication" mode="context">
	<xsl:apply-templates />
</xsl:template>
</xsl:stylesheet>