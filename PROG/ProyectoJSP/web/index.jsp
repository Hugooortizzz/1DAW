<%-- 
    Document   : index
    Created on : May 20, 2026, 1:33:56 PM
    Author     : hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
            background-color: rgb(239, 239, 239);
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
            width: 300px;
            height: 100px;
            margin: 10px;
            border-radius: 20px;
        }

        button:hover{
            transform: scale(1.25);
        }

        button:active{
            transform: scale(0.95);
        }
    </style>
</head>

<body>
    <div id="layout">
        <aside id="izquierda">
        </aside>
        <div id="menu">
            <h1>Registrador de personajes</h1>
            <h2>¿Qué desea hacer?</h2>
            <a href="nuevo.jsp"><button>Añadir Personajes</button></a>
            <button>Ver Personajes</button>
            <button>Simular combate</button>
        </div>
        <aside id="derecha">
        </aside>
    </div>


</body>

</html>
