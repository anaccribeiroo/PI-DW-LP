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
    </head>
    <body>
        <h1>Digite uma chave, caso deseje excluir um autor.</h1>

        <form action="../BuscaChave" method="post" >
            <div>
                Chave:
                <input type="text" name="chave"> <br/>
            </div>
            <button type="submit">Buscar por chave</button>
            <div>
                <button type="submit" formaction="../ExcluirAutor">Excluir Autor</button>
            </div>
        </form>
    </body>
</html>
