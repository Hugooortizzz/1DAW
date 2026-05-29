<%-- 
    Document   : index
    Created on : May 20, 2026, 1:33:56 PM
    Author     : hugo
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="personajes.GestionPersonajes"%>
<%@page import="personajes.Personaje"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nuevo Personaje</title>
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

        #centro{
            width: 50%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        #mostrar {
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
            width: 50%;
            background-color: white;
        }

        #menu{
            width: 50%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            margin-left: 40px;
        }

        #menu div {
            margin: 10px 0;
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

        #mostrarImagen{
            width: 300px;
            height: 400px;
            border: 1px solid black;
        }

    </style>
</head>

<body>
    <% 
        int indice = GestionPersonajes.buscarIndice(request.getParameter("nombre"));
    %>
    <div id="layout">
        <aside id="izquierda">
        </aside>
        <div id="centro">
            <h1>Editar Personaje</h1>
            <div id="mostrar">
            
            <div id="imagen">
                <img id="mostrarImagen" src="https://imgs.search.brave.com/XtJK0itkXwynQ-cJdo14VYm_cLaHC7nT796fBajKpu4/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMudW5zcGxhc2gu/Y29tL3Bob3RvLTE3/NzU1MzQ3NzgzNzUt/M2YyMzVjNDY2YzU4/P2ZtPWpwZyZxPTYw/Jnc9MzAwMCZhdXRv/PWZvcm1hdCZmaXQ9/Y3JvcCZpeGxpYj1y/Yi00LjEuMCZpeGlk/PU0zd3hNakEzZkRC/OE1IeHpaV0Z5WTJo/OE1qQjhmSEJzWVds/dUpUSXdkMmhwZEdW/OFpXNThNSHg4TUh4/OGZEQT0">
            </div>
            <div id="menu">
                <form action="resultadoEditar.jsp" method="post">
                <div>
                    Nombre: <input type="text" name="nombre" value="<%out.print(GestionPersonajes.getPersonajes().get(indice).getNombre());%>">
                    <!-- input oculto con el nombre original por si el usuario lo cambia, para poder identificar cual era al enviar el formulario -->
                    <input type="hidden" name="nombreOriginal" value="<%out.print(GestionPersonajes.getPersonajes().get(indice).getNombre());%>"
                </div>
                <div>
                    Estilo de combate:<br>
                    <input type="checkbox" name="estiloCombate" value="Artes Marciales" <% if (Arrays.asList(GestionPersonajes.getPersonajes().get(indice).getEstiloCombate()).contains("Artes Marciales")){ out.print("checked");} %>> Artes Marciales<br>
                    <input type="checkbox" name="estiloCombate" value="Armas" <% if (Arrays.asList(GestionPersonajes.getPersonajes().get(indice).getEstiloCombate()).contains("Armas")){ out.print("checked");} %>> Armas<br>
                    <input type="checkbox" name="estiloCombate" value="Fruta del Diablo" <% if (Arrays.asList(GestionPersonajes.getPersonajes().get(indice).getEstiloCombate()).contains("Fruta Del Diablo")){ out.print("checked");} %>> Fruta del Diablo<br>
                    <input type="checkbox" name="combate" value="Haki" <% if (Arrays.asList(GestionPersonajes.getPersonajes().get(indice).getEstiloCombate()).contains("Haki")){ out.print("checked");} %>> Haki
                </div>
                <div>
                    Escala de poder: <input type="number" name="poder" min="0" max="100" value="<%out.print(GestionPersonajes.getPersonajes().get(indice).getPoder());%>">
                </div>
                <div>
                    Imagen: <input type="text" id="url" name="imagen"  value="<%out.print(GestionPersonajes.getPersonajes().get(indice).getImagen());%>" onblur="cambiarImagen()" onkeyup="cambiarImagen()">
                </div>
                <div>
                    <a href="mostrar.jsp"><input type="button" class="finales" id="volver" value="Volver"></a>
                    <input type="submit" class="finales" id="enviar" value="Enviar" />
                </form>
                </div>
            </div>
        </div>
        </div>
    </div>
        

        <aside id="derecha">
        </aside>
    </div>


    <script type="text/javascript">
        window.onload = function(){
            cambiarImagen();
        }
        
        function cambiarImagen(){
            let imagen = document.getElementById("mostrarImagen");
            let url = document.getElementById("url").value;
            
            imagen.src = url;
            
            //Esto controla que la imagen no pueda dar error, si no que si no encuentra una url valida, salga la imagen gris por defecto
            imagen.onerror = function(){
                imagen.src = "https://imgs.search.brave.com/XtJK0itkXwynQ-cJdo14VYm_cLaHC7nT796fBajKpu4/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMudW5zcGxhc2gu/Y29tL3Bob3RvLTE3/NzU1MzQ3NzgzNzUt/M2YyMzVjNDY2YzU4/P2ZtPWpwZyZxPTYw/Jnc9MzAwMCZhdXRv/PWZvcm1hdCZmaXQ9/Y3JvcCZpeGxpYj1y/Yi00LjEuMCZpeGlk/PU0zd3hNakEzZkRC/OE1IeHpaV0Z5WTJo/OE1qQjhmSEJzWVds/dUpUSXdkMmhwZEdW/OFpXNThNSHg4TUh4/OGZEQT0";
            };
        }
    </script>
</body>

</html>
