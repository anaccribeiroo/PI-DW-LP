<%-- 
    Document   : index
    Created on : 27/06/2017, 10:08:45
    Author     : Ana Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Cadastro de Autor</title>
        <meta charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="/mavenproject1/CSS/bootstrap.min.css" rel="stylesheet">
        <link href="/mavenproject1/CSS/estilo.css" rel="stylesheet">
        <script type="text/javascript" src = "../jsScript/plugins/lib/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src = "../jsScript/plugins/dist/jquery.maskedinput.js"></script>
        <script type="text/javascript" src = "../jsScript/javascript.js"></script>
    </head>

    <body>

        <div class="jumbotron" id="jumbo">
            <div class="container text-center">
                <h1>Cadastro de Autor</h1>               
            </div>            
        </div>


        <div class="container">
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <form method="post" action="../AutorServlet" class="form-horizontal"> 
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
                            <%--<label class ="control-label col-sm-1" for="senha">Nome:</label>--%>
                            <div class="col-sm-11">
                                <input type="text" required="true" class="form-control" name = "nome_autor" placeholder="Nome do Autor">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <%--<label class ="control-label col-sm-1" for="senha">Data de Nascimento:</label>--%>
                            <div class="col-sm-11">
                                <input type="text" required="true" class="form-control" name = "data_nasc" placeholder="Data de Nascimento" id="date">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <%--<label class ="control-label col-sm-1" for="senha">País de Origem</label>--%>
                            <div class="col-sm-11">
                                <input type="text" required="true" class="form-control" name = "pais_origem" placeholder="País de Origem">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <%--<label class ="control-label col-sm-1" for="senha">Descrição</label>--%>
                            <div class="col-sm-11">
                                <input type="text" required="true" class="form-control" name = "descricao" placeholder="Descrição">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="container">
                                <button type="submit" class="btn btn-default">Cadastrar</button>
                            </div>
                        </div>

                    </form>
                </div>
                <div class="col-sm-3"></div>
            </div>
        </div>
    </body>
</html>

