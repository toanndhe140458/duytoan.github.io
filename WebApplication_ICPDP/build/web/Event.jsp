<%-- 
    Document   : Report
    Created on : Mar 16, 2021, 11:40:13 AM
    Author     : Nhat Anh PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Model.Event"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

            article .eventICPDP{
                border: 2px solid black;
                background-color: #ff9933;
                color: #fff;
                padding: 14px 28px;
                margin-left: 600px;
                font-size: 16px;
                cursor: pointer
            }
            article .eventCLB{
                border: 2px solid black;
                background-color: #ff9933;
                color: #fff;
                padding: 14px 28px;
                font-size: 16px;

            }
            /* thi???t l???p style cho th??? a */
            .pagination  {
                color: black;
                margin: auto auto;
                padding: 8px 16px;
                text-decoration: none;
            }

            /* thi???t l???p style cho class active */
            .pagination a.active {
                background-color: dodgerblue;
                color: white;
            }
            /* th??m m??u n???n khi ng?????i d??ng hover v??o class kh??ng active */
            .pagination a:hover:not(.active) {
                background-color: #ddd;
            }
             article {
                 background-image: url('/WebApplication_ICPDP/img/wedding-backgrounds-4.jpg');


            }
            article .option_event{
                margin-left: 340px;
            }
            article tb1 .inf{

                line-height: 50px;
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
                width: 100%;
                background: #ff9933;
                line-height: 50px;
                text-align: center;
                color: #272f54;
                font-size: 20px;
                font-weight: 20px;
            }
        </style>
        <%
            ArrayList<Event> events = (ArrayList<Event>) request.getAttribute("events");

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

            <article style="background-color: #ffcc66;">
              
               <form action="event_add.jsp" method="get">
                    <button class="btn">Th??m</button>  
                    <button class="btn" formaction="event_edit.jsp">S???a</button>  
                    <button class="btn" formaction="event_delete.jsp">X??a</button> 
                </form>
                </br>

                <table class="tb1" border="1" style="margin: auto auto; ">
                     <tr style="line-height: 50px;background: #ff9933;color: #fff;">
                            <th> ???n ph???m </th>
                            <th> Th??ng tin </th>
                         
                        </tr>
                    <c:forEach items="${events}" var ="o" >
                        
                        <tr>
                            <th rowspan="7"><img style="height: 400px;" src=" ${o.URL }" alt=""/>
                            </th>
                            <td>ID:   ${o.eventID }</td>
                        </tr>
                        <tr>
                            <td>T??n s??? ki???n :   ${o.eventName }</td>
                        </tr>
                        <tr>
                            <td>Tr?????ng Ban t??? ch???c :   ${o.hostName }</td>
                        </tr>
                        <tr>
                            <td>Ng??y t??? ch???c :   ${o.dateEvent }</td>
                        </tr>
                        <tr>
                            <td>?????a ??i???m di???n ra :   ${o.placeEvent }</td>
                        </tr>
                        <tr>
                            <td>Chi ph?? ch????ng tr??nh :   ${o.budgetEvent }</td>
                        </tr>
                        <tr>
                            <td>N???i dung ch??nh:   ${o.contentEvent }</td>
                        </tr>
                        
                    </c:forEach>


                </table>
                <div class="pagination" style="margin-left: 620px;">
                    <a href="#">??</a>
                    <a href="#">1</a>
                    <a href="#">2</a>
                    <a href="#">3</a>
                    <a href="#">4</a>
                    <a href="#">5</a>
                    <a href="#">6</a>
                    <a href="#">??</a>
                </div>
            </article>
            <footer>
                Ph??ng H???p t??c Qu???c t??? & Ph??t tri???n C?? nh??n ICPDP FPTU
            </footer>
        </div>
    </body>
</html>