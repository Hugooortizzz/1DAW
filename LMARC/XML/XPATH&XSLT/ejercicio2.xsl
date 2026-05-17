<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h1>Ejercicio 2</h1>
                <h2>2.1 Nombre de los módulos que se imparten en el instituto.</h2>
                <xsl:for-each select="//modulo">
                        <li>
                            <xsl:value-of select="nombre" />
                        </li>
                </xsl:for-each>

                <h2>2.2 Nombre de los módulos del ciclo DAM.</h2>
                <xsl:for-each select="//modulo[ciclo = 'DAM']">
                        <li>
                            <xsl:value-of select="nombre" />
                        </li>
                </xsl:for-each>

                <h2>2.3 Nombre de los módulos que se imparten en el segundo curso de cualquier ciclo.</h2>
                <xsl:for-each select="//modulo[curso = '2']">
                        <li>
                            <xsl:value-of select="nombre" />
                        </li>
                </xsl:for-each>

                <h2>2.4 Nombre de los módulos de menos de 5 horas semanales.</h2>
                <xsl:for-each select="//modulo[horasSemanales &lt; '5']">
                        <li>
                            <xsl:value-of select="nombre" />
                        </li>
                </xsl:for-each>

                <h2>2.5 Nombre de los módulos que se imparten en el primer curso de DAM.</h2>
                <xsl:for-each select="//modulo[ciclo = 'DAM' and curso = '1']">
                        <li>
                            <xsl:value-of select="nombre" />
                        </li>
                </xsl:for-each>

                <h2>2.6 Horas semanales de los módulos de más de 4 horas semanales.</h2>
                <xsl:for-each select="//modulo[horasSemanales &gt; '4']">
                        <li>
                            <xsl:value-of select="horasSemanales" />
                        </li>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>