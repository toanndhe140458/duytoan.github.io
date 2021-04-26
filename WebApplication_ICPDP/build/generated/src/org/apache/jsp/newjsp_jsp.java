package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                width: 1440px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("\n");
      out.write("                height : 150px;\n");
      out.write("                background:  #cb7802; \n");
      out.write("            }\n");
      out.write("            header img{\n");
      out.write("                padding-left: 30px; \n");
      out.write("            }\n");
      out.write("            nav {\n");
      out.write("                height: 50px;\n");
      out.write("                background: #272f54;\n");
      out.write("            }\n");
      out.write("            nav .menu ul{\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            nav .menu ul li{\n");
      out.write("                float: left;\n");
      out.write("                line-height: 50px;\n");
      out.write("                padding: 0 15px;\n");
      out.write("                 border: #272f54;\n");
      out.write("            }\n");
      out.write("            nav .menu ul li a{\n");
      out.write("                color: #fff;\n");
      out.write("                font-size :16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("               border: #fff\n");
      out.write("            }\n");
      out.write("            nav .search{\n");
      out.write("                line-height: 50px;\n");
      out.write("                float: right;\n");
      out.write("                margin-right: 30px;\n");
      out.write("                font-size :16px;\n");
      out.write("            }\n");
      out.write("            article h3{\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 15px 0;\n");
      out.write("                color: #272f54;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-weight: bold;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            article .list_event .news_event{\n");
      out.write("                width: 28%;\n");
      out.write("                padding: 2%;\n");
      out.write("                float: left;\n");
      out.write("                border: 2px solid #ccc;\n");
      out.write("                margin-right: 1%;\n");
      out.write("            }\n");
      out.write("            article .list_event .news_event h4{\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: tomato;\n");
      out.write("            }\n");
      out.write("            article .list_event .news_event img{\n");
      out.write("                margin: 10px auto;\n");
      out.write("            }\n");
      out.write("            article .list_event .news_event .content{\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            footer{\n");
      out.write("                width: 1440px;\n");
      out.write("                background: #272f54;\n");
      out.write("                line-height: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <a href=\"#\"><img src=\"WEB-INF/img/fpt_university.png\" alt=\"\"/></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <div class =\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"#\">Báo cáo hàng tháng</a></li>\n");
      out.write("                        <li><a href=\"#\">Sự kiện</a></li>\n");
      out.write("                        <li><a href=\"#\">Quản lí CLB</a></li>\n");
      out.write("                        <li><a href=\"#\">Nhân sự</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>  \n");
      out.write("                <div class =\"search\">\n");
      out.write("                    <input type=\"search\" placeholder=\"Search...\" >\n");
      out.write("                    <button>Tìm kiếm</button>\n");
      out.write("                </div>  \n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <article>\n");
      out.write("                <h3>Sự kiện mới</h3>\n");
      out.write("                <div class=\"list_event\">\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp</h4> \n");
      out.write("                        <img src=");
      out.print(request.getContextPath()+"/img/IMG_5407.jpg");
      out.write(" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp2</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp3</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/> \n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"clear: both;\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("            <article>\n");
      out.write("                <h3>Sự kiện mới</h3>\n");
      out.write("                <div class=\"list_event\">\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp2</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp3</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/> \n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"clear: both;\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("            <article>\n");
      out.write("                <h3>Sự kiện mới</h3>\n");
      out.write("                <div class=\"list_event\">\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp2</h4> \n");
      out.write("                        <img src=\"../IMG_5407.jpg\" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"news_event\">\n");
      out.write("                        <h4>iGo Camp3</h4> \n");
      out.write("                        <img src=\"WEB-INF/img/IMG_5407.jpg\" alt=\"\"/> \n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            iGo Camp được tổ chức bởi một nhóm sinh viên rảnh không có việc gì làm\n");
      out.write("                            sinh viên được tham gia trải nghiệm nhịn cơm, bỏ đói đến chết\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"clear: both;\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("            <footer>\n");
      out.write("                Phòng Hợp tác Quốc tế & Phát triển Cá nhân ICPDP FPTU\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
