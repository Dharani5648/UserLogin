/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-02-22 17:14:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sign in</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        body, html {\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        .bg-image {\n");
      out.write("            background-image: url('D.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            /*border-radius: 30px; !* Adjusted border radius *!*/\n");
      out.write("            /*box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1); !* Soft shadow *!*/\n");
      out.write("            background-color: transparent;\n");
      out.write("        }\n");
      out.write("        .p-5 {\n");
      out.write("            padding: 2rem !important; /* Increased padding */\n");
      out.write("        }\n");
      out.write("        .form-outline input.form-control:focus {\n");
      out.write("            /*border-color: #80bdff; !* Focus color for input fields *!*/\n");
      out.write("            /*box-shadow: 0 0 0 0.25rem rgba(0, 123, 255, 0.25); !* Focus shadow for input fields *!*/\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .custom-btn {\n");
      out.write("            background-color:#ffcc00; /* Change to your desired color */\n");
      out.write("            border: none; /* Change border color if needed */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Hover state */\n");
      out.write("        .custom-btn:hover {\n");
      out.write("            background-color: #e6b800; /* Change to a different color on hover */\n");
      out.write("            border: none; /* Change border color on hover if needed */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form class=\"vh-100 bg-image\" action=\"register\" method=\"POST\">\n");
      out.write("    <div class=\"container py-5 h-100\">\n");
      out.write("        <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("            <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\n");
      out.write("\n");
      out.write("                    <div class=\"card-body p-5 text-center\">\n");
      out.write("                        <h3 class=\" fs-1 mb-5\" style=\"font-weight: bold;\">Sign in</h3>\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <input type=\"email\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" name=\"email\"/>\n");
      out.write("                            <label class=\"form-label email-label\" for=\"typeEmailX-2\" style=\"color: white; font-weight: bold;\">Email</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <input type=\"password\" id=\"typePasswordX-2\" class=\"form-control form-control-lg\" name=\"password\"/>\n");
      out.write("                            <label class=\"form-label password-label\" for=\"typePasswordX-2\" style=\"color: white; font-weight: bold;\">Password</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input class=\"btn btn-lg btn-block custom-btn\" type=\"submit\" value=\"Register Now\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
