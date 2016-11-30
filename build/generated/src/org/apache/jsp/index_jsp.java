package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"myform\" id=\"myform\">\n");
      out.write("            <table id=\"tab\">\n");
      out.write("                <tr id=\"r1\">\n");
      out.write("                    <th>#</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr id=\"r2\">\n");
      out.write("                    <td>1</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table id=\"blacklistgrid\">\n");
      out.write("                <tr id=\"Row1\">\n");
      out.write("                    <th>A</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr id=\"Row2\">\n");
      out.write("                    <td contenteditable=\"true\" ></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <button type=\"button\" id=\"btnAdd\">Agregar fila!</button></br></br>\n");
      out.write("            <button type=\"button\" id=\"btnAddCol\">Agregar columna!</button></br></br>\n");
      out.write("            <button type=\"button\" id=\"btnrun\"/>Recorrer tabla</button>\n");
      out.write("            <button type=\"button\" id=\"btnsave\"/>Guardar</button>\n");
      out.write("    </form>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.js\" integrity=\"sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js.js\" type=\"text/javascript\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
