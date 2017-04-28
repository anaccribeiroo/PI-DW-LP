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
            <h1> REGISTRE SEU ARTIGO E VISUALIZE OS QUE JÁ ESTÃO REGISTRADOS </h1>
            <img src="Imagens/artigo.jpg">
        </div>
    <form action="NovoServlet" method="post" >
		<h3>
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
                        <button type="submit"> Registrar artigo </button>
		</div>
		<div align="center" class="button">
                    <a href= "JSPs/segundoindex.jsp"> <button type="submit"> Visualizar artigos</button> </a>
		</div>
		</h3>
		</form>
	
</div>

</body>

</html>
