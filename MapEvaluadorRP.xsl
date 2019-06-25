<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="MapEvaluadorRP.map" md5sum="edf6a40861682f820420244a794aa358" version="8.0.400" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor.
*
*   Mapping file:		MapEvaluadorRP.map
*   Map declaration(s):	MapEvaluadorRP
*   Input file(s):		/desaosb/consultaevaluacionindividuosoferta/v2/anonimo_schema/procesosventas/consultaevaluacionindividuosoferta/v2/obtenerevaluacionfinalizadaresponse_1_0_0.xsd
*   Output file(s):		/in_requiereProceso.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:math="http://exslt.org/math"
    xmlns:str="http://exslt.org/strings"
    xmlns:set="http://exslt.org/sets"
    xmlns:date="http://exslt.org/dates-and-times"
    xmlns:exsl="http://exslt.org/common"
    xmlns:xs4xs="http://www.w3.org/2001/XMLSchema"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:in2="http://ws.bancogalicia.com.ar/webservices/globales/bgbatipossoporte/3_0_0"
    xmlns:in4="http://ws.bancogalicia.com.ar/webservices/globales/bgbaresultadooperacion/2_0_0"
    xmlns:in3="http://ws.bancogalicia.com.ar/webservices/consultaevaluacionindividuosoferta/obtenerevaluacionfinalizadaresponse/1_0_0"
    xmlns:in="http://ws.bancogalicia.com.ar/webservices/globales/bgbatiposbase/3_0_0"
    xmlns:out="http://OM_RequiereProceso_Lib"
    xmlns:map="http://AccionesInstrumentacion/MapEvaluadorRP"
    xmlns:msl="http://www.ibm.com/xmlmap"
    exclude-result-prefixes="math str set date exsl map xalan msl"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root wrapper template  -->
  <xsl:template match="/">
    <msl:datamap>
      <xsl:choose>
        <xsl:when test="not(msl:datamap/dataObject[1]/@xsi:nil)">
          <xsl:element name="dataObject">
            <xsl:attribute name="xsi:type">
              <xsl:value-of select="'out:in_requiereProceso'"/>
            </xsl:attribute>
            <xsl:call-template name="map:MapEvaluadorRP">
              <xsl:with-param name="ObtenerEvaluacionFinalizadaResponse" select="msl:datamap/dataObject[1]"/>
            </xsl:call-template>
          </xsl:element>
        </xsl:when>
        <xsl:otherwise>
          <xsl:element name="dataObject">
            <xsl:attribute name="xsi:type">
              <xsl:value-of select="'out:in_requiereProceso'"/>
            </xsl:attribute>
            <xsl:attribute name="xsi:nil">
              <xsl:text>true</xsl:text>
            </xsl:attribute>
          </xsl:element>
        </xsl:otherwise>
      </xsl:choose>
    </msl:datamap>
  </xsl:template>

  <!-- This rule represents a type mapping: "in3:ObtenerEvaluacionFinalizadaResponse" to "out:in_requiereProceso".  -->
  <xsl:template name="map:MapEvaluadorRP">
    <xsl:param name="ObtenerEvaluacionFinalizadaResponse"/>
    <!-- a simple data mapping: "$ObtenerEvaluacionFinalizadaResponse/in3:Datos/in3:ResultadoEvaluacion/in3:Politicas/in3:CategoriaDecision/in3:Codigo"(string) to "semaforoGenerico"(string) -->
    <xsl:if test="$ObtenerEvaluacionFinalizadaResponse/in3:Datos/in3:ResultadoEvaluacion/in3:Politicas/in3:CategoriaDecision/in3:Codigo">
      <semaforoGenerico>
        <xsl:value-of select="$ObtenerEvaluacionFinalizadaResponse/in3:Datos/in3:ResultadoEvaluacion/in3:Politicas/in3:CategoriaDecision/in3:Codigo/."/>
      </semaforoGenerico>
    </xsl:if>
  </xsl:template>

  <!-- *****************    Utility Templates    ******************  -->
  <!-- copy the namespace declarations from the source to the target -->
  <xsl:template name="copyNamespaceDeclarations">
    <xsl:param name="root"/>
    <xsl:for-each select="$root/namespace::*[not(name() = '')]">
      <xsl:copy/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>