<%-- 
    Document   : autorAdmin
    Created on : 20/06/2017, 16:27:32
    Author     : Ana Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página do Administrador</title>
        <link href="/mavenproject1/CSS/estilo.css" rel="stylesheet">
    </head>
    <body id="jumbo">
        <h1 align="center">Página do Administrador</h1>

        <form action="../BuscaChave" method="post">
            <div class="centro negrito">
                ID do Artigo:
                <input type="text" name="chave"> <br/>
            </div>
            <br/>
            <div class="centro">
                <button type="submit">Buscar por chave</button>
            </div>
            
        </form>
    </body>
</html>
