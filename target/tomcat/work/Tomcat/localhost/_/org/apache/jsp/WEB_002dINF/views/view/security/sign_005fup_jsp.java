/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-20 21:47:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.view.security;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Sign Up</title>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS  -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!--  Scripts  -->\r\n");
      out.write("  <script src=\"https://momentjs.com/downloads/moment.js\"></script>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>  \r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js\"></script> \r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/flatpickr\"></script>\r\n");
      out.write("  <script src=\"https://unpkg.com/axios/dist/axios.min.js\"></script>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  #sign_up_btn{\r\n");
      out.write(" \twidth:100%; \r\n");
      out.write("  }\r\n");
      out.write("  input[type=text]{\r\n");
      out.write("  \t margin: 0 0 10px 0;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"row container\">\r\n");
      out.write("    <div> class=\"col s12 l6\">\r\n");
      out.write("      <h5 class=\"center-align\">Sign Up</h5>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"input-field col s12\">\r\n");
      out.write("          <input  type=\"text\" id=\"full_name\" class=\"validate\">\r\n");
      out.write("          <label for=\"full_name\">Full Name</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-field col s12\">\r\n");
      out.write("          <input type=\"text\" id=\"username\" class=\"validate\">\r\n");
      out.write("          <label for=\"username\">Username</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-field col s12\">\r\n");
      out.write("          <input type=\"email\" id=\"email\" class=\"validate\">\r\n");
      out.write("          <label for=\"email\">Email</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-field col s12\">\r\n");
      out.write("          <input  type=\"tel\" id=\"phone\" class=\"validate\">\r\n");
      out.write("          <label for=\"phone\">Telephone</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-field col s12\">\r\n");
      out.write("          <input  type=\"password\" id=\"password\" class=\"validate\">\r\n");
      out.write("          <label for=\"password\">Password</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-field col s12\">\r\n");
      out.write("          <input  type=\"password\" id=\"confirm\" class=\"validate\">\r\n");
      out.write("          <label for=\"confirm\">Confirm Password</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col s12\">\r\n");
      out.write("         \t<span>\r\n");
      out.write("\t\t      <input name=\"gender\" type=\"radio\" value=\"male\"/>\r\n");
      out.write("\t\t      <label for=\"gender\">Male</label>\r\n");
      out.write("\t\t    </span>\r\n");
      out.write("\t\t    <span>\r\n");
      out.write("\t\t      <input name=\"gender\" type=\"radio\" id=\"test2\" value=\"female\"/>\r\n");
      out.write("\t\t      <label for=\"gender\">Female</label>\r\n");
      out.write("\t\t    </span>\r\n");
      out.write("        </div>   \r\n");
      out.write("        <div class=\"col s12\">\r\n");
      out.write("        \t<br>\r\n");
      out.write("        \t<button id=\"sign_up_btn\" class=\"btn\">Sign Up</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <input type=\"hidden\" id=\"csrfToken\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("  <input type=\"hidden\" id=\"csrfHeader\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("  \tvar token = $('#csrfToken').val();\r\n");
      out.write("\tvar header = $('#csrfHeader').val();\r\n");
      out.write("\r\n");
      out.write("  \t\r\n");
      out.write("  \taxios.defaults.headers.common[header] = token;\r\n");
      out.write("  \t$('#sign_up_btn').click(function(){\r\n");
      out.write("  \t\tvar full_name = $('#full_name').val();\r\n");
      out.write("  \tvar username = $('#username').val();\r\n");
      out.write("  \tvar email = $('#email').val()\r\n");
      out.write("  \tvar phone = $('#phone').val()\r\n");
      out.write("  \tvar password = $('#password').val();\r\n");
      out.write("  \tvar confirm = $('#confirm').val()\r\n");
      out.write("  \tconsole.log(username)\r\n");
      out.write("  \tvar gender = $(\"input[name='gender']:checked\").val();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t\taxios.post('signup', {\r\n");
      out.write("            email: email,\r\n");
      out.write("            password: password,\r\n");
      out.write("            username:username,\r\n");
      out.write("        \tgender:gender,\r\n");
      out.write("        \tname:full_name\r\n");
      out.write("          })\r\n");
      out.write("          .then(function (response) {\r\n");
      out.write("            if(response.data.status){\r\n");
      out.write("            \twindow.location.replace(\"login\")\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("          })\r\n");
      out.write("          .catch(function (error) {\r\n");
      out.write("            console.log(error);\r\n");
      out.write("          });\r\n");
      out.write("          \r\n");
      out.write("  \t})\r\n");
      out.write("  \t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
