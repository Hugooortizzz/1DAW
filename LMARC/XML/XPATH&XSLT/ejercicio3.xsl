<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    table{
                        border: 1px solid black;
                        border-collapse: collapse;
                    }

                    table tr, td, th{
                        border: 1px solid black;
                        width: 150px;
                        text-align: center;
                        height: 50px;
                    }

                    th{
                        background-color: lightblue;
                    }

                    tr:nth-child(odd){
                        background-color: #e9e9e9;
                    }

                    .nombre{
                        width: 350px;
                    }

                    
                </style>
            </head>
            <body>
                <h1>Ejercicio 3</h1>

                <h2>Información módulos</h2>
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Curso</th>
                        <th>Horas Semanales</th>
                        <th>Ciclo</th>
                    </tr>
                    <xsl:for-each select="//modulo">
                        <tr>
                            <td class="nombre"><xsl:value-of select="nombre" /></td>
                            <td><xsl:value-of select="curso" /></td>
                            <td><xsl:value-of select="horasSemanales" /></td>
                            <td><xsl:value-of select="ciclo" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
                
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>