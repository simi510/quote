package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <title>Sign Up</title>\n");
      out.write("    <h1>Sign Up</h1>\n");
      out.write("    <p>Enter your information to sign up.</p>\n");
      out.write("    <p><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i></p>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          \n");
      out.write("     <div class=\"row\">\n");
      out.write("                 \n");
      out.write("\n");
      out.write(" \n");
      out.write("          <form action=\"createAccount\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <input type=\"hidden\" name=\"formType\" value=\"create\" />\n");
      out.write("\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <label>Username</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"username\" /><br />\n");
      out.write("            \n");
      out.write("             <label>Firstname</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"firstname\" /><br />\n");
      out.write("             <label>Lastname</label> <input type=\"text\" class=\"form-control\" name=\n");
      out.write("            \"lastname\" /><br />\n");
      out.write("            \n");
      out.write("            <label>Password</label> <input type=\"password\" class=\"form-control\" name=\n");
      out.write("            \"password\" /><br />\n");
      out.write("            <label>Email</label> <input type=\"email\" class=\"form-control\" name=\n");
      out.write("            \"email\" /><br />\n");
      out.write("            <button type=\"submit\" value=\"Create\">Create</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                     </div>    \n");
      out.write("             </div>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("         \n");
      out.write("<br /><br /> <form action=\"\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"join\">\n");
      out.write("        <input type=\"submit\" value=\"Return Home\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>       \n");
      out.write("\n");
      out.write("             \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("\n");
      out.write("        \n");
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
