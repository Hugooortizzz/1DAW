<%-- 
    Document   : index
    Created on : May 20, 2026, 1:33:56 PM
    Author     : hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="personajes.GestionPersonajes"%>
<%@page import="personajes.Personaje"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mostrar Personajes</title>
    <style>
        * {
            margin: 0;
        }

        @font-face {
            font-family: OnePiece;
            src: url(resources/one\ piece\ font.ttf);
        }

        h1 {
            text-align: center;
            font-family: "OnePiece";
            font-size: 60px;
        }

        #centro {
            width: 50%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        .personaje{
            display: flex;
            flex-direction: column;
            align-items: center;
            align-items: center;
            justify-content: center;
            width: 250px;
            background-color: white;
            margin-right: 10px;
        }

        #mostrar {
            display: flex;
            flex-direction: row;
            flex-wrap: wrap;
            align-items: center;
            justify-content: center;
        }

        #layout {
            display: flex;
            flex-direction: row;
            justify-content: center;
            width: 100%;
        }

        aside {
            height: 100vh;
            width: 100px;
            width: 25%;
        }

        #izquierda {
            background-image: url("resources/asideiz.png");
        }

        #derecha {
            background-image: url("resources/asideder.png");
        }

        button {
            margin: 10px;
            border-radius: 2px;
        }

        .finales {
            width: 65px;
            height: 40px;
            margin-right: 15px;
        }

        .finales:hover {
            transform: scale(1.25);
        }

        .finales:active {
            transform: scale(0.95);
        }

        #mostrarImagen {
            width: 200px;
            height: 300px;
            border: 1px solid black;
        }
        
    </style>
</head>

<body>
    <div id="layout">
        <aside id="izquierda">
        </aside>
        <div id="centro">
            <h1>Mostrar Personajes</h1>
            <div id="mostrar">
                <%for(Personaje p : GestionPersonajes.getPersonajes()){ %>
                    <div class="personaje">
                        <img id="mostrarImagen"
                             src= "<% out.print(p.getImagen()); %>"><br>
                        <p><b>Nombre: </b><% out.print(p.getNombre()); %></p>
                        <p><b>Estilos de combate:</b></p><dt><% 
                                for(int i = 0; i< p.getEstiloCombate().length; i++){
                                    out.print("<dd>" + p.getEstiloCombate()[i] + "</dd>");
                                }%>
                        </dt>
                            <p><b>Poder: </b><% out.print(p.getPoder()); %></p>
                </div>
                <%}; %>
                
            </div>
                
                <a href="index.jsp"><button class="finales" id="volver">Volver</button></a>
                
        </div>


        <aside id="derecha">
        </aside>
    </div>


    <script type="text/javascript">
        function cambiarImagen() {
            let imagen = document.getElementById("mostrarImagen");
            let url = document.getElementById("url").value;

            imagen.src = url;

            //Esto controla que la imagen no pueda dar error, si no que si no encuentra una url valida, salga la imagen gris por defecto
            imagen.onerror = function () {
                imagen.src = "https://imgs.search.brave.com/XtJK0itkXwynQ-cJdo14VYm_cLaHC7nT796fBajKpu4/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMudW5zcGxhc2gu/Y29tL3Bob3RvLTE3/NzU1MzQ3NzgzNzUt/M2YyMzVjNDY2YzU4/P2ZtPWpwZyZxPTYw/Jnc9MzAwMCZhdXRv/PWZvcm1hdCZmaXQ9/Y3JvcCZpeGxpYj1y/Yi00LjEuMCZpeGlk/PU0zd3hNakEzZkRC/OE1IeHpaV0Z5WTJo/OE1qQjhmSEJzWVds/dUpUSXdkMmhwZEdW/OFpXNThNSHg4TUh4/OGZEQT0";
            };
        }
    </script>
</body>

</html>
