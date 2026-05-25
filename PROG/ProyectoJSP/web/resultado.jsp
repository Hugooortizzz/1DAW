<%-- 
    Document   : resultado
    Created on : May 20, 2026, 1:56:10 PM
    Author     : hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="refresh" content="3; url=nuevo.jsp" />

    <title>Inicio</title>
    <style>

        *{
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

        #menu {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            width: 50%;
            background-color: white;
        }

        #menu div{
            margin: 10px 0;
        }

        #layout{
            display: flex;
            flex-direction: row;
            justify-content: center;
            width: 100%;
        }

        aside{
            height: 100vh;
            width: 100px;
            width: 25%;
        }

        #izquierda{
            background-image: url("resources/asideiz.png");
        }

        #derecha{
            background-image: url("resources/asideder.png");
        }

        button {
            margin: 10px;
            border-radius: 2px;
        }

        .finales{
            width: 100px;
            height: 50px;
        }

        .finales:hover{
            transform: scale(1.25);
        }

        .finales:active{
            transform: scale(0.95);
        } 
    </style>
</head>

<body>
    <div id="layout">
        <aside id="izquierda">
        </aside>
        <div id="mostrar">
            <div id="imagen">
                <img src=""
            </div>
            <div id="menu">
            <form method="get" action="resultado.jsp">
            <h1>Personaje enviado/h1>
            <div>
                Volviendo a la creacion de personajes
            </div>
            <div>
                Estilo de combate: <button id="artesMatciales">Artes Marciales</button>
                <button id="armas">Armas</button>
                <button id="fruta">Fruta del diablo</button>
            </div>
            <div>
                Escala de poder: <input type="number" id="poder" min="0" max="100">
            </div>
            <div>
                Imagen: <input type="text" id="nombre">
            </div>
            <div>
                <button class="finales" id="volver">Volver</button>
                <input type="submit" class="finales" id="enviar">Enviar</button>
            </div>
            </div>
        </div>
        
        <aside id="derecha">
        </aside>
    </div>


</body>

</html>