/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-23 07:52:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class schedule_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<body onload=\"load()\">\r\n");
      out.write("<article class=\"content cards-page\">\r\n");
      out.write("                    <div class=\"title-block\">\r\n");
      out.write("                        <h3 class=\"title\"> Schedules </h3><br>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("<!--                         <p class=\"title-description\"> Create, Update or View all buses information </p> -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <section class=\"section\">\r\n");
      out.write("\t                   <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-block\">\r\n");
      out.write("                                        <div class=\"card-title-block\">\r\n");
      out.write("                                            <h3 class=\"title\" id=\"ddate\"></h3>\r\n");
      out.write("                                            \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <section class=\"example\">\r\n");
      out.write("                                            <div class=\"table-responsive\">\r\n");
      out.write("                                                <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                                    <thead>\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <th>No</th>\r\n");
      out.write("                                                            <th>Code</th>\r\n");
      out.write("                                                            <th>Bus</th>\r\n");
      out.write("                                                            <th>Driver</th>\r\n");
      out.write("                                                            <th>From</th>\r\n");
      out.write("                                                            <th>To</th>\r\n");
      out.write("                                                            <th>Departure Date</th>\r\n");
      out.write("                                                            <th>Departure Time</th>\r\n");
      out.write("                                                            <th>Number of bookings</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("                                                    <tbody id=\"allSchedules\">\r\n");
      out.write("                                                       \r\n");
      out.write("                                                    </tbody>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </section>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    \r\n");
      out.write("                </article>\r\n");
      out.write("                \r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("load = function(){\t\r\n");
      out.write("\tvar data = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\tvar schedules = data.schedules;\r\n");
      out.write("\tconsole.log(schedules)\r\n");
      out.write("\tvar locations = data.locations;\r\n");
      out.write("\tvar buses = data.buses;\r\n");
      out.write("    var drivers = data.drivers;\r\n");
      out.write("\tfor (var i=0;i<schedules.length;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tschedules[i].dept_date = new Date(schedules[0].dept_date);\r\n");
      out.write("\t\tschedules[i].created_at = new Date(schedules[0].created_at);\r\n");
      out.write("\t\tschedules[i].updated_dt = new Date(schedules[0].updated_dt);\r\n");
      out.write("\tvar schedule = '<tr class=\"hoverr\" data-url=\"schedule_detail?id='+schedules[i].id+'\"><td>'+(i+1)+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+schedules[i].code+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+searchBus(schedules[i].bus_id,buses)+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+searchDriver(schedules[i].driver_id,drivers)+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+searchLocation(schedules[i].source_id,locations)+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+searchLocation(schedules[i].destination_id,locations)+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+formatDate(schedules[i].dept_date)+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+schedules[i].dept_time+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+'<td>'+schedules[i].number_booking+'</td></tr>';\r\n");
      out.write("\t$(\"#allSchedules\").append(schedule);\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#ddate\").text(\"All schedules on \"+formatDate(schedules[0].dept_date));\r\n");
      out.write("\t$(\".hoverr\").on('click', function() {\r\n");
      out.write("    \tlocation.href=$(this).attr('data-url');\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("goTO = function(){\r\n");
      out.write("\t$('#bsubmit').trigger('click');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#scheduleMng\").addClass(\"active\");\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("formatDate =function (date) {\r\n");
      out.write("    var d = new Date(date),\r\n");
      out.write("        month = '' + (d.getMonth() + 1),\r\n");
      out.write("        day = '' + d.getDate(),\r\n");
      out.write("        year = d.getFullYear();\r\n");
      out.write("\r\n");
      out.write("    if (month.length < 2) month = '0' + month;\r\n");
      out.write("      if (day.length < 2) day = '0' + day;\r\n");
      out.write("\r\n");
      out.write("    return [month, day, year].join('-');\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function searchLocation(id, myArray){\r\n");
      out.write("    for (var i=0; i < myArray.length; i++) {\r\n");
      out.write("        if (myArray[i].id === id) {\r\n");
      out.write("            return myArray[i].name;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function searchBus(id, myArray){\r\n");
      out.write("    for (var i=0; i < myArray.length; i++) {\r\n");
      out.write("        if (myArray[i].id === id) {\r\n");
      out.write("            return myArray[i].model;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function searchDriver(id, myArray){\r\n");
      out.write("    if(id==0)\r\n");
      out.write("        return\"\";\r\n");
      out.write("    for (var i=0; i < myArray.length; i++) {\r\n");
      out.write("        if (myArray[i].id === id) {\r\n");
      out.write("            return myArray[i].name;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
