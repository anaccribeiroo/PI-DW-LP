<%-- 
    Document   : autor
    Created on : 31/03/2017, 10:49:42
    Author     : Ana Ribeiro
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Registro de Autor </title>
        <link rel="stylesheet" href="CSS/autor.css" type="text/css">
        <script type="text/javascript" src = "../js/plugins/lib/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src = "../js/plugins/dist/jquery.maskedinput.js"></script>
        <script type="text/javascript" src = "../js/javascript.js"></script>

    </head>

    <body>
        <div id="image">
            <h1>CADASTRO DO AUTOR</h1>
            <%--<img src="Imagens/artigo.jpg">--%>
        </div>

        <form action="../AutorServlet" method="post">
            <div alig
                 n="left">
                Login:
                <input type="text" name="login"> <br/>
            </div>
            <div align="left">
                Senha:
                <input type="password" name="senha"> <br/>
            </div>
            <div align="left">
                Nome:
                <input type="text" name="nome_autor"> <br/>
            </div>
            <div align="left">
                Data de Nascimento:
                <input type="text" name="data_nasc" id="date"> <br/>
            </div>
            <div align="left">
                País de Origem:
                <input type="text" name="pais_origem"> <br/>
            </div>
            <div align="left">
                Informações:
                <input type="text" name="descricao"> <br/>
            </div>

            <div align="left" class="button">
                <button type="submit">Registrar Autor</button>
            </div>

        </form>

        <form action="../AutorServlet" method="get">
            <button type="submit">Visualizar Autores</button>
        </form>



    </body>

</html>
<%--http://rafaelcouto.com.br/validando-formularios-com-javascript/--%>
