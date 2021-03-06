<%-- 
    Document   : Report
    Created on : Mar 16, 2021, 11:40:13 AM
    Author     : Nhat Anh PC
--%>

<%@page import="Model.Club"%>
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
                width: 100%;
                background: #ff9933;
                line-height: 40px;
                text-align: center;
                color: #272f54;
                font-size: 20px;
                font-weight: 20px;
                bottom : 0;
                height : 40px;

            }  
        </style>
        <%
            ArrayList<Club> clubs = (ArrayList<Club>) request.getAttribute("clubs");

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
            <article  class="list">
                <form action="add_Club.jsp" method="get">
                    <button class="btn">Th??m</button>  
                    <button class="btn" formaction="club_edit.jsp">S???a</button>  
                    <button class="btn" formaction="delete_Club.jsp">X??a</button> 
                </form>
                
               
               
               
                <table style=" border: #272f54; width: 100%;padding: 8px; line-height: 50px;" class="tabled" border="1">
                    <thead>
                        <tr style = "background: #ff9933; margin-top: 100px; color: #fff " class="table-d">
                            <th scope="col" class="cot">ID</th>
                            <th scope="col" class="cot">T??n CLB</th>
                            <th scope="col" class="cot">Ch??? nhi???m</th>
                            <th scope="col" class="cot">S??? l?????ng th??nh vi??n</th>
                            <th scope="col" class="cot">Ho???t ?????ng ch??nh</th>
                            <th scope="col" class="cot">Logo</th>
                            <th scope="col" class="cot">Ng??y th??nh l???p</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (int i = 0; i < clubs.size(); i++) {%>
                        <tr>
                            <th scope="row"><%=clubs.get(i).getClubID()%></th>
                            <td><%=clubs.get(i).getClubName()%></td>
                            <td><%=clubs.get(i).getPresidentName()%></td>
                            <td><%=clubs.get(i).getNumberMember()%></td>
                            <td><%=clubs.get(i).getClubGoal()%></td>
                            <td><%=clubs.get(i).getLogoUrl()%></td>
                            <td><%=clubs.get(i).getDobClub()%></td>
                        </tr>
                        <%}
                        %>
                    </tbody>
                </table>
            </article>
            <footer>
                Ph??ng H???p t??c Qu???c t??? & Ph??t tri???n C?? nh??n ICPDP FPTU
            </footer>
        </div>
    </body>
</html>
supName
in pput od
supID => SuplierList.get(supid).getName