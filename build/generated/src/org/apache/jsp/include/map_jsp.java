package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("    <div class=\"new\">\n");
      out.write("        <h3> Enter the values for the map </h3>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <h3>Trip calculator</h3>\n");
      out.write("\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <form action=\"createMap\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <input type=\"hidden\" name=\"formType\" value=\"create\" />\n");
      out.write("\n");
      out.write("          <div class=\"col-md-2\">\n");
      out.write("            <label>Origin</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"origin\" /><br /> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.origin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            <label>Destination</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"destination\" /><br />\n");
      out.write("            <label>Price</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"price\" /><br />\n");
      out.write("            <label>MPG</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"mpg\" /><br />\n");
      out.write("            <button type=\"submit\" value=\"Create\">Create</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script\n");
      out.write("src=\"http://maps.googleapis.com/maps/api/js\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function initialize() {\n");
      out.write("  var mapProp = {\n");
      out.write("    center:new google.maps.LatLng(37.656104, -122.053743),\n");
      out.write("    zoom:5,\n");
      out.write("    mapTypeId:google.maps.MapTypeId.ROADMAP\n");
      out.write("  };\n");
      out.write("  var map=new google.maps.Map(document.getElementById(\"googleMap\"), mapProp);\n");
      out.write("}\n");
      out.write("google.maps.event.addDomListener(window, 'load', initialize);\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <iframe\n");
      out.write("  width=\"600\"\n");
      out.write("  height=\"450\"\n");
      out.write("  frameborder=\"0\" style=\"border:0\"\n");
      out.write("  src=\"https://www.google.com/maps/embed/v1/place?key=AIzaSyAtUzHb_NmeWA0YFuWcGM8yWcQpTHQlBbY\n");
      out.write("    &q=Space+Needle,Seattle+WA\" allowfullscreen>\n");
      out.write("</iframe>\n");
      out.write(" \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div style=\"width:500px;max-width:100%;overflow:hidden;height:500px;color:red;\"><div id=\"gmap_canvas\" style=\"height:100%; width:100%;max-width:100%;\"><iframe style=\"height:100%;width:100%;border:0;\" frameborder=\"0\" src=\"https://www.google.com/maps/embed/v1/directions?origin=salinas,+ca&destination=allentown,+pa&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU\"></iframe>\n");
      out.write("        </div><a class=\"google-map-enabler\" href=\"http://www.bootstrapskins.com/themes\" id=\"enable-map-info\">buy bootstrap themes</a><style>#gmap_canvas img{max-width:none!important;background:none!important;font-size: inherit;}</style></div><script src=\"https://www.bootstrapskins.com/google-maps-authorization.js?id=478af3a1-7fd8-8bd9-ca2d-feef2b5c0f38&c=google-map-enabler&u=1455490673\" defer=\"defer\" async=\"async\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div id=\"googleMap\" style=\"width:500px;height:380px;\"></div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" id=\"WolframAlphaScriptb37731fb3093b83e07b68990d3619d28\" src=\"//www.wolframalpha.com/widget/widget.jsp?id=b37731fb3093b83e07b68990d3619d28\"></script>\n");
      out.write("\n");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
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
