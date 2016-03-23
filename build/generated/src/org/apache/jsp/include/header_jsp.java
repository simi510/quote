package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta name=\"generator\" content=\n");
      out.write("  \"HTML Tidy for Linux/x86 (vers 25 March 2009), see www.w3.org\" />\n");
      out.write("\n");
      out.write("  <title>Harsimranjeet Singh</title>\n");
      out.write("  <meta charset=\"UTF-8\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("  <!-- Latest compiled and minified CSS -->\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write(" <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" type=\"text/css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"include/styles/main.css\" type=\"text/css\" />\n");
      out.write("  ");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("  \n");
      out.write("  <!-- jQuery library -->\n");
      out.write("\n");
      out.write("  <script src=\"include/js/jquery-1.12.0.min.js\" type=\"text/javascript\">\n");
      out.write("</script><!-- Latest compiled JavaScript -->\n");
      out.write("\n");
      out.write("  <script src=\"include/js/bootstrap.min.js\" type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/include/header.png\" class=\"img-responsive\"  id= \"head\"  alt=\"Responsive image\" />\n");
      out.write("</a>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("  <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">Simi's Website</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li><a href=\"index.jsp\">Index</a></li>\n");
      out.write("      <li><a href=\"map.jsp\">Map</a></li>\n");
      out.write("      <li><a href=\"directions.jsp\">Directions</a></li>\n");
      out.write("      <li><a href=\"join.jsp\">Mailing List</a></li>\n");
      out.write("      <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("       <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isAdmin !=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("      <li><a href=\"admin.jsp\">Admin</a></li>\n");
      out.write("      <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("      </ul>\n");
      out.write("      </c:if>\n");
      out.write("      \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("           <c:if test =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User.username!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">      \n");
      out.write("               <p class=\"navbar-text\">Signed in as <a href=\"#\" class=\"navbar-link\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User.username== null ? 'guest' : sessionScope.User.username }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></a></p>\n");
      out.write("             </c:if> \n");
      out.write("             \n");
      out.write("           <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>      \n");
      out.write("          \n");
      out.write("          <li><p class=\"navbar-text\">Already have an account? </p> </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><b><span class=\"glyphicon glyphicon-log-in\"></span> Login</b> <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t<ul id=\"login-dp\" class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\tVist social media\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social-buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/\" class=\"btn btn-fb\"><i class=\"fa fa-facebook\"></i> Facebook</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/\" class=\"btn btn-tw\"><i class=\"fa fa-twitter\"></i> Twitter</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                or\n");
      out.write("\t\t\t\t\t\t\t\t <form class=\"form\" role=\"form\" method=\"post\" action=\"loginAccount\" accept-charset=\"UTF-8\" id=\"login-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"formType\"  value=\"login\" />\n");
      out.write("                                                                     <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <label class=\"sr-only\" >Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input name=\"username\" type=\"text\" class=\"form-control\"  placeholder=\"Username\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input name=\"password\" type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" placeholder=\"Password\" required>\n");
      out.write("                                             <div class=\"help-block text-right\"><a href=\"contact.jsp\">Forget the password ?</a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input type=\"checkbox\"> keep me logged-in\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t </label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t </form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bottom text-center\">\n");
      out.write("\t\t\t\t\t\t\t\tNew here ? <a href=\"signup.jsp\"><b>Join Us</b></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"/CS3520/Logout\"><span class=\"glyphicon glyphicon-off\"></span><b> Logout</b></a></li>  \n");
      out.write("      \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("      ");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write(" var url = window.location;\n");
      out.write("// Will only work if string in href matches with location\n");
      out.write("$('ul.nav a[href=\"'+ url +'\"]').parent().addClass('active');\n");
      out.write("\n");
      out.write("// Will also work for relative and absolute hrefs\n");
      out.write("$('ul.nav a').filter(function() {\n");
      out.write("    return this.href == url;\n");
      out.write("}).parent().addClass('active');\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
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
