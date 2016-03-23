package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminQuote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<script src=\"https://raw.githubusercontent.com/DLarsen/jquery-sumtr/master/jquery.sumtr.js\" type=\"text/javascript\"></script>\n");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h1>Welcome to the Admin Quote Page!!</h1>\n");
      out.write("        <p>You are logged in as ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <table class=\"table\"  id=\"DataGrid\">\n");
      out.write("        <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Origin</th>\n");
      out.write("                <th>Delivery</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>MPG</th>\n");
      out.write("                <th>Distance</th>\n");
      out.write("                <th>Gas Cost</th>\n");
      out.write("                <th>PPM</th>\n");
      out.write("                <th>Gallons</th>\n");
      out.write("                <th>Gas Cost</th>\n");
      out.write("                <th>PPM Cost</th>\n");
      out.write("                <th>Total Cost</th>\n");
      out.write("            </tr>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           \n");
      out.write("                <tr class=\"summary\">\n");
      out.write("                    <td>Totals:</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("                <!-- Modal -->\n");
      out.write("        <div id=\"editForm\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("          <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("            <!-- Modal content-->\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("            <form action=\"QuoteServlet\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <input type=\"hidden\" name=\"formType\" value=\"edit\" />\n");
      out.write("                <input id = \"id-field\" type=\"hidden\" name=\"id\" />\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12\"> \n");
      out.write(" \n");
      out.write("\n");
      out.write("                   <label>Origin</label> <input id = \"origin-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"origin\" /><br />\n");
      out.write("                   <label>Destination</label> <input id = \"destination-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"destination\" /><br />\n");
      out.write("                   <label>Price</label> <input id = \"price-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"price\" /><br />\n");
      out.write("\n");
      out.write("                  <label>MPG</label> <input id = \"mpg-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"mpg\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>Distance</label> <input id = \"distance-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"distance\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>Gas Price</label> <input id = \"gasType-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"gasType\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>PPM</label> <input id = \"ppm-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"ppm\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>Gallons</label> <input id = \"gallons-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"gallons\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>Gas Cost</label> <input id = \"gasCost-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"gasCost\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>PPM Cost</label> <input id = \"ppmCost-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"ppmCost\" /><br />\n");
      out.write("                  \n");
      out.write("                  <label>Total Cost</label> <input id = \"totalCost-field\" type=\"text\" class=\"form-control\" name=\n");
      out.write("                  \"totalCost\" /><br />\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-primary btn-block\" />\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("         \n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger btn-block\" data-dismiss=\"modal\">Close</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("    //id, origin,  destination,  price,  mpg, distance,  gasType,  ppm,  gallons,  gasCost, ppmCost, totalCost\n");
      out.write("        $(document).ready(function() {\n");
      out.write("       // alert(\"hi!\");\n");
      out.write("       $(\".edit-button\").click(function(){\n");
      out.write("          var $id = $(this).attr(\"id\");\n");
      out.write("          var $tableRow = $(this).closest(\"tr\"); \n");
      out.write("          //alert($tableRow.children(\".firstname-cell\").text());\n");
      out.write("          var $origin = $tableRow.children(\".origin-cell\").text();\n");
      out.write("          var $destination = $tableRow.children(\".destination-cell\").text();\n");
      out.write("          var $price = $tableRow.children(\".price-cell\").text();\n");
      out.write("          var $mpg = $tableRow.children(\".mpg-cell\").text();\n");
      out.write("          var $distance = $tableRow.children(\".distance-cell\").text();\n");
      out.write("          var $gasType = $tableRow.children(\".gasType-cell\").text();\n");
      out.write("          var $ppm = $tableRow.children(\".ppm-cell\").text();\n");
      out.write("          var $gallons = $tableRow.children(\".gallons-cell\").text();\n");
      out.write("          var $gasCost = $tableRow.children(\".gasCost-cell\").text();\n");
      out.write("          var $ppmCost = $tableRow.children(\".ppmCost-cell\").text();\n");
      out.write("          var $totalCost = $tableRow.children(\".totalCost-cell\").text();\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          // set the form input values\n");
      out.write("          $(\"#id-field\").val($id);\n");
      out.write("          $(\"#origin-field\").val($origin); \n");
      out.write("          $(\"#distance-field\").val($distance); \n");
      out.write("          $(\"#destination-field\").val($destination);\n");
      out.write("          $(\"#price-field\").val($price);\n");
      out.write("          $(\"#mpg-field\").val($mpg);\n");
      out.write("          $(\"#distance-field\").val($distance); \n");
      out.write("          $(\"#gasType-field\").val($gasType); \n");
      out.write("          $(\"#ppm-field\").val($ppm); \n");
      out.write("          $(\"#gallons-field\").val($gallons); \n");
      out.write("          $(\"#ppmCost-field\").val($ppmCost); \n");
      out.write("          $(\"#gasCost-field\").val($gasCost); \n");
      out.write("          $(\"#totalCost-field\").val($totalCost); \n");
      out.write("\n");
      out.write("\n");
      out.write("             \n");
      out.write("          \n");
      out.write("\n");
      out.write("       });\n");
      out.write("       \n");
      out.write("        var c3Total = 0;\n");
      out.write("        var c4Total = 0;\n");
      out.write("        var c5Total = 0;\n");
      out.write("        var c6Total = 0;\n");
      out.write("        var c7Total = 0;\n");
      out.write("        var c8Total = 0;\n");
      out.write("        var c9Total = 0;\n");
      out.write("        var c10Total = 0;  \n");
      out.write("        var c11Total = 0;\n");
      out.write("        var c12Total = 0;\n");
      out.write(" \n");
      out.write("\n");
      out.write("        $(\"tr\").find(\"td\").each(function(){\n");
      out.write("            var curVal = parseFloat($(this).text());\n");
      out.write("\n");
      out.write("            if(!isNaN(curVal)){\n");
      out.write("                if($(this).index() == 3){\n");
      out.write("                   c3Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 4){\n");
      out.write("                   c4Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 5){\n");
      out.write("                   c5Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 6){\n");
      out.write("                   c6Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 7){\n");
      out.write("                   c7Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 8){\n");
      out.write("                   c8Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 9){\n");
      out.write("                   c9Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 10){\n");
      out.write("                   c10Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 11){\n");
      out.write("                   c11Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                else if($(this).index() == 12){\n");
      out.write("                   c12Total += parseFloat($(this).text().toFixed(2));\n");
      out.write("                }\n");
      out.write("                 \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        $(\"#DataGrid tr:last td:eq(3)\").text(c3Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(4)\").text(c4Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(5)\").text(c5Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(6)\").text(c6Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(7)\").text(c7Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(8)\").text(c8Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(9)\").text(c9Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(10)\").text(c10Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(11)\").text(c11Total );\n");
      out.write("        $(\"#DataGrid tr:last td:eq(12)\").text(c12Total );\n");
      out.write("\n");
      out.write("       // $('#DataGrid').sumtr({sumCells : '.totalCost-cell'});\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("\n");
      out.write(" ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("       ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("map");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.maplist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            \n");
          out.write("            <tr>\n");
          out.write("                <td class=\"id-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"origin-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.origin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"destination-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.destination}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"price-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"mpg-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.mpg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"distance-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.distance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"gasType-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.gasType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"ppm-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.ppm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"gallons-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.gallons}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"gasCost-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.gasCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"ppmCost-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.ppmCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td class=\"totalCost-cell\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.totalCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>\n");
          out.write("                    <!-- Trigger the modal with a button -->\n");
          out.write("                    \n");
          out.write("              \n");
          out.write("        <form action=\"QuoteServlet\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
          out.write("            \n");
          out.write("                  <button class = \"edit-button btn btn-warning btn-sm\" id =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"button\" data-toggle=\"modal\" \n");
          out.write("        data-target=\"#editForm\">Edit</button>\n");
          out.write("        \n");
          out.write("                <input type=\"hidden\" name=\"formType\" value=\"delete\" />\n");
          out.write("                <input id = \"delete-field\" type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("         <button class = \"delete-button btn btn-danger btn-sm\" id =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"Submit\"  >Delete ID: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</button>\n");
          out.write("        </form>\n");
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
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
