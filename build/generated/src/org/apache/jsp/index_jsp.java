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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body\r\n");
      out.write("        <nav class=\"navbar navbar-default\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Brand</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Link <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Link</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <form class=\"navbar-form navbar-left\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"#\">Link</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!-- /.navbar-collapse -->\r\n");
      out.write("            </div><!-- /.container-fluid -->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <form name=\"myform\" id=\"myform\">\r\n");
      out.write("            <table id=\"tab\">\r\n");
      out.write("                <tr id=\"r1\">\r\n");
      out.write("                    <th>#</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"r2\">\r\n");
      out.write("                    <td>1</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table id=\"blacklistgrid\">\r\n");
      out.write("                <tr id=\"Row1\">\r\n");
      out.write("                    <th>A</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"Row2\">\r\n");
      out.write("                    <td contenteditable=\"true\" ></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button type=\"button\" id=\"btnAdd\">Agregar fila!</button></br></br>\r\n");
      out.write("            <button type=\"button\" id=\"btnAddCol\">Agregar columna!</button></br></br>\r\n");
      out.write("            <button type=\"button\" id=\"btnrun\"/>Recorrer tabla</button>\r\n");
      out.write("        <button type=\"button\" id=\"btnsave\"/>Guardar</button>\r\n");
      out.write("</form\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.1.1.js\" integrity=\"sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
