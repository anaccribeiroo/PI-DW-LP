<%-- 
    Document   : index
    Created on : 31/03/2017, 10:49:42
    Author     : Ana Ribeiro
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Registro de Artigos </title>
        <link rel="stylesheet" href="CSS/registro.css" type="text/css">
    </head>

    <body>
        <div id="image">
            <h1>REGISTRE UM AUTOR</h1>
            <img src="Imagens/artigo.jpg">
        </div>
        
        <form action="AutorServlet" method="post" >
            <div align="left">
                Nome do Autor:
                <input ype="text" name="nome_autor"> <br/>
            </div>
            <div align="left">
                Data de Nascimento:
                <input type="text" name="data_nasc"> <br/>
            </div>
            <div align="left">
                País de Origem:
                <input type="text" name="pais_origem"> <br/>
            </div>
            <div align="left">
                Informações:
                <input type="text" name="descricao"> <br/>
            </div>

            <div align="center" class="button">
                <button type="submit"> Registrar autor </button>
            </div>
           
        </form>

        <form action="AutorServlet" method="get">
            <button type="submit">Visualizar Autores</button>
        </form>

    </div>

</body>

</html>
