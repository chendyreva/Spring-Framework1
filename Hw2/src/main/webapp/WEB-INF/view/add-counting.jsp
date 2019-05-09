<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add payment</title>
    </head>
    <body>
        <h1>New payment</h1>
        <f:form method="POST" commandName="counting" action="countings">
            <table>
                <tr>
                    <td>
                        <i>Amount:</i>
                    </td>
                    <td>
                        <f:input path="amount"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <i>Human ID:</i>
                    </td>
                    <td>
                        <f:input path="humanId"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <i>Parent ID:</i>
                    </td>
                    <td>
                        <f:input path="parentId"/>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit"/></td>
                </tr>
            </table>
        </f:form>
    </body>
</html>