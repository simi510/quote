package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class printQuote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("  \n");
      out.write("  <script src=\"include/js/jquery-1.12.0.min.js\" type=\"text/javascript\">\n");
      out.write("</script><!-- Latest compiled JavaScript -->\n");
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
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"include/js/bootstrap.min.js\" type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <input type=\"hidden\" name=\"formType\" value=\"quote\" />\n");
      out.write("        <button type=\"button\" class=\"btn btn-success btn-block\" name=\"back\" onclick=\"history.back()\">Go Back</button><br><br>\n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("    \t\t<div class=\"invoice-title\">\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
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
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Distance Traveled</strong></td>\n");
      out.write("                                                                <td class=\"text-center\"><strong>Pay Per Mile</strong></td>\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Fuel Use (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gasList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")</strong></td>\n");
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
      out.write(" miles</td>\n");
      out.write("                                                                <td class=\"text-center\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gallons}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" gal</td>\n");
      out.write("                                                                <td class=\"text-right\">Per Mile: $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppmCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br /> Fuel: $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gasCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                        </tr> ");
      out.write("\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line\"></td>\n");
      out.write("                                                                <td class=\"thick-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line text-center\"><strong>Subtotal</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"thick-line text-right\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppmCost + gasCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("                                                                <td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Fuel Surcharge</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\">$0.00</td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\n");
      out.write("                                                                <td class=\"no-line\"></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Total</strong></td>\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\"> $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ppmCost + gasCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteId!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<h2>Quote</h2><h3 class=\"pull-right\"><b>PO # ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</b></h3>");
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
}
