package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_var_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_set_var_select_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_out_select_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_parse_xml_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_var_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_set_var_select_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_out_select_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_parse_xml_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_var_url_nobody.release();
    _jspx_tagPool_x_set_var_select_nobody.release();
    _jspx_tagPool_x_out_select_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_x_parse_xml_var_nobody.release();
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
      out.write("\n");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true&libraries=places\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("         <h2>Trip calculator</h2>\n");
      out.write("    <div class=\"new\">\n");
      out.write("        <h3> Enter the values for the map.</h3>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form action=\"mapCreate\" method=\"post\" class=\"form-horizontal\" role=\"form\"> \n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("      \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("     \n");
      out.write(" \n");
      out.write("          <input type=\"hidden\" name=\"formType\" value=\"create\" />\n");
      out.write("          ");
      out.write("\n");
      out.write("      \n");
      out.write("          \n");
      out.write("          \n");
      out.write("\n");
      out.write("            <div id=\"mapCanvas\">&#160;</div>\n");
      out.write("            <div id=\"directionsPanel\">\n");
      out.write("                 <div class=\"directionInputs\">\n");
      out.write("                    <label>Origin</label> <input id=\"dirSource\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                        \"origin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${origin== null ? 'Salinas, CA' : origin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br />\n");
      out.write("                    <label>Destination</label> <input id=\"dirDestination\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                        \"destination\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${destination== null ? 'Allentown, PA' : destination}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <br />\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write(" \n");
      out.write("            <label>Initial Price</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("                \"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price== null ? '4500' : price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br />\n");
      out.write("            <label>MPG</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("                \"mpg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mpg== null ? '6' : mpg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br />\n");
      out.write("            <label>Driver Pay Per Mile</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("                \"ppm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppm== null ? '0.40' : ppm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> <br />\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("              <label for=\"gasList\">Select Fuel type:</label>\n");
      out.write("              <select class=\"form-control\" id=\"gasList\" name=\"gasList\">\n");
      out.write("                <option>Diesel</option>\n");
      out.write("                <option>CNG</option>\n");
      out.write("                <option>E85</option>\n");
      out.write("                <option>Electric</option>\n");
      out.write("                <option>LPG</option>\n");
      out.write("                <option>Regular</option>\n");
      out.write("                <option>Midgrade</option>\n");
      out.write("                <option>Premium</option>            \n");
      out.write("              </select>\n");
      out.write("             \n");
      out.write("            <br />\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Submit\">Create</button>\n");
      out.write("          \n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_x_parse_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        The National Fuel Average is... <b> ");
      if (_jspx_meth_x_out_0(_jspx_page_context))
        return;
      out.write("</b>.\n");
      out.write("        \n");
      out.write("\n");
      out.write(" \n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                   \n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("\n");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("     \n");
      out.write("    \n");
      out.write("      </div>    \n");
      out.write("   \n");
      out.write("    </div>  \n");
      out.write("   </form>\n");
      out.write("</div> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"include/js/map.js\"></script>\n");
      out.write("\n");
      if (_jspx_meth_c_import_3(_jspx_page_context))
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
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_var_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setVar("gasInfo");
    _jspx_th_c_import_1.setUrl("http://www.fueleconomy.gov/ws/rest/fuelprices");
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
      _jspx_tagPool_c_import_var_url_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_x_parse_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:parse
    org.apache.taglibs.standard.tag.rt.xml.ParseTag _jspx_th_x_parse_0 = (org.apache.taglibs.standard.tag.rt.xml.ParseTag) _jspx_tagPool_x_parse_xml_var_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ParseTag.class);
    _jspx_th_x_parse_0.setPageContext(_jspx_page_context);
    _jspx_th_x_parse_0.setParent(null);
    _jspx_th_x_parse_0.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gasInfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_x_parse_0.setVar("gasOutput");
    int _jspx_eval_x_parse_0 = _jspx_th_x_parse_0.doStartTag();
    if (_jspx_th_x_parse_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
      return true;
    }
    _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
    return false;
  }

  private boolean _jspx_meth_x_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_0 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_0.setPageContext(_jspx_page_context);
    _jspx_th_x_out_0.setParent(null);
    _jspx_th_x_out_0.setSelect("$gasOutput/fuelPrices/premium");
    int _jspx_eval_x_out_0 = _jspx_th_x_out_0.doStartTag();
    if (_jspx_th_x_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_0);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.origin!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("    \n");
        out.write("     ");
        if (_jspx_meth_c_import_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_x_parse_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_x_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("    ");
        out.write("\n");
        out.write("  \n");
        out.write("    \n");
        out.write("    \n");
        out.write("    \n");
        out.write("    \n");
        out.write("   \n");
        out.write("    \n");
        out.write("\n");
        out.write("                   ");
        out.write("\n");
        out.write("   \n");
        out.write("\n");
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

  private boolean _jspx_meth_c_import_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_var_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_2.setPageContext(_jspx_page_context);
    _jspx_th_c_import_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_import_2.setVar("mapInfo");
    _jspx_th_c_import_2.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("http://maps.googleapis.com/maps/api/distancematrix/xml?origins=${sessionScope.map.origin}&destinations=${sessionScope.map.destination}&units=imperial&mode=driving&language=en&sensor=false", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_import_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_2 = _jspx_th_c_import_2.doStartTag();
      if (_jspx_th_c_import_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_2.doFinally();
      _jspx_tagPool_c_import_var_url_nobody.reuse(_jspx_th_c_import_2);
    }
    return false;
  }

  private boolean _jspx_meth_x_parse_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:parse
    org.apache.taglibs.standard.tag.rt.xml.ParseTag _jspx_th_x_parse_1 = (org.apache.taglibs.standard.tag.rt.xml.ParseTag) _jspx_tagPool_x_parse_xml_var_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ParseTag.class);
    _jspx_th_x_parse_1.setPageContext(_jspx_page_context);
    _jspx_th_x_parse_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_x_parse_1.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mapInfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_x_parse_1.setVar("output");
    int _jspx_eval_x_parse_1 = _jspx_th_x_parse_1.doStartTag();
    if (_jspx_th_x_parse_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_1);
      return true;
    }
    _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_1);
    return false;
  }

  private boolean _jspx_meth_x_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:set
    org.apache.taglibs.standard.tag.common.xml.SetTag _jspx_th_x_set_0 = (org.apache.taglibs.standard.tag.common.xml.SetTag) _jspx_tagPool_x_set_var_select_nobody.get(org.apache.taglibs.standard.tag.common.xml.SetTag.class);
    _jspx_th_x_set_0.setPageContext(_jspx_page_context);
    _jspx_th_x_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_x_set_0.setVar("dist");
    _jspx_th_x_set_0.setSelect("$output//DistanceMatrixResponse/row/element/distance/value");
    int _jspx_eval_x_set_0 = _jspx_th_x_set_0.doStartTag();
    if (_jspx_th_x_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_set_var_select_nobody.reuse(_jspx_th_x_set_0);
      return true;
    }
    _jspx_tagPool_x_set_var_select_nobody.reuse(_jspx_th_x_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.origin!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("    <div class=\"col-sm-3\">\n");
        out.write("        \n");
        out.write("        <label>Distance Traveled In Miles</label> <input id = \"dist-field\" type=\"text\" class=\"form-control\" name=\n");
        out.write("            \"dist\" value=\"Calculating...\"/><br />\n");
        out.write("        <label>Gallons Used</label> <input  id = \"gallons-field\"type=\"text\" class=\"form-control\" name=\n");
        out.write("            \"gallons\" value=\"Calculating...\"/><br />\n");
        out.write("        <label>National Average Cost of Fuel</label> <input  id = \"diesel-field\" type=\"text\" class=\"form-control\" name=\n");
        out.write("            \"diesel\" value=\"Calculating...\"/><br />\n");
        out.write("        <label>Cost of Diesel</label> <input  id = \"gasCost-field\" type=\"text\" class=\"form-control\" name=\n");
        out.write("            \"gasCost\" value=\"Calculating...\"/><br />\n");
        out.write("        <label>Driver Pay Per Mile Cost</label> <input id = \"ppm-field\" type=\"text\" class=\"form-control\" name=\n");
        out.write("            \"ppmCost\" value=\"Calculating...\"/><br />\n");
        out.write("        <label>Ending Balance</label> <input id = \"totalCost-field\" type=\"text\" class=\"form-control\" name=\n");
        out.write("            \"totalCost\" value=\"Calculating...\"/><br />\n");
        out.write("        \n");
        out.write("        \n");
        out.write("        \n");
        out.write("         <input type=\"hidden\" name=\"formType\" value=\"quote\" />\n");
        out.write("         <button type=\"submit\" class=\"btn btn-primary btn-block\" name=\"action\" value=\"makeQuote\">Make Quote</button>\n");
        out.write("        \n");
        out.write("\n");
        out.write("        \n");
        out.write("    </div>\n");
        out.write(" \n");
        out.write("    \n");
        out.write("    \n");
        out.write("    \n");
        out.write("                 <div class=\"col-sm-6\">\n");
        out.write("            \n");
        out.write("      <div style=\"overflow:hidden;width:850px;height:500px;resize:none;max-width:100%;\"><div id=\"gmap_canvas\" style=\"height:100%; width:100%;max-width:100%;\"><iframe style=\"height:100%;width:100%;border:0;\" frameborder=\"0\" src=\"https://www.google.com/maps/embed/v1/directions?origin=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.map.origin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&destination=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.map.destination}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU\"></iframe></div><a class=\"code-for-google-map\" href=\"https://www.bootstrapskins.com\" id=\"enable-map-data\">buy html themes</a><style>#gmap_canvas .text-marker{max-width:none!important;background:none!important;}img{max-width:none}</style></div>\n");
        out.write("      <script src=\"https://www.bootstrapskins.com/google-maps-authorization.js?id=662dfadd-2c44-ff05-e721-3920adb6b7eb&c=code-for-google-map&u=1455863258\" defer=\"defer\" async=\"async\"></script>      \n");
        out.write("            </div>\n");
        out.write("      \n");
        out.write("      \n");
        out.write("      \n");
        out.write("<script>\n");
        out.write("        $(document).ready(function() {\n");
        out.write("             $(\"#gasList\").val(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gasList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\").attr('selected', 'selected');\n");
        out.write("            \n");
        out.write("               if($( \"#gasList option:selected\" ).text() === \"Diesel\") {  var $gas = ");
        if (_jspx_meth_x_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("          else if($( \"#gasList option:selected\" ).text() === \"CNG\") {     var $gas = ");
        if (_jspx_meth_x_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("          else if($( \"#gasList option:selected\" ).text() === \"Electric\") {var $gas = ");
        if (_jspx_meth_x_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("          else if($( \"#gasList option:selected\" ).text() === \"LPG\") {     var $gas = ");
        if (_jspx_meth_x_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("          else if($( \"#gasList option:selected\" ).text() === \"Regular\") { var $gas = ");
        if (_jspx_meth_x_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("          else if($( \"#gasList option:selected\" ).text() === \"Midgrade\") {var $gas = ");
        if (_jspx_meth_x_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("          else if($( \"#gasList option:selected\" ).text() === \"Premium\") { var $gas = ");
        if (_jspx_meth_x_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("; }\n");
        out.write("\n");
        out.write("\n");
        out.write("          var $pri =  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(";\n");
        out.write("          var $mp  =  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mpg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(";\n");
        out.write("          var $pm =  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(";\n");
        out.write("          var $dist= ( ");
        if (_jspx_meth_x_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("  / 1000000000 * 621371);\n");
        out.write("          \n");
        out.write("          var $gallons = ($dist / $mp );\n");
        out.write("          var $ppmCost = ($pm * $dist);\n");
        out.write("          var $gasCost = ($gallons * $gas ) ;\n");
        out.write("          var $totalCost = ($pri - $gasCost - $ppmCost);\n");
        out.write("          \n");
        out.write("          $(\"#dist-field\").val($dist.toFixed(3));\n");
        out.write("          $(\"#diesel-field\").val($gas.toFixed(2));\n");
        out.write("          $(\"#gallons-field\").val($gallons.toFixed(2));\n");
        out.write("          $(\"#gasCost-field\").val($gasCost.toFixed(2));\n");
        out.write("          $(\"#ppm-field\").val($ppmCost.toFixed(2));\n");
        out.write("          $(\"#totalCost-field\").val($totalCost.toFixed(2));\n");
        out.write("          \n");
        out.write("          //$(\"#dist-field-hidden\").val($dist.toFixed(3));\n");
        out.write("         // $(\"#gas-field-hidden\").val($gas);\n");
        out.write("\n");
        out.write("          ");
        out.write("\n");
        out.write("\n");
        out.write("    });\n");
        out.write("    \n");
        out.write("\n");
        out.write("</script>\n");
        out.write("\n");
        out.write("\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_x_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_1 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_1.setPageContext(_jspx_page_context);
    _jspx_th_x_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_1.setSelect("$gasOutput/fuelPrices/diesel");
    int _jspx_eval_x_out_1 = _jspx_th_x_out_1.doStartTag();
    if (_jspx_th_x_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_1);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_1);
    return false;
  }

  private boolean _jspx_meth_x_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_2 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_2.setPageContext(_jspx_page_context);
    _jspx_th_x_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_2.setSelect("$gasOutput/fuelPrices/cng");
    int _jspx_eval_x_out_2 = _jspx_th_x_out_2.doStartTag();
    if (_jspx_th_x_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_2);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_2);
    return false;
  }

  private boolean _jspx_meth_x_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_3 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_3.setPageContext(_jspx_page_context);
    _jspx_th_x_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_3.setSelect("$gasOutput/fuelPrices/electric");
    int _jspx_eval_x_out_3 = _jspx_th_x_out_3.doStartTag();
    if (_jspx_th_x_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_3);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_3);
    return false;
  }

  private boolean _jspx_meth_x_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_4 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_4.setPageContext(_jspx_page_context);
    _jspx_th_x_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_4.setSelect("$gasOutput/fuelPrices/lpg");
    int _jspx_eval_x_out_4 = _jspx_th_x_out_4.doStartTag();
    if (_jspx_th_x_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_4);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_4);
    return false;
  }

  private boolean _jspx_meth_x_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_5 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_5.setPageContext(_jspx_page_context);
    _jspx_th_x_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_5.setSelect("$gasOutput/fuelPrices/regular");
    int _jspx_eval_x_out_5 = _jspx_th_x_out_5.doStartTag();
    if (_jspx_th_x_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_5);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_5);
    return false;
  }

  private boolean _jspx_meth_x_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_6 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_6.setPageContext(_jspx_page_context);
    _jspx_th_x_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_6.setSelect("$gasOutput/fuelPrices/midgrade");
    int _jspx_eval_x_out_6 = _jspx_th_x_out_6.doStartTag();
    if (_jspx_th_x_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_6);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_6);
    return false;
  }

  private boolean _jspx_meth_x_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_7 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_7.setPageContext(_jspx_page_context);
    _jspx_th_x_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_7.setSelect("$gasOutput/fuelPrices/premium");
    int _jspx_eval_x_out_7 = _jspx_th_x_out_7.doStartTag();
    if (_jspx_th_x_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_7);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_7);
    return false;
  }

  private boolean _jspx_meth_x_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_8 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_8.setPageContext(_jspx_page_context);
    _jspx_th_x_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_x_out_8.setSelect("$output/DistanceMatrixResponse/row/element/distance/value");
    int _jspx_eval_x_out_8 = _jspx_th_x_out_8.doStartTag();
    if (_jspx_th_x_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_8);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_8);
    return false;
  }

  private boolean _jspx_meth_c_import_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_3 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_3.setPageContext(_jspx_page_context);
    _jspx_th_c_import_3.setParent(null);
    _jspx_th_c_import_3.setUrl("/include/footer.jsp");
    int[] _jspx_push_body_count_c_import_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_3 = _jspx_th_c_import_3.doStartTag();
      if (_jspx_th_c_import_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_3.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_3);
    }
    return false;
  }
}
