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
	<link rel="stylesheet" href="registro.css" type="text/css"/>
</head>

<body>
	<h1> REGISTRE SEU ARTIGO E VISUALIZE OS QUE JÁ ESTÃO REGISTRADOS </h1>
	<h2> </h2>
		<form>
		<h3>
		<div align="left">
			Título do artigo:
			<input ype="text" name="titulo_artigo"> <br/>
		</div>
		<div align="left">
			Nome do autor:
			<input type="text" name="nome_autor"> <br/>
		</div>
		<div align="left">
			Ano de publicação:
			<input type="text" name="ano_publicacao"> <br/>
		</div>
		<div align="left">
			Gênero:
			<input type="text" name="genero"> <br/>
		</div>
		<div align="left">
			Descrição:
			<input type="text" name="descricao"> <br/>
		</div>
		<div align="left">
			Revista em que foi publicado:
			<input type="text" name="revista"> <br/>
		</div>
		<div align="center" class="button">
			<button type="submit"> Registrar artigo</button> <br/>
		</div>
		<div align="center" class="button">
			<button type="submit"> Visualizar artigos</button>
		</div>
		</h3>
		</form>
	
</div>

</body>

</html>