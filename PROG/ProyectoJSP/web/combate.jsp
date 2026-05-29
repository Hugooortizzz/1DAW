<%-- 
    Document   : combate
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

        #centro {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            width: 50%;
        }
        
        #linea{
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
        }
        
        .personajeInfo{
            display: flex;
            flex-direction: row;
        }
        
        #info {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
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

        button, #luchar {
            width: 100px;
            height: 50px;
            margin: 10px;
            border-radius: 20px;
        }

        
        .mostrarImagen{
            width: 300px;
            height: 400px;
        }
    </style>
</head>

<body onload="cambiarPersonaje(0); cambiarPersonaje(1)">
    <div id="layout">
        <aside id="izquierda">
        </aside>
        <div id="centro">
            <div id="linea">
            <div>
            <% for (Personaje p : GestionPersonajes.getPersonajes()){ %>
            <div class="personajeInfo" id="personaje0Info<%= GestionPersonajes.getPersonajes().indexOf(p)%>" style="display: none">
                <div class="imagen">
                <img class="mostrarImagen"
                             src= "<% out.print(p.getImagen()); %>"><br>
            </div>
            <div id="info">
                        
                        <p><b>Nombre: </b><% out.print(p.getNombre()); %></p>
                        <input type="hidden" name="nombre" value="<% out.print(p.getImagen()); %>">
                        <p><b>Estilos de combate:</b></p><dt><% 
                                for(int i = 0; i< p.getEstiloCombate().length; i++){
                                    out.print("<dd>" + p.getEstiloCombate()[i] + "</dd>");
                                }%>
                        </dt>
                            <p><b>Poder: </b><% out.print(p.getPoder()); %></p>
            </div>
            </div>
            <%} %>
            <div>   
                           <button id="moverIzquierda" onclick="cambiarIzquierda(0)"><</button><button id="moverDerecha" onclick="cambiarDerecha(0)">></button>
            </div>
            </div>
            <img width="200px" src="https://static.vecteezy.com/system/resources/thumbnails/028/824/564/small/vs-letters-versus-png.png">
             <div>
            <% for (Personaje p : GestionPersonajes.getPersonajes()){ %>
            <div class="personajeInfo" id="personaje1Info<%= GestionPersonajes.getPersonajes().indexOf(p)%>" style="display: none">
                <div class="imagen">
                <img class="mostrarImagen"
                             src= "<% out.print(p.getImagen()); %>"><br>
            </div>
            <div id="info">
                        
                        <p><b>Nombre: </b><% out.print(p.getNombre()); %></p>
                        <input type="hidden" name="nombre" value="<% out.print(p.getImagen()); %>">
                        <p><b>Estilos de combate:</b></p><dt><% 
                                for(int i = 0; i< p.getEstiloCombate().length; i++){
                                    out.print("<dd>" + p.getEstiloCombate()[i] + "</dd>");
                                }%>
                        </dt>
                            <p><b>Poder: </b><% out.print(p.getPoder()); %></p>
            </div>
            </div>
            <%} %>
            <div>   
                           <button id="moverIzquierda" onclick="cambiarIzquierda(1)"><</button><button id="moverDerecha" onclick="cambiarDerecha(1)">></button>
            </div>
            </div>
        </div>
            <form action="resultadoCombate.jsp" method="post">
                <input type="hidden" id="nombrePersonaje0">
                <input type="hidden" id="nombrePersonaje1">
                <input type="submit" id="luchar" value="Luchar" />
            </form>
            <a href="index.jsp"><button>Volver</button></a>
            </div>
            
        <aside id="derecha">
        </aside>
            
    </div>
            <script type="text/javascript">
                let indice = [0, 0];
                let limite = <% out.println(GestionPersonajes.getPersonajes().size()); %>
    
                function cambiarPersonaje(nPersonaje){
                    let personaje = document.getElementById("personaje" + nPersonaje + "Info" + indice[nPersonaje]);
                    
                    personaje.style.display = "inline";
                }

                    
                function cambiarDerecha(nPersonaje){
                    if(indice[nPersonaje] < limite -1){
                        document.getElementById("personaje" + nPersonaje + "Info" + indice[nPersonaje]).style.display = "none";
                    
                        indice[nPersonaje] ++;

                        cambiarPersonaje(nPersonaje);
                    }

                }
                
                function cambiarIzquierda(nPersonaje){
                    if(indice[nPersonaje] > 0){
                        document.getElementById("personaje" + nPersonaje + "Info" + indice[nPersonaje]).style.display = "none";
                    
                        indice[nPersonaje] --;

                        cambiarPersonaje(nPersonaje);
                    }
                }
            </script>
</body>

</html>
