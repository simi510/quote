package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class directions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("var image_x = document.getElementById('head');\n");
      out.write("image_x.parentNode.removeChild(image_x);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true&libraries=places\"></script>\n");
      out.write("\t\t<link href=\"include/styles/style1.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("    \n");
      out.write("  </head>W\n");
      out.write("\n");
      out.write("    <div id=\"mapCanvas\">&#160;</div>\n");
      out.write("    \n");
      out.write("    <div id=\"directionsPanel\">\n");
      out.write("              \n");
      out.write("    \t<a href=\"#geoLocation\" id=\"useGPS\">Use Current Location</a>\n");
      out.write("        <!--<p class=\"or\">[OR]</p>-->\n");
      out.write("    \t<div class=\"directionInputs\">\n");
      out.write("             <form>\n");
      out.write("                <!--<a href=\"#getcar\" id=\"getcar\" class=\"btn\" ><img src=\"icon-car.gif\" width=\"48\" height=\"48\" ></a>\n");
      out.write("                <a href=\"#gettrain\" id=\"gettrain\" class=\"btn\" ><img src=\"icon_train.gif\" width=\"48\" height=\"48\"></a>\n");
      out.write("                <a href=\"#getwalk\" id=\"getwalk\" class=\"btn\" ><img src=\"icon-walk.gif\" width=\"48\" height=\"48\"></a>\t-->\t\n");
      out.write("\t    \t\t<p><label>Origin</label><input type=\"text\" value=\"\" id=\"dirSource\" class=\"form-control\" /></p>\n");
      out.write("\t    \t\t<p><label>Destination</label><input type=\"text\" value=\"\" id=\"dirDestination\" class=\"form-control\" /></p>\n");
      out.write("                        <a href=\"#getDirections\" id=\"getDirections\">Get Directions</a><br />\n");
      out.write("                        \n");
      out.write("                <a href=\"#reset\" id=\"paneReset\">Reset</a>\n");
      out.write("    \t\t</form>\t\n");
      out.write("    \t</div>\n");
      out.write("    \t<div id=\"directionSteps\">\n");
      out.write("    \t\t<p class=\"msg\">Direction Steps Will Render Here</p>\n");
      out.write("    \t</div>\n");
      out.write("    \t<a href=\"#toggleBtn\" id=\"paneToggle\" class=\"out\">&lt;</a>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\" src=\"include/js/map.js\"></script> \n");
      out.write("  </body>\n");
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
}
