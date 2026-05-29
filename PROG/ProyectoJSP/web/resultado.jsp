<%-- 
    Document   : resultado
    Created on : May 20, 2026, 1:56:10 PM
    Author     : hugo
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="java.io.BufferedWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="personajes.GestionPersonajes"%>
<%@page import="personajes.Personaje"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="refresh" content="3; url=nuevo.jsp" />

    <title>Resultado</title>
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

        #mostrar {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            width: 50%;
            background-color: white;
        }

        #mostrar div{
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
            <h1>
                <%
                    if(GestionPersonajes.añadirPersonaje(new Personaje(request.getParameter("nombre"), request.getParameterValues("combate"), Integer.parseInt(request.getParameter("poder")), request.getParameter("imagen")))){
                    out.print("El personaje se ha creado correctamente");
                    GestionPersonajes.actualizarFichero();
                    
                }else{
                    out.print("Error: El personaje ya existe");
                }
                %>
            </h1>
            <p>Volviendo a la página de creación de personaje</p>
            <img src="https://media1.tenor.com/m/WX_LDjYUrMsAAAAC/loading.gif" width="50px">
        </div>
        
        
        <aside id="derecha">
        </aside>
    </div>
 


</body>

</html>