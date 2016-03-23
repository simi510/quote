package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("    \t\t<div class=\"invoice-title\">\n");
      out.write("    \t\t\t<h2>Invoice</h2><h3 class=\"pull-right\">Order # 12345</h3>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<hr>\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-xs-6\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("    \t\t\t\t<strong>Billed To:</strong><br>\n");
      out.write("    \t\t\t\t\tJohn Smith<br>\n");
      out.write("    \t\t\t\t\t1234 Main<br>\n");
      out.write("    \t\t\t\t\tApt. 4B<br>\n");
      out.write("    \t\t\t\t\tSpringfield, ST 54321\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-xs-6 text-right\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("        \t\t\t<strong>Shipped From:</strong><br>\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${origin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-xs-6\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("    \t\t\t\t\t<strong>Payment Method:</strong><br>\n");
      out.write("    \t\t\t\t\tNet 30<br>\n");
      out.write("    \t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-xs-6 text-right\">\n");
      out.write("    \t\t\t\t<address>\n");
      out.write("        \t\t\t<strong>Shipped To:</strong><br>\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${destination}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    \t\t\t\t</address>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("    \t<div class=\"col-md-12\">\n");
      out.write("    \t\t<div class=\"panel panel-default\">\n");
      out.write("    \t\t\t<div class=\"panel-heading\">\n");
      out.write("    \t\t\t\t<h3 class=\"panel-title\"><strong>Order summary</strong></h3>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"panel-body\">\n");
      out.write("    \t\t\t\t<div class=\"table-responsive\">\n");
      out.write("    \t\t\t\t\t<table class=\"table table-condensed\">\n");
      out.write("    \t\t\t\t\t\t<thead>\n");
      out.write("                                <tr>\n");
      out.write("        \t\t\t\t\t\t\t<td><strong>Trip</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Miles Traveled</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Fuel Cost</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-right\"><strong>Driver Pay</strong></td>\n");
      out.write("                                </tr>\n");
      out.write("    \t\t\t\t\t\t</thead>\n");
      out.write("    \t\t\t\t\t\t<tbody>\n");
      out.write("    \t\t\t\t\t\t\t<!-- foreach ($order->lineItems as $line) or some such thing here -->\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${origin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" -to- ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${destination}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gasCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-right\">$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppmCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                        </tr> ");
      out.write("\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line text-center\"><strong>Subtotal</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line text-right\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Fuel Surcharge</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\">$0.00</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Total</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t</tbody>\n");
      out.write("    \t\t\t\t\t</table>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       \n");
      out.write(" ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write(' ');
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
