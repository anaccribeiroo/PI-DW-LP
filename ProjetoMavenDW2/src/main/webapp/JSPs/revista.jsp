<%-- 
    Document   : revista
    Created on : 02/06/2017, 09:47:22
    Author     : Ana Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Revista de Publicação do Artigo</title>
    </head>
    <body>
        <h1>CADASTRO DA REVISTA DE PUBLICAÇÃO DO ARTIGO</h1>
        <form action="RevistaServlet" method="post" >
            <div align="left">
                Nome da Revista:
                <input type="text" name="nome"> <br/>
            </div>
            <div align="left">
                País:
                <input type="text" name="pais"> <br/>
            </div>
            <div align="left">
                Descrição:
                <input type="text" name="descricao"> <br/>
            </div>

            <div align="left" class="button">
                <button type="submit"> Registrar Revista </button>
            </div>
            <div align="center"><a href="genero.jsp"<button>Próximo</button></a></div>
           
        </form>
    </body>
</html>
