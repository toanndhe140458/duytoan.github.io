<%-- 
    Document   : Login
    Created on : Mar 16, 2021, 11:39:56 AM
    Author     : Nhat Anh PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-image: url('/WebApplication_ICPDP/img/wedding-backgrounds-4.jpg');">
        <form action="login" method="post">
            <h1 style="margin-left: 520px;margin-top: 200px;">Login program</h1>
            <table style="margin-left: 500px;">
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" ></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" ></td>
                </tr>
              
                <tr>
                    <td></td><td><input formaction="login" type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
