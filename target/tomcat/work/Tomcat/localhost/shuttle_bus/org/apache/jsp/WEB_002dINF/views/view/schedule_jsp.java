/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-15 04:05:01 UTC
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

      out.write("<body onload=\"assigN()\" >\n");
      out.write("<article class=\"content cards-page\">\n");
      out.write(" \t\t\t\t\t\t<div class=\"title-block\" style=\"border-bottom:0px solid #d7dde4;\">\n");
      out.write(" \t\t\t\t\t\t<div class=\"btn-group pull-right\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info\" onclick=\"window.history.back();\" style=\"color:white;border-right:2px solid white;\"><i class=\"fa fa-list-ul\"></i></button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info\" id=\"btnCalendar\" style=\"color:white;\"><i class=\"fa fa-calendar\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                    \t\n");
      out.write("                    <section class=\"section\">\n");
      out.write("                        <div class=\"row sameheight-container\">\n");
      out.write("                           <div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"calendar\">\n");
      out.write("\n");
      out.write("\t\t\t<header>\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<h2 id=\"hhead\"></h2>\n");
      out.write("\n");
      out.write("\t\t\t\t<a class=\"btn-prev fontawesome-angle-left\" href=\"javascript:assigNPrevious()\"></a>\n");
      out.write("\t\t\t\t<a class=\"btn-next fontawesome-angle-right\" href=\"javascript:assigNNext()\"></a>\n");
      out.write("\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t<div id=\"cc\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</div> <!-- end calendar -->\n");
      out.write("\n");
      out.write("\t</div> <!-- end container -->\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                    \n");
      out.write("                </article>\n");
      out.write("                \n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var currentDate;\n");
      out.write("var ttoday = new Date();\n");
      out.write("\n");
      out.write("load = function()\n");
      out.write("{}\n");
      out.write("\n");
      out.write("\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\"#scheduleMng\").addClass(\"active\");\n");
      out.write("\t$(\"#btnCalendar\").addClass(\"active\");\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function assigN(){\n");
      out.write("\tvar slickjs = $(\"<link>\");\n");
      out.write("  \t$(slickjs).attr('rel', 'stylesheet');\n");
      out.write("  \t$(slickjs).attr('href', '/KIT_Point_Management_System/resources/Bootstrap/css/calendar.css');\n");
      out.write("  \t$(slickjs).appendTo('head');\n");
      out.write("\tvar dateNow = new Date();\n");
      out.write("\tcurrentDate = dateNow;\n");
      out.write("\tdisplayCalendar(dateNow);\n");
      out.write("\tvar toFind = ttoday.getDate()+\"o\"+ttoday.getMonth()+\"o\"+ttoday.getFullYear();\n");
      out.write("\t$(\"#\"+toFind).addClass(\"current-day\");\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl:'getAllSchedulesByMonth?month='+(dateNow.getMonth()+1)+'&year='+dateNow.getFullYear(),\n");
      out.write("\t\ttype:'GET',\n");
      out.write("\t\tsuccess: function(response){\n");
      out.write("\t\t\tputScheduleOnCalendar(response)\n");
      out.write("\t\t\t},\n");
      out.write("\terror: function(err){\n");
      out.write("\t\tswal(\"Oops!\", \"Cannot get all schedule data\", \"error\")\n");
      out.write("\t\tconsole.log(JSON.stringify(err));\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("function assigNNext(){\n");
      out.write("\tdocument.getElementById(\"cc\").innerHTML=\"\";\n");
      out.write("\tvar dateNow = currentDate;\n");
      out.write("\tdateNow.setMonth(dateNow.getMonth()+1);\n");
      out.write("\tdisplayCalendar(dateNow);\n");
      out.write("\tvar toFind = ttoday.getDate()+\"o\"+ttoday.getMonth()+\"o\"+ttoday.getFullYear();\n");
      out.write("\t$(\"#\"+toFind).addClass(\"current-day\");\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl:'getAllSchedulesByMonth?month='+(dateNow.getMonth()+1)+'&year='+dateNow.getFullYear(),\n");
      out.write("\t\ttype:'GET',\n");
      out.write("\t\tsuccess: function(response){\n");
      out.write("\t\t\tputScheduleOnCalendar(response)\n");
      out.write("\t\t\t},\n");
      out.write("\terror: function(err){\n");
      out.write("\t\tswal(\"Oops!\", \"Cannot get all schedule data\", \"error\")\n");
      out.write("\t\tconsole.log(JSON.stringify(err));\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("}\n");
      out.write("function assigNPrevious(){\n");
      out.write("\tdocument.getElementById(\"cc\").innerHTML=\"\";\n");
      out.write("\tvar dateNow = currentDate;\n");
      out.write("\tdateNow.setMonth(dateNow.getMonth()-1);\n");
      out.write("\tdisplayCalendar(dateNow);\n");
      out.write("\tvar toFind = ttoday.getDate()+\"o\"+ttoday.getMonth()+\"o\"+ttoday.getFullYear();\n");
      out.write("\t$(\"#\"+toFind).addClass(\"current-day\");\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl:'getAllSchedulesByMonth?month='+(dateNow.getMonth()+1)+'&year='+dateNow.getFullYear(),\n");
      out.write("\t\ttype:'GET',\n");
      out.write("\t\tsuccess: function(response){\n");
      out.write("\t\t\tputScheduleOnCalendar(response)\n");
      out.write("\t\t\t},\n");
      out.write("\terror: function(err){\n");
      out.write("\t\tswal(\"Oops!\", \"Cannot get all schedule data\", \"error\")\n");
      out.write("\t\tconsole.log(JSON.stringify(err));\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function displayCalendar(dd){\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" var htmlContent =\"\";\n");
      out.write(" var FebNumberOfDays =\"\";\n");
      out.write(" var counter = 1;\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" var dateNow = dd;\n");
      out.write(" var month = dateNow.getMonth();\n");
      out.write("\n");
      out.write(" var nextMonth = month+1; //+1; //Used to match up the current month with the correct start date.\n");
      out.write(" var prevMonth = month -1;\n");
      out.write(" var day = dateNow.getDate();\n");
      out.write(" var year = dateNow.getFullYear();\n");
      out.write("  \n");
      out.write(" \n");
      out.write(" //Determing if February (28,or 29)  \n");
      out.write(" if (month == 1){\n");
      out.write("    if ( (year%100!=0) && (year%4==0) || (year%400==0)){\n");
      out.write("      FebNumberOfDays = 29;\n");
      out.write("    }else{\n");
      out.write("      FebNumberOfDays = 28;\n");
      out.write("    }\n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" // names of months and week days.\n");
      out.write(" var monthNames = [\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\", \"December\"];\n");
      out.write(" var dayNames = [\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thrusday\",\"Friday\", \"Saturday\"];\n");
      out.write(" var dayPerMonth = [\"31\", \"\"+FebNumberOfDays+\"\",\"31\",\"30\",\"31\",\"30\",\"31\",\"31\",\"30\",\"31\",\"30\",\"31\"]\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" // days in previous month and next one , and day of week.\n");
      out.write(" var nextDate = new Date(nextMonth +' 1 ,'+year);\n");
      out.write(" \n");
      out.write(" var weekdays= nextDate.getDay();\n");
      out.write(" var weekdays2 = weekdays\n");
      out.write(" var numOfDays = dayPerMonth[month];\n");
      out.write("     \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" // this leave a white space for days of pervious month.\n");
      out.write(" while (weekdays>0){\n");
      out.write("    htmlContent += \"<td class='prev-month'></td>\";\n");
      out.write(" \n");
      out.write(" // used in next loop.\n");
      out.write("     weekdays--;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" // loop to build the calander body.\n");
      out.write(" while (counter <= numOfDays){\n");
      out.write(" \n");
      out.write("     // When to start new line.\n");
      out.write("    if (weekdays2 > 6){\n");
      out.write("        weekdays2 = 0;\n");
      out.write("        htmlContent += \"</tr><tr>\";\n");
      out.write("    }\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("    // if counter is current day.\n");
      out.write("    // highlight current day using the CSS defined in header.\n");
      out.write("    if (counter == day){\n");
      out.write("        htmlContent +=\"<td id='\"+counter+\"o\"+month+\"o\"+year+\"'>\"+counter+\"</td>\";\n");
      out.write("    }else{\n");
      out.write("        htmlContent +=\"<td id='\"+counter+\"o\"+month+\"o\"+year+\"'>\"+counter+\"</td>\";    \n");
      out.write(" \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    weekdays2++;\n");
      out.write("    counter++;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" // building the calendar html body.\n");
      out.write(" $(\"#hhead\").text(monthNames[month]+\" \"+ year);\n");
      out.write(" var calendarBody = \"<table>\";\n");
      out.write(" calendarBody +=\"<thead>  <tr><td>Sun</td>  <td>Mon</td> <td>Tue</td>\"+\n");
      out.write(" \"<td>Wed</td> <td>Thu</td> <td>Fri</td> <td>Sat</td> </tr></thead>\";\n");
      out.write(" calendarBody += \"<tr>\";\n");
      out.write(" calendarBody += htmlContent;\n");
      out.write(" calendarBody += \"</tr></table>\";\n");
      out.write(" // set the content of div .\n");
      out.write(" document.getElementById(\"cc\").innerHTML=calendarBody;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("putScheduleOnCalendar = function(data)\n");
      out.write("\t{\n");
      out.write("\tschedules = data.schedules;\n");
      out.write("\tfor (var i=0;i<schedules.length;i++)\n");
      out.write("\t\t{\n");
      out.write("\t\tvar date = new Date(schedules[i].dept_date);\n");
      out.write("\t\tvar arrangedDate = date.getDate()+\"o\"+date.getMonth()+\"o\"+date.getFullYear();\n");
      out.write("\t\t$(\"#\"+arrangedDate).addClass(\"event\");\n");
      out.write("\t\t$(\"#\"+arrangedDate).addClass(\"hh\");\n");
      out.write("\t\t$(\"#\"+arrangedDate).attr('data-url', 'schedule_list?date='+date.getDate()+'&month='+(date.getMonth()+1)+'&year='+date.getFullYear());\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\t$(\".hh\").on('click', function() {\n");
      out.write("    \tlocation.href=$(this).attr('data-url');\n");
      out.write("\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("viewAsList = function(){\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</script>\n");
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
