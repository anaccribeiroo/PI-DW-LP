<%-- 
    Document   : index
    Created on : 27/06/2017, 10:08:45
    Author     : Ana Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Cadastro de Artigos</title>
        <meta charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
        <link href="CSS/estilo.css" rel="stylesheet">
        <script type="text/javascript" src = "../jsScript/plugins/lib/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src = "../jsScript/plugins/dist/jquery.maskedinput.js"></script>
        <script type="text/javascript" src = "../jsScript/javascript.js"></script>
    </head>

    <body>

        <div class="jumbotron" id="jumbo">
            <div class="container text-center">
                <h1>Cadastro de Artigos</h1>
                <p>Texto</p>               
            </div>            
        </div>


        <div class="container">
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <form method="post" action="Login" class="form-horizontal"> 
                        <div class="form-group">
                            <%--<label class ="control-label col-sm-1" for="login">Login:</label>--%>
                            <div class="col-sm-11">
                                <input type="text" required="true" class="form-control" name = "login" placeholder="Login">
                            </div>
                        </div>

                        <div class="form-group">
                            <%--<label class ="control-label col-sm-1" for="senha">Senha:</label>--%>
                            <div class="col-sm-11">
                                <input type="password" required="true" class="form-control" name = "senha" placeholder="Senha">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="container">
                                <button type="submit" class="btn btn-default"> Enviar </button>
                            </div>
                        </div>

                        <div>
                            <div class="form-group">
                                <div class="container">
                                    <a href="JSPs/autor.jsp">Cadastre-se como autor</a>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-sm-3"></div>
            </div>
        </div>
    </body>
</html>
