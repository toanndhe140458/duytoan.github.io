<%-- 
    Document   : newjsp
    Created on : Mar 15, 2021, 11:04:51 PM
    Author     : Nhat Anh PC
--%>

<%@page import="Model.Event"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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

            article h3{
                text-align: center;
                padding: 15px 0;
                color: #272f54;
                font-size: 20px;
                text-transform: uppercase;
                font-weight: bold;
                background: #ffcc66;
                font-family: sans-serif;
            }
            article .list_event .news_event{
                width: 28%;
                padding: 2%;
                float: left;
                border: 2px solid #ccc;
                margin-right: 0%;
                margin-left: 0.7%;
                background-color: #ffcc66;
            }
            article .list_event .news_event h4{
                font-size: 16px;
                color: tomato;
            }
            article .list_event .news_event img{
                margin: 10px auto;
            }
            article .list_event .news_event .content{
                font-size: 15px;
            }
            footer{
                width: 100%;
                background: #ff9933;
                line-height: 80px;
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
            <div>
                <img style="height: 1012px;" src="/WebApplication_ICPDP/img/demnhac.jpg" alt=""/>
            </div>
            <article>
                <h3  style="font-size: 40px; font-family:  monospace; background-color: #ff9933">S??? ki???n m???i</h3>
                <div class="list_event">
                    <% for (int i = 0; i < 3; i++) {%>

                    <div class="news_event">
                        <h4><%= events.get(i).getEventName()%></h4> 
                        <img style="height: 250px" src="<%= events.get(i).getURL()%>" alt=""/>
                        <div onclick="index.html" class="content"><%= events.get(i).getContentEvent()%> </div>
                    </div>
                    <% }%>




                    <div style="clear: both;"></div>
                </div>
            </article>
            <footer>
                Ph??ng H???p t??c Qu???c t??? & Ph??t tri???n C?? nh??n ICPDP FPTU
            </footer>
        </div>
    </body>
</html>

