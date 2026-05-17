<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    h1{
                        text-align: center;
                    }
                    
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
                </style>
            </head>
            <body>
                <h1>Ejercicio 1</h1>
                <h2>1.1 ¿Qué ciclos formativos se imparten en el instituto</h2>
                    <xsl:for-each select="//ciclo">
                        <li>
                            <xsl:value-of select="text()" />
                        </li>
                    </xsl:for-each>

                <h2>1.2 ¿Cuáles ciclos formativos de grado medio se imparten en el instituto</h2>
                    <xsl:for-each select="//ciclo[@grado = 'Medio']">
                        <li>
                            <xsl:value-of select="text()" />
                        </li>
                    </xsl:for-each>

                <h2>1.3 ¿Cuáles son los nombres de los alumnos suspendidos </h2>
                <xsl:for-each select="//alumno[@aprobado = 'NO']">
                    <li>
                        <xsl:value-of select="nombre"/>
                    </li>
                </xsl:for-each>

                <h2>1.4. ¿Cuántas mujeres cursan el ciclo de ASIR</h2>
                <p>
                    <xsl:value-of select="count(//clase[@nombre = 'ASIR']/alumno[genero = 'Mujer'])"/>
                </p>

                <h2>1.5 ¿Qué alumnos suspendidos tienen una cuenta en Hotmail?</h2>
                <xsl:for-each select="//alumno[@aprobado = 'NO' and contains(email, 'hotmail')]">
                        <li>
                            <xsl:value-of select="nombre"/>
                        </li>
                </xsl:for-each>

                <h2>1.6 ¿Cuál es la lista de clase de SMR</h2>
                <xsl:for-each select="//clase[@nombre='SMR']/alumno">
                    <li>
                        <xsl:value-of select="nombre"/>
                    </li>
                </xsl:for-each>

                <h2>1.7 ¿En qué ciclos hay alumnos que han sacado un 10</h2>
                <xsl:for-each select="//clase/alumno[nota = '10']">
                    <li>
                        <xsl:value-of select="../@nombre"/>
                    </li>
                </xsl:for-each>

                <h2>1.8 ¿Cuántos alumnos han aprobado ASIR</h2>
                <xsl:value-of select="count(//clase[@nombre = 'ASIR']/alumno[@aprobado = 'SI'])"/>

                <h2>1.9. ¿Qué porcentaje de aprobados tiene el centro</h2>
                <xsl:value-of select="format-number(count(//alumno[@aprobado = 'SI']) div  count(//alumno) * 100, '0.00')" />


                <h1>Ejercicio 2</h1>
                <ul>
                    <xsl:for-each select="//especialidad">
                        <li>
                            <xsl:value-of select="@nombre"/>
                        </li>

                        <ul>
                            <li>Medio</li>
                            <ul>
                                <xsl:for-each select="ciclo[@grado = 'Medio']">
                                    <li>
                                        <xsl:value-of select="text()"/>
                                    </li>
                                </xsl:for-each>
                            </ul>
                        </ul>
                        <ul>
                            <li>Superior</li>
                            <ul>
                                <xsl:for-each select="ciclo[@grado = 'Superior']">
                                    <li>
                                        <xsl:value-of select="text()"/>
                                    </li>
                                </xsl:for-each>
                            </ul>
                        </ul>
                        
                    </xsl:for-each>
                </ul>
                
                <h1>Ejercicio 3</h1>
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Nota</th>
                        <th>Email</th>
                        <th>Genero</th>
                        <th>Ciclo</th>
                    </tr>
                    <xsl:for-each select="//alumno">
                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="email"/></td>
                            <td><xsl:value-of select="genero"/></td>
                            <td><xsl:value-of select="../@nombre"/></td>
                            <xsl:if test="@aprobado = 'NO'">
                                    <td style="background-color: #ff6b6b">
                                    1</td>
                                </xsl:if>
                                <xsl:if test="@aprobado = 'SI'">
                                    <td><xsl:value-of select="nota"/></td>
                                </xsl:if>
                        </tr>
                    </xsl:for-each>
                </table>
                
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>