<%-- 
    Document   : lista.jsp
    Created on : May 11, 2017, 5:17:48 PM
    Author     : t4nus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/listaFormatacao.css" type="text/css">
    </head>
    <body>
        <h1>Lista de Autores</h1>
        
            <table>
                <tr>
                <th>|Nome|</th>
                <th>|Data de Nascimento|   </th>
                <th>|País de Origem|   </th>
                <th>|Descrição|</th>
                </tr>
                    <c:forEach items="${listaAutores}" var="autor">
                    <tr>
                        <td>| <c:out value="${autor.nome}" /> |</td>
                        <td>| <c:out value="${autor.dataNascString}" /> |</td>
                        <td>| <c:out value="${autor.paisOrigem}" /> |</td>
                        <td>| <c:out value="${autor.descricao}"/> |</td>
                    </tr>
                </c:forEach>
            </table>
        


    </body>
</html>
<%--
estruturas de repetição e seleção dentro do jstl
--%>