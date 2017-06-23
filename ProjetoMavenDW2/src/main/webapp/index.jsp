<%-- 
    Document   : index
    Created on : 26/05/2017, 16:03:52
    Author     : Ana Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autenticação</title>
        <link rel="stylesheet" href="CSS/index.css" type="text/css">
    </head>
    <body>
        <form action="Login" method="post" >
            <div align="left">
                Login:
                <input type="text" name="login"> <br/>
            </div>
            <div align="left">
                Senha:
                <input type="password" name="senha"> <br/>
            </div>
            <button type="submit">Enviar</button>
            <div>
                Não tem cadastro como autor?
                <a href="JSPs/autor.jsp">Cadastre-se</a>
            </div>
        </form>
    </body>
</html>
