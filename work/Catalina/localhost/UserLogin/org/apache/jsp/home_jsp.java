/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-02-21 17:17:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/S.%20Dharani/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1153506114000L));
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("  <title>Home</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"/css/style.css\" />\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"/>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("          integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\n");
      out.write("          crossorigin=\"anonymous\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"/Website/css/style.css\" />\n");
      out.write("  <script src=\"/Website/js/script.js\" defer></script>\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      background-image: url('https://static.vecteezy.com/system/resources/thumbnails/002/018/246/original/abstract-colorful-pastel-gradient-background-free-video.jpg');\n");
      out.write("      font-family: 'Arial', sans-serif;\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    header {\n");
      out.write("      background-color: #333;\n");
      out.write("      color: white;\n");
      out.write("      text-align: center;\n");
      out.write("      padding: 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main {\n");
      out.write("      margin: 30px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h1 {\n");
      out.write("      font-size: 3rem;\n");
      out.write("      color: #fff;\n");
      out.write("      margin-top: 50px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2 {\n");
      out.write("      font-size: 2rem;\n");
      out.write("      background-color: #3f3d3d;\n");
      out.write("      color: white;\n");
      out.write("      padding: 10px;\n");
      out.write("      margin-top: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p {\n");
      out.write("      margin-top: 10px;\n");
      out.write("      margin-left: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    footer {\n");
      out.write("      background-color: #333;\n");
      out.write("      color: white;\n");
      out.write("      text-align: center;\n");
      out.write("      padding: 1em;\n");
      out.write("      position: fixed;\n");
      out.write("      bottom: 0;\n");
      out.write("      width: 100%;\n");
      out.write("      margin-top: 20px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("  <h1>Welcome! ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<main>\n");
      out.write("  <h2>About Us</h2>\n");
      out.write("  <p>\n");
      out.write("    Welcome to Our Website! We are a dedicated team committed to providing exceptional services and creating\n");
      out.write("    meaningful experiences for our clients. Our mission is to exceed expectations and deliver innovative solutions\n");
      out.write("    tailored to your needs. With a focus on quality and customer satisfaction, we aim to be a reliable partner in\n");
      out.write("    your journey towards success.\n");
      out.write("  </p>\n");
      out.write("\n");
      out.write("  <h2>Services</h2>\n");
      out.write("  <p>\n");
      out.write("    Our experienced team of designers will create a visually stunning and user-friendly website tailored to your\n");
      out.write("    business needs\n");
      out.write("  </p>\n");
      out.write("\n");
      out.write("  <h2>Contact</h2>\n");
      out.write("  <p>\n");
      out.write("    For inquiries, please email us at: <a href=\"mailto:info@example.com\">info@example.com</a>\n");
      out.write("  </p>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("  &copy; 2024 Our Website. All rights reserved.\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
