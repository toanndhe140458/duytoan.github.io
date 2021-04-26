<%-- 
    Document   : addClub
    Created on : Mar 29, 2021, 12:28:38 AM
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
    </head>
    <body>
        <div class="container">
            <header>
                <a href="#"><img  src="/WebApplication_ICPDP/img/11.png" alt=""/></a>



            </header>

            <nav>
                <div class ="menu">
                    <ul>
                        <li><a href="home">Trang chủ</a></li>
                        <li><a href="report">Điểm phong trào</a></li>
                        <li><a href="event">Sự kiện</a></li>
                        <li><a href="club">Quản lí CLB</a></li>
                        <li><a href="hr">Nhân sự</a></li>
                    </ul>
                </div>
                <div class ="login">
                    <form action="Login.jsp">
                        <label>Nguyễn Duy Toản </label>|

                        <button>Logout</button>   

                    </form>
                </div> 
                <div class ="search">
                    <input type="search" placeholder="Search..." >
                    <button>Tìm kiếm</button>
                </div>
            </nav>
            <article  class="list">
                </br></br></br>
                 <h1 style="margin-left:  600px;">Sửa thông tin</h1>
                </br>
               
                <form action="reportEdit" method="POST">
                    <table style =" margin: auto auto;"border="1">
                        <tbody>

                            <tr>
                                <td style="line-height: 20px;">ID</td>
                                <td>    <input style =" padding: 12px 10px;" type="text" name="studentID" value="" />   </td>
                            </tr>
                            <tr>
                                <td style="line-height: 20px;">Họ và tên</td>
                                <td>    <input style =" padding: 12px 10px; "type="text" name="studentName" value="" /> </td>
                            </tr>
                            <tr>
                                <td style="line-height: 20px;">Chuyên ngành</td>
                                <td>  <input style =" padding: 12px 10px;" type="text" name="studentMajor" value="" />  </td>
                            </tr>
                            <tr>
                                <td style="line-height: 20px;">Club ID</td>
                                <td>   <input style =" padding: 12px 10px;" type="text" name="clubID" value="" />  </td>
                            </tr>
                            <tr>
                                <td>Điểm hoạt động</td>
                                <td>    <input style =" padding: 12px 10px;" type="text" name="point" value="" /> 
                                </td>
                            </tr>
                            
                            </tr>
                        </tbody>

                    </table> </br>
                    <button style="background-color: #ff9933; /* Green */
                            border: 1;
                            margin-left: 640px;
                            color: white;
                            padding: 15px 32px;
                     
                            font-size: 16px;"
                            formaction="reportEdit" type="submit" value="">Lưu thay đổi</button>
                </form>

            </br>
            </article>







            <footer>
                Phòng Hợp tác Quốc tế & Phát triển Cá nhân ICPDP FPTU
            </footer>
        </div>
    </body>
</html>
