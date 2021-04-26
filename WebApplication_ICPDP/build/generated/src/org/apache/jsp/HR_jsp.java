package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HR_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            *{\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: \"Roboto\", sans-serif;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("\n");
      out.write("                height : 150px;\n");
      out.write("                background:  #ffcc66; \n");
      out.write("            }\n");
      out.write("            header img{\n");
      out.write("                margin-top: 5px;\n");
      out.write("                height : 111.5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            nav {\n");
      out.write("                height: 50px;\n");
      out.write("                background: #ff9933;\n");
      out.write("            }\n");
      out.write("            nav .menu ul{\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            nav .menu ul li{\n");
      out.write("                float: left;\n");
      out.write("                line-height: 50px;\n");
      out.write("                padding: 0 15px;\n");
      out.write("                border: #272f54;\n");
      out.write("            }\n");
      out.write("            nav .menu ul li a{\n");
      out.write("                color: #fff;\n");
      out.write("                font-size :16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border: #fff;\n");
      out.write("                margin-right: 50px;\n");
      out.write("            }\n");
      out.write("            nav .search{\n");
      out.write("                line-height: 50px;\n");
      out.write("                float: left;\n");
      out.write("                margin-right:   10px;\n");
      out.write("                font-size :20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav .login{\n");
      out.write("                line-height: 40px;\n");
      out.write("                float: right;\n");
      out.write("                margin-right:   30px;\n");
      out.write("\n");
      out.write("                font-size :20px;\n");
      out.write("            }\n");
      out.write("            article .btn {\n");
      out.write("                background-color: #ff9933; /* Green */\n");
      out.write("                border: 1;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            footer{\n");
      out.write("                position : absolute;\n");
      out.write("                bottom : 0;\n");
      out.write("                height : 40px;\n");
      out.write("                margin-top : 40px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: #ff9933;\n");
      out.write("                line-height: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #272f54;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <a href=\"#\"><img  src=\"/WebApplication_ICPDP/img/11.png\" alt=\"\"/></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <div class =\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Home.jsp\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"Report.jsp\">Báo cáo hàng tháng</a></li>\n");
      out.write("                        <li><a href=\"Event.jsp\">Sự kiện</a></li>\n");
      out.write("                        <li><a href=\"ClubManagement.jsp\">Quản lí CLB</a></li>\n");
      out.write("                        <li><a href=\"HR.jsp\">Nhân sự</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class =\"login\">\n");
      out.write("                    <form action=\"Login.jsp\">\n");
      out.write("                        <label>Nguyễn Duy Toản </label>|\n");
      out.write("\n");
      out.write("                        <button>Logout</button>   \n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>  \n");
      out.write("                <div class =\"search\">\n");
      out.write("                    <input type=\"search\" placeholder=\"Search...\" >\n");
      out.write("                    <button>Tìm kiếm</button>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <article>\n");
      out.write("                <button class=\"btn\">Thêm</button>\n");
      out.write("                <button class=\"btn\">Sửa</button>\n");
      out.write("                <button class=\"btn\">Xóa</button>\n");
      out.write("                <table style=\" border: #272f54; width: 100%;padding: 8px; line-height: 50px;\" class=\"tabled\" border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr style = \"background: #ff9933; margin-top: 100px; color: #fff \" class=\"table-d\">\n");
      out.write("                            <th scope=\"col\" class=\"cot\">STT</th>\n");
      out.write("                            <th scope=\"col\" class=\"cot\">Họ và tên</th>\n");
      out.write("                            <th scope=\"col\" class=\"cot\">Thông tin</th>\n");
      out.write("                            <th scope=\"col\" class=\"cot\">Ngày sinh</th>\n");
      out.write("                            <th scope=\"col\" class=\"cot\">Vị trí hiện tại</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">1</th>\n");
      out.write("                            <td>Mark</td>\n");
      out.write("                            <td>Otto</td>\n");
      out.write("                            <td>@mdo</td>\n");
      out.write("                            <td></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">1</th>\n");
      out.write("                            <td>Mark</td>\n");
      out.write("                            <td>Otto</td>\n");
      out.write("                            <td>@mdo</td>\n");
      out.write("                            <td></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </article>\n");
      out.write("\n");
      out.write("            <footer style=\"\">\n");
      out.write("                Phòng Hợp tác Quốc tế & Phát triển Cá nhân ICPDP FPTU\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
