package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_import_url_nobody.release();
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
      response.setContentType("text/html");
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
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  <div class=\"container\">\n");
      out.write("      \n");
      out.write("           <div class=\"jumbotron vertical-center\">\n");
      out.write("                <div class=\"bg\"></div>\n");
      out.write("        <h3 id=\"regional\" align=\"center\"> Welcome to Simi's Website </h3>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write(" \n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-3 no-padding\">\n");
      out.write("                  <h3>Login to account</h3>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <form action=\"loginAccount\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
      out.write(" \n");
      out.write("           ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          <label>Username:</label>\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"formType\" value=\"login\" /> <input type=\"text\" class=\"form-control\"\n");
      out.write("            name=\"username\" placeholder=\"Username\"/><br />\n");
      out.write("            <label>Password:</label><br />\n");
      out.write("            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\" /><br />\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Login\">Login</button>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("              <br><form action=\"Logout\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("    <button type=\"submit\" name=\"Logout\" class=\"btn btn-warning btn-block\" value=\"Logout\">Logout</button>  \n");
      out.write("      </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-1\"></div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("      \n");
      out.write("    \n");
      out.write("\n");
      out.write("      \n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("       <section class=\"features_table\">\n");
      out.write("\n");
      out.write("        \t<div class=\"col-sm-3 col-3 no-padding\">\n");
      out.write("            \t<div class=\"features-table\">\n");
      out.write("                \t<ul>\n");
      out.write("                    \t<h1>Features</h1>\n");
      out.write("                    \t<li>Quote </li>\n");
      out.write("                        <li>Directions</li>\n");
      out.write("                        <li>Contact Us</li>\n");
      out.write("                        <li>Mailing List</li>\n");
      out.write("                        <li>Admin Settings</li>\n");
      out.write("                        <li>Memes?</li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1 col-1 no-padding\">\n");
      out.write("            <div class=\"features-table-free\">\n");
      out.write("                \t<ul>\n");
      out.write("                    \t<h1>Free</h1>\n");
      out.write("                        <li><i class=\"fa fa-times\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-times\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-times\"></i></li>\n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-xs-2 col-1 no-padding\">\n");
      out.write("             \t <div class=\"features-table-free\">\n");
      out.write("                \t<ul>\n");
      out.write("                    \t<h1>\"FREE\"</h1>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-times\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-times\"></i></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("           <div class=\"col-md-1 col-1 no-padding\">\n");
      out.write("             \t <div class=\"features-table-paid\">\n");
      out.write("                \t<ul>\n");
      out.write("                    \t<h1>PRO</h1>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        <li><i class=\"fa fa-check\"></i></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </section>\n");
      out.write("      </div>  \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide text-center\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("    <h4>\"This company is the best. I am so happy with the result!\"<br><span style=\"font-style:normal;\">Michael Roe, Vice President, Comment Box</span></h4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <h4>\"One word... WOW!!\"<br><span style=\"font-style:normal;\">John Doe, Salesman, Rep Inc</span></h4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <h4>\"Could I... BE any more happy with this company?\"<br><span style=\"font-style:normal;\">Chandler Bing, Actor, FriendsAlot</span></h4>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    var jumboHeight = $('.jumbotron').outerHeight();\n");
      out.write("function parallax(){\n");
      out.write("    var scrolled = $(window).scrollTop();\n");
      out.write("    $('.bg').css('height', (jumboHeight-scrolled) + 'px');\n");
      out.write("}\n");
      out.write("\n");
      out.write("$(window).scroll(function(e){\n");
      out.write("    parallax();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("/include/header.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.errorMsg!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("            <div class=\"alert alert-warning\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMsg== null ? 'There was a issue' : errorMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("           ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setUrl("/include/footer.jsp");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }
}
