
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Countings</title>
    </head>
    <body>
        <h1>Countings</h1>
        <table style="border-style: solid">
            <tr>
                <td>ID</td>
                <td>Amount</td>
                <td>Human ID</td>
                <td>Parent ID</td>
            </tr>
            <c:forEach var="counting" items="${countings}">
                <tr>
                    <td><a href="/countings/${counting.id}">${counting.id}</a></td>
                    <td>${counting.amount}</td>
                    <td>${counting.humanId}</td>
                    <td>${counting.parentId}</td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <a href="add-counting">New counting</a>
    </body>
</html>