/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.64
 * Generated at: 2021-05-24 09:45:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class agent_005fstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>HOME PAGE</title>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Kaushan+Script&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Fredericka+the+Great&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Shrikhand&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- animations -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),\r\n");
      out.write("\t\turl(\"images/img_bg_1.jpg\");\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-size: 1370px 950px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav {\r\n");
      out.write("\tbackground-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5));\r\n");
      out.write("\tborder-bottom: 1px solid grey;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("\tborder-top: none;\r\n");
      out.write("\tborder-left: none;\r\n");
      out.write("\tborder-right: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li:hover {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tcolor: orange;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-md navbar-dark fixed-top\">\r\n");
      out.write("\t<div class=\"container\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\" collapse navbar-collapse \" id=\"go\">\r\n");
      out.write("\t\t\t<div class=\"ml-auto\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t<a href=\"agent_home.jsp\" class=\" nav-link \"  ><li id=\"list2\" class=\"nav-item \" style=\"color:orange;\">HOME</li></a>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"dropdown \" >\r\n");
      out.write("\t\t\t\t\t\t<a class=\" nav-link\"><li class=\"nav-item dropdown-toggle\" id=\"list\" data-toggle=\"dropdown\" data-target=\"#down2\"><span class=\"caret\">VIEW</span></li></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown-menu\" id=\"down2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item \" onclick=\"comp()\"><b>Completed Requests</b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" font=\"blod\" href=\"agent_status.jsp\"><b>View All food status</b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item \" onclick=\"orp()\"><b>View OrphanHomes</b></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"help.jsp\" class=\" nav-link\" target=\"_blank\"><li class=\"nav-item \">HELP</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"about.jsp\" class=\" nav-link\"><li class=\"nav-item \">ABOUT</li></a>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t<a href=\"agent_login.jsp\"> <button class=\"btn btn-info btn-sm\"> LOGOUT</button></a>\r\n");
      out.write("\t\t\t </nav>\r\n");
      out.write("<br>\r\n");
      out.write("\t<div class=\"container\"  style=\"margin-top:30px;\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<h4 align=\"left\" style=\"color:yellow;\">FOOD STATUS</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-lg-12 table-responsive\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<table class=\"table table-secondary\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<thead class=\"thead-dark \">\r\n");
      out.write("\t\t\t\t\t\t<th>donar_name  &nbsp &nbsp</th> \r\n");
      out.write("\t\t\t\t\t\t<th>user_name  &nbsp &nbsp</th> \r\n");
      out.write("\t\t\t\t\t\t<th> Pickuptime &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>food_quantity &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>food_decription &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Food_Requested address &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Food_Requested Area  &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>donar_mobile &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Alternate_mobile &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Food_Requested Date (YY-MM-DD) &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Status_Of_Request &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Accepted_Agent name &nbsp &nbsp</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Accepted_Agent mobile &nbsp &nbsp </th>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","");
			
			PreparedStatement ps=con.prepareStatement("select * from food_details ");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				String a=rs.getString(1) ;
				String b=rs.getString(2) ;
				String c=rs.getString(3) ;
				String d=rs.getString(4) ;
				String e=rs.getString(5) ;
				String f=rs.getString(6) ;
				String g=rs.getString(7) ;
				String h=rs.getString(8) ;
				String i=rs.getString(9) ;
				String j=rs.getString(10);
				String k=rs.getString(11);
				String l=rs.getString(12);
				String m=rs.getString(13);
				
			
			
			
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(a );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(c );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(d );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(e );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(f );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(g );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(h );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(i );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(j );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td><font color=\"green\"><b>");
      out.print(k );
      out.write("</b></font></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(l );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(m );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\t\t\t</table>\t\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
