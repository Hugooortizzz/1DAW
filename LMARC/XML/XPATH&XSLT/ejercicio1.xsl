<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h1>Ejercicio 1</h1>
                <h2>1.1 Nombre del instituto</h2>
                <p>
                    <xsl:value-of select="/ies/nombre" />
                </p>

                <h2>1.2 Página web del instituto</h2>
                <p>
                    <xsl:value-of select="/ies/web" />
                </p>

                <h2>1.3 Nombre de los Ciclos Formativos</h2>
                <ul>
                    <xsl:for-each select="//ciclo">
                        <li>
                            <xsl:value-of select="nombre" />
                        </li>
                    </xsl:for-each>
                </ul>

                <h2>1.4 Siglas por las que se conocen los Ciclos Formativos</h2>
                <ul>
                    <xsl:for-each select="//ciclo">
                        <li>
                            <xsl:value-of select="@id" />
                        </li>
                    </xsl:for-each>
                </ul>

                <h2>1.5 Años en los que se publicaron las órdenes de título de los Ciclos Formativos</h2>
                <xsl:for-each select="//ciclo">
                    <p><b><u>
                        <xsl:value-of select="@id" />
                    </u></b></p>
                    <p>
                        <xsl:value-of select="ordenTitulo/@año" />
                    </p>
                </xsl:for-each>

                <h2>1.6 Ciclos Formativos de Grado Medio</h2>
                <xsl:for-each select="//ciclo[grado = 'Medio']">
                    <p>
                        <xsl:value-of select="." />
                    </p>
                </xsl:for-each>

                <h2>1.7 Nombre de los Ciclos Formativos anteriores a 2010 </h2>
                <xsl:for-each select="//ciclo[ordenTitulo/@año &lt; 2010]">
                    <p>
                        <xsl:value-of select="nombre" />
                    </p>
                </xsl:for-each>

                <h2>1.8 Nombre de los Ciclos Formativo de 2009 o 2011</h2>
                <xsl:for-each
                    select="//ciclo[ordenTitulo/@año = '2009' or ordenTitulo/@año = '2011']">
                    <p>
                        <xsl:value-of select="nombre" />
                    </p>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>