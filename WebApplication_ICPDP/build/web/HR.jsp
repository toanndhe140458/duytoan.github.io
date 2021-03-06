<%-- 
    Document   : Report
    Created on : Mar 16, 2021, 11:40:13 AM
    Author     : Nhat Anh PC
--%>

<%@page import="Model.Hr"%>
<%@page import="Model.Club"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
            *{
                padding: 0;
                margin: 0;
                font-family: "Roboto", sans-serif;
            }
            .container{
                width: 100%;
                margin: 0 auto;
            }
            header{

                height : 150px;
                background:  #ffcc66; 
            }
            header img{
                margin-top: 5px;
                height : 111.5px;

            }
            nav {
                height: 50px;
                background: #ff9933;
            }
            nav .menu ul{
                list-style: none;
            }
            nav .menu ul li{
                float: left;
                line-height: 50px;
                padding: 0 15px;
                border: #272f54;
            }
            nav .menu ul li a{
                color: #fff;
                font-size :16px;
                text-decoration: none;
                border: #fff;
                margin-right: 50px;
            }
            nav .search{
                line-height: 50px;
                float: left;
                margin-right:   10px;
                font-size :20px;
            }

            nav .login{
                line-height: 40px;
                float: right;
                margin-right:   30px;

                font-size :20px;
            }
             article {
                 background-image: url('/WebApplication_ICPDP/img/wedding-backgrounds-4.jpg');


            }
            article .btn {
                background-color: #ff9933; /* Green */
                border: 1;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
            }
            footer{
             
                height : 40px;
                width: 100%;
                background: #ff9933;
                line-height: 40px;
                text-align: center;
                color: #272f54;
                font-size: 20px;
                font-weight: 20px;
            }
        </style>
        <%
            ArrayList<Hr> hrs = (ArrayList<Hr>) request.getAttribute("hrs");

        %>
    </head>
    <body>
        <div class="container">
            <header>
                <a href="#"><img  src="/WebApplication_ICPDP/img/11.png" alt=""/></a>
            </header>
            <nav>
                <div class ="menu">
                    <ul>
                        <li><a href="home">Trang ch???</a></li>
                        <li><a href="report">??i???m phong tr??o</a></li>
                        <li><a href="event">S??? ki???n</a></li>
                        <li><a href="club">Qu???n l?? CLB</a></li>
                        <li><a href="hr">Nh??n s???</a></li>
                    </ul>
                </div>
                <div class ="login">
                    <form action="Login.jsp">
                        <label>Nguy???n Duy To???n </label>|
                        <button>Logout</button>   
                    </form>
                </div>  
                <div class ="search">
                    <input type="search" placeholder="Search..." >
                    <button>T??m ki???m</button>
                </div>
            </nav>
            <article>
               <form action="hr_add.jsp" method="get">
                    <button class="btn">Th??m</button>  
                    <button class="btn" formaction="hr_edit.jsp">S???a</button>  
                    <button class="btn" formaction="hr_delete.jsp">X??a</button> 
                </form>
                <table style=" border: #272f54; width: 100%;padding: 8px; line-height: 50px;" class="tabled" border="1">
                    <thead>
                        <tr style = "background: #ff9933; margin-top: 100px; color: #fff " class="table-d">
                            <th scope="col" class="cot">STT</th>
                            <th scope="col" class="cot">H??? v?? t??n</th>
                            <th scope="col" class="cot">Th??ng tin</th>
                            <th scope="col" class="cot">Ng??y sinh</th>
                            <th scope="col" class="cot">V??? tr?? hi???n t???i</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (int i = 0; i < hrs.size(); i++) {%>
                        <tr>
                             <th scope="row"><%=i + 1%></th>
                            <td><%=hrs.get(i).getHrName()%></td>
                            <td><%=hrs.get(i).getHrDetail()%></td>
                            <td><%=hrs.get(i).getHrDob()%></td>
                            <td><%=hrs.get(i).getHrJob()%></td>
                        </tr>
                        <%}
                        %>
                    </tbody>
                </table>
            </article>
            <footer style="">
                Ph??ng H???p t??c Qu???c t??? & Ph??t tri???n C?? nh??n ICPDP FPTU
            </footer>
        </div>
    </body>
</html>