/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-12 03:18:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.view.security;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("<meta name=\"google-signin-client_id\" content=\"934878702971-vhv1inbu6cg8m4cggh4itr8mfuuidoo9.apps.googleusercontent.com\">\n");
      out.write("<title>Shuttle Bus Management</title>\n");
      out.write("\n");
      out.write("<script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginStyle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.js\"></script>\n");
      out.write("<script src=\"https://unpkg.com/axios/dist/axios.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   \t    \t \n");
      out.write("<script>\n");
      out.write("  \n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\"#myForm\").on(\"submit\",function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\tvar text = $(\"#username\").val().trim();\n");
      out.write("\t\tvar formatemail = /[!#$%^&*()+\\-=\\[\\]{};':\"\\\\|,<>\\/?]+/;\n");
      out.write("\t\tif(formatemail.test(text))\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\tswal(\"Oops!\", \"You cannot input special characters\", \"error\")  \n");
      out.write("\t\t\treturn\n");
      out.write("\t\t\t}\n");
      out.write("\t\t$(this).unbind(\"submit\").submit();\n");
      out.write("\t});\n");
      out.write("});\t\n");
      out.write("</script>\n");
      out.write("  </head>\n");
      out.write("<body onload='document.loginForm.username.focus()'>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alertJS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alertStyle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("<h1 align=\"center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\n");
      out.write("  <div class=\"login-page\">\n");
      out.write("  <div class=\"form\">\n");
      out.write("  \t<h1>Shuttle Bus Management</h1>\n");
      out.write("  \n");
      out.write("    <form class=\"login-form\" id=\"myForm\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" method=\"post\">\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("     \t<input type='text'placeholder=\"Username\" name='username' id=\"username\" required>\n");
      out.write("      <input type=\"password\" placeholder=\"Password\" name=\"password\" required/>\n");
      out.write("      <input type=\"submit\" class=\"a\" value=\"Login\" style=\"color:white;\">\n");
      out.write("      <div style=\"font-size:10px;\" class=\"gg\">\n");
      out.write("      <a href =\"signup\" data-toggle=\"modal\" data-target=\"#myModal\">Forgot Password?</a>\n");
      out.write("      <a href =\"signup\">Sign Up</a>\n");
      out.write("      </div>\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" id=\"csrfToken\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("    <input type=\"hidden\" id=\"csrfHeader\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Find Your Account</h4>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("     <form class=\"form-group\" id=\"myForm2\">\n");
      out.write("     <p><b>Please enter your email to search for your account.</b><span id =\"toload\"></span></p>\n");
      out.write("    <div>\n");
      out.write("      \n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("      <div style=\"display: inline-block;\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"eemail\" maxlength=\"60\" placeholder=\"Enter your email\" required>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <button id=\"bsubmit\" type=\"submit\" class=\"btn btn-default\" style=\"display:none;\">Submit</button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"g-signin2\" data-onsuccess=\"onSignIn\" data-theme=\"dark\"></div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("  <br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\t\n");
      out.write("          <button onClick=\"goTO()\" class=\"btn btn-default\">Submit</button>\n");
      out.write("          <button type=\"button\" id=\"closing\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\t\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(\"#myForm2\").on(\"submit\",function(e){\n");
      out.write("\te.preventDefault();\n");
      out.write("\t$(\"#toload\").addClass(\"loader\");\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:'forgetPasswordSubmit',\n");
      out.write("\t\t\ttype:'GET',\n");
      out.write("\t\t\tdata:{email:$(\"#eemail\").val()},\n");
      out.write("\t\t\tsuccess: function(response){\t\t\t     \n");
      out.write("\t\t\t\tif(response.status==\"999\")\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t$(\"#toload\").removeClass(\"loader\");\n");
      out.write("\t\t\t\t\tswal(\"We cannot find you!\", \"Please give a valid email!\", \"error\")\n");
      out.write("\t\t\t\t\t$('#closing').trigger('click');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\telse \n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t$(\"#toload\").removeClass(\"loader\");\n");
      out.write("\t\t\t\t\tswal(\"Done!\",\"We found you! Please check your email to reset new password!\", \"success\")\n");
      out.write("\t\t\t\t\t$('#closing').trigger('click');\n");
      out.write("\t\t\t\t\t//alert(\"<div class=\"alert alert-success\"><strong>Success!</strong> This alert box could indicate a successful or positive action.</div>\")\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror: function(err){\n");
      out.write("\t\t\t\tconsole.log(JSON.stringify(err));\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\t\t\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("goTO = function(){\n");
      out.write("$('#bsubmit').trigger('click');\n");
      out.write("}\n");
      out.write("var token = $('#csrfToken').val();\n");
      out.write("var header = $('#csrfHeader').val();\n");
      out.write("axios.defaults.headers.common[header] = token;\n");
      out.write("  \n");
      out.write("  function onSignIn(googleUser) {\n");
      out.write("        // Useful data for your client-side scripts:\n");
      out.write("        var profile = googleUser.getBasicProfile();\n");
      out.write("        console.log(\"ID: \" + profile.getId()); // Don't send this directly to your server!\n");
      out.write("        console.log('Full Name: ' + profile.getName());\n");
      out.write("        console.log('Given Name: ' + profile.getGivenName());\n");
      out.write("        console.log('Family Name: ' + profile.getFamilyName());\n");
      out.write("        console.log(\"Image URL: \" + profile.getImageUrl());\n");
      out.write("        console.log(\"Email: \" + profile.getEmail());\n");
      out.write("        var id_token = googleUser.getAuthResponse().id_token;\n");
      out.write("        console.log(\"ID Token: \" + id_token);\n");
      out.write("        var data = 'email='+profile.getEmail()+\"--google\" + '&password='+profile.getId()+'&type=google';\n");
      out.write("        axios({\n");
      out.write("          method: 'post',\n");
      out.write("          url: '/KITPointSystem/login',\n");
      out.write("          data: data\n");
      out.write("        })\n");
      out.write("      };\n");
      out.write("</script>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("    <meta name=\"google-signin-client_id\" content=\"934878702971-vhv1inbu6cg8m4cggh4itr8mfuuidoo9.apps.googleusercontent.com\">\n");
      out.write("    <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"g-signin2\" data-onsuccess=\"onSignIn\" data-theme=\"dark\"></div>\n");
      out.write("    <script>\n");
      out.write("      function onSignIn(googleUser) {\n");
      out.write("        // Useful data for your client-side scripts:\n");
      out.write("        var profile = googleUser.getBasicProfile();\n");
      out.write("        console.log(\"ID: \" + profile.getId()); // Don't send this directly to your server!\n");
      out.write("        console.log('Full Name: ' + profile.getName());\n");
      out.write("        console.log('Given Name: ' + profile.getGivenName());\n");
      out.write("        console.log('Family Name: ' + profile.getFamilyName());\n");
      out.write("        console.log(\"Image URL: \" + profile.getImageUrl());\n");
      out.write("        console.log(\"Email: \" + profile.getEmail());\n");
      out.write("\n");
      out.write("        // The ID token you need to pass to your backend:\n");
      out.write("        var id_token = googleUser.getAuthResponse().id_token;\n");
      out.write("        console.log(\"ID Token: \" + id_token);\n");
      out.write("      };\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("-->");
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

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/views/view/security/login.jsp(12,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/resources/Bootstrap/css/style.css");
    // /WEB-INF/views/view/security/login.jsp(12,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setVar("loginStyle");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/views/view/security/login.jsp(20,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/resources/Bootstrap/css/sweetalert.css");
    // /WEB-INF/views/view/security/login.jsp(20,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setVar("alertStyle");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/views/view/security/login.jsp(21,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/resources/Bootstrap/js/sweetalert.min.js");
    // /WEB-INF/views/view/security/login.jsp(21,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setVar("alertJS");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/view/security/login.jsp(48,49) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/login");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/view/security/login.jsp(49,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty error}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<div class=\"error\" style=\"color:red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</div>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/view/security/login.jsp(52,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty msg}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<div class=\"msg\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</div>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
