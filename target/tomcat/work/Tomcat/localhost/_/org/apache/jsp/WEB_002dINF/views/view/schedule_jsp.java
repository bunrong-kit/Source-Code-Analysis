/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-20 08:43:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<body onload=\"assigN()\" >\r\n");
      out.write("<article class=\"content cards-page\">\r\n");
      out.write(" \t\t\t\t\t\t<div class=\"title-block\" style=\"border-bottom:0px solid #d7dde4;\">\r\n");
      out.write(" \t\t\t\t\t\t<div class=\"btn-group pull-right\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info\" onclick=\"window.history.back();\" style=\"color:white;border-right:2px solid white;\"><i class=\"fa fa-list-ul\"></i></button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info\" id=\"btnCalendar\" style=\"color:white;\"><i class=\"fa fa-calendar\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      \r\n");
      out.write("                    \t\r\n");
      out.write("                    <section class=\"section\">\r\n");
      out.write("                        <div class=\"row sameheight-container\">\r\n");
      out.write("                           <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"calendar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<header>\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h2 id=\"hhead\"></h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"btn-prev fontawesome-angle-left\" href=\"javascript:assigNPrevious()\"></a>\r\n");
      out.write("\t\t\t\t<a class=\"btn-next fontawesome-angle-right\" href=\"javascript:assigNNext()\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t<div id=\"cc\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</div> <!-- end calendar -->\r\n");
      out.write("\r\n");
      out.write("\t</div> <!-- end container -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    \r\n");
      out.write("                </article>\r\n");
      out.write("                \r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var currentDate;\r\n");
      out.write("var ttoday = new Date();\r\n");
      out.write("\r\n");
      out.write("load = function()\r\n");
      out.write("{}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#scheduleMng\").addClass(\"active\");\r\n");
      out.write("\t$(\"#btnCalendar\").addClass(\"active\");\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function assigN(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar dateNow = new Date();\r\n");
      out.write("\tcurrentDate = dateNow;\r\n");
      out.write("\tdisplayCalendar(dateNow);\r\n");
      out.write("\tvar toFind = ttoday.getDate()+\"o\"+ttoday.getMonth()+\"o\"+ttoday.getFullYear();\r\n");
      out.write("\t$(\"#\"+toFind).addClass(\"current-day\");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:'getAllSchedulesByMonth?month='+(dateNow.getMonth()+1)+'&year='+dateNow.getFullYear(),\r\n");
      out.write("\t\ttype:'GET',\r\n");
      out.write("\t\tsuccess: function(response){\r\n");
      out.write("\t\t\tputScheduleOnCalendar(response)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\terror: function(err){\r\n");
      out.write("\t\tswal(\"Oops!\", \"Cannot get all schedule data\", \"error\")\r\n");
      out.write("\t\tconsole.log(JSON.stringify(err));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("function assigNNext(){\r\n");
      out.write("\tdocument.getElementById(\"cc\").innerHTML=\"\";\r\n");
      out.write("\tvar dateNow = currentDate;\r\n");
      out.write("\tdateNow.setMonth(dateNow.getMonth()+1);\r\n");
      out.write("\tdisplayCalendar(dateNow);\r\n");
      out.write("\tvar toFind = ttoday.getDate()+\"o\"+ttoday.getMonth()+\"o\"+ttoday.getFullYear();\r\n");
      out.write("\t$(\"#\"+toFind).addClass(\"current-day\");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:'getAllSchedulesByMonth?month='+(dateNow.getMonth()+1)+'&year='+dateNow.getFullYear(),\r\n");
      out.write("\t\ttype:'GET',\r\n");
      out.write("\t\tsuccess: function(response){\r\n");
      out.write("\t\t\tputScheduleOnCalendar(response)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\terror: function(err){\r\n");
      out.write("\t\tswal(\"Oops!\", \"Cannot get all schedule data\", \"error\")\r\n");
      out.write("\t\tconsole.log(JSON.stringify(err));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function assigNPrevious(){\r\n");
      out.write("\tdocument.getElementById(\"cc\").innerHTML=\"\";\r\n");
      out.write("\tvar dateNow = currentDate;\r\n");
      out.write("\tdateNow.setMonth(dateNow.getMonth()-1);\r\n");
      out.write("\tdisplayCalendar(dateNow);\r\n");
      out.write("\tvar toFind = ttoday.getDate()+\"o\"+ttoday.getMonth()+\"o\"+ttoday.getFullYear();\r\n");
      out.write("\t$(\"#\"+toFind).addClass(\"current-day\");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:'getAllSchedulesByMonth?month='+(dateNow.getMonth()+1)+'&year='+dateNow.getFullYear(),\r\n");
      out.write("\t\ttype:'GET',\r\n");
      out.write("\t\tsuccess: function(response){\r\n");
      out.write("\t\t\tputScheduleOnCalendar(response)\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\terror: function(err){\r\n");
      out.write("\t\tswal(\"Oops!\", \"Cannot get all schedule data\", \"error\")\r\n");
      out.write("\t\tconsole.log(JSON.stringify(err));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function displayCalendar(dd){\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" var htmlContent =\"\";\r\n");
      out.write(" var FebNumberOfDays =\"\";\r\n");
      out.write(" var counter = 1;\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" var dateNow = dd;\r\n");
      out.write(" var month = dateNow.getMonth();\r\n");
      out.write("\r\n");
      out.write(" var nextMonth = month+1; //+1; //Used to match up the current month with the correct start date.\r\n");
      out.write(" var prevMonth = month -1;\r\n");
      out.write(" var day = dateNow.getDate();\r\n");
      out.write(" var year = dateNow.getFullYear();\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" //Determing if February (28,or 29)  \r\n");
      out.write(" if (month == 1){\r\n");
      out.write("    if ( (year%100!=0) && (year%4==0) || (year%400==0)){\r\n");
      out.write("      FebNumberOfDays = 29;\r\n");
      out.write("    }else{\r\n");
      out.write("      FebNumberOfDays = 28;\r\n");
      out.write("    }\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" // names of months and week days.\r\n");
      out.write(" var monthNames = [\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\", \"December\"];\r\n");
      out.write(" var dayNames = [\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thrusday\",\"Friday\", \"Saturday\"];\r\n");
      out.write(" var dayPerMonth = [\"31\", \"\"+FebNumberOfDays+\"\",\"31\",\"30\",\"31\",\"30\",\"31\",\"31\",\"30\",\"31\",\"30\",\"31\"]\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" // days in previous month and next one , and day of week.\r\n");
      out.write(" var nextDate = new Date(nextMonth +' 1 ,'+year);\r\n");
      out.write(" \r\n");
      out.write(" var weekdays= nextDate.getDay();\r\n");
      out.write(" var weekdays2 = weekdays\r\n");
      out.write(" var numOfDays = dayPerMonth[month];\r\n");
      out.write("     \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" // this leave a white space for days of pervious month.\r\n");
      out.write(" while (weekdays>0){\r\n");
      out.write("    htmlContent += \"<td class='prev-month'></td>\";\r\n");
      out.write(" \r\n");
      out.write(" // used in next loop.\r\n");
      out.write("     weekdays--;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" // loop to build the calander body.\r\n");
      out.write(" while (counter <= numOfDays){\r\n");
      out.write(" \r\n");
      out.write("     // When to start new line.\r\n");
      out.write("    if (weekdays2 > 6){\r\n");
      out.write("        weekdays2 = 0;\r\n");
      out.write("        htmlContent += \"</tr><tr>\";\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    // if counter is current day.\r\n");
      out.write("    // highlight current day using the CSS defined in header.\r\n");
      out.write("    if (counter == day){\r\n");
      out.write("        htmlContent +=\"<td id='\"+counter+\"o\"+month+\"o\"+year+\"'>\"+counter+\"</td>\";\r\n");
      out.write("    }else{\r\n");
      out.write("        htmlContent +=\"<td id='\"+counter+\"o\"+month+\"o\"+year+\"'>\"+counter+\"</td>\";    \r\n");
      out.write(" \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    weekdays2++;\r\n");
      out.write("    counter++;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" // building the calendar html body.\r\n");
      out.write(" $(\"#hhead\").text(monthNames[month]+\" \"+ year);\r\n");
      out.write(" var calendarBody = \"<table>\";\r\n");
      out.write(" calendarBody +=\"<thead>  <tr><td>Sun</td>  <td>Mon</td> <td>Tue</td>\"+\r\n");
      out.write(" \"<td>Wed</td> <td>Thu</td> <td>Fri</td> <td>Sat</td> </tr></thead>\";\r\n");
      out.write(" calendarBody += \"<tr>\";\r\n");
      out.write(" calendarBody += htmlContent;\r\n");
      out.write(" calendarBody += \"</tr></table>\";\r\n");
      out.write(" // set the content of div .\r\n");
      out.write(" document.getElementById(\"cc\").innerHTML=calendarBody;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("putScheduleOnCalendar = function(data)\r\n");
      out.write("\t{\r\n");
      out.write("\tschedules = data.schedules;\r\n");
      out.write("\tfor (var i=0;i<schedules.length;i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tvar date = new Date(schedules[i].dept_date);\r\n");
      out.write("\t\tvar arrangedDate = date.getDate()+\"o\"+date.getMonth()+\"o\"+date.getFullYear();\r\n");
      out.write("\t\t$(\"#\"+arrangedDate).addClass(\"event\");\r\n");
      out.write("\t\t$(\"#\"+arrangedDate).addClass(\"hh\");\r\n");
      out.write("\t\t$(\"#\"+arrangedDate).attr('data-url', 'schedule_list?date='+date.getDate()+'&month='+(date.getMonth()+1)+'&year='+date.getFullYear());\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t$(\".hh\").on('click', function() {\r\n");
      out.write("    \tlocation.href=$(this).attr('data-url');\r\n");
      out.write("\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("viewAsList = function(){\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
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