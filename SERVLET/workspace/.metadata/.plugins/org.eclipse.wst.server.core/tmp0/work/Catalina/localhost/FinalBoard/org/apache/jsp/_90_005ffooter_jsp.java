/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-13 06:16:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _90_005ffooter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1584003304432L));
    _jspx_dependants.put("jar:file:/C:/_jsp/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FinalBoard/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("        <!-- *** FOOTER ***\n");
      out.write(" _________________________________________________________ -->\n");
      out.write("        <div id=\"footer\" data-animate=\"fadeInUp\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <h4>Pages</h4>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"text.html\">About us</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"text.html\">Terms and conditions</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"faq.html\">FAQ</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"contact.html\">Contact us</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("\n");
      out.write("                        <h4>User section</h4>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#login-modal\">Login</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"register.html\">Regiter</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <hr class=\"hidden-md hidden-lg hidden-sm\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-md-3 -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("\n");
      out.write("                        <h4>Top categories</h4>\n");
      out.write("\n");
      out.write("                        <h5>Men</h5>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"category.html\">T-shirts</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"category.html\">Shirts</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"category.html\">Accessories</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <h5>Ladies</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"category.html\">T-shirts</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"category.html\">Skirts</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"category.html\">Pants</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"category.html\">Accessories</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <hr class=\"hidden-md hidden-lg\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-md-3 -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("\n");
      out.write("                        <h4>Where to find us</h4>\n");
      out.write("\n");
      out.write("                        <p><strong>Obaju Ltd.</strong>\n");
      out.write("                            <br>13/25 New Avenue\n");
      out.write("                            <br>New Heaven\n");
      out.write("                            <br>45Y 73J\n");
      out.write("                            <br>England\n");
      out.write("                            <br>\n");
      out.write("                            <strong>Great Britain</strong>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <a href=\"contact.html\">Go to contact page</a>\n");
      out.write("\n");
      out.write("                        <hr class=\"hidden-md hidden-lg\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-md-3 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("\n");
      out.write("                        <h4>Get the news</h4>\n");
      out.write("\n");
      out.write("                        <p class=\"text-muted\">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("\n");
      out.write("\t\t\t    <button class=\"btn btn-default\" type=\"button\">Subscribe!</button>\n");
      out.write("\n");
      out.write("\t\t\t</span>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /input-group -->\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("\n");
      out.write("                        <h4>Stay in touch</h4>\n");
      out.write("\n");
      out.write("                        <p class=\"social\">\n");
      out.write("                            <a href=\"#\" class=\"facebook external\" data-animate-hover=\"shake\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"twitter external\" data-animate-hover=\"shake\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"instagram external\" data-animate-hover=\"shake\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"gplus external\" data-animate-hover=\"shake\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"email external\" data-animate-hover=\"shake\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-md-3 -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#footer -->\n");
      out.write("\n");
      out.write("        <!-- *** FOOTER END *** -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- *** COPYRIGHT ***\n");
      out.write(" _________________________________________________________ -->\n");
      out.write("        <div id=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <p class=\"pull-left\">© 2015 Your name goes here.</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <p class=\"pull-right\">Template by <a href=\"http://bootstrapious.com/e-commerce-templates\">Bootstrapious</a> with support from <a href=\"https://kakusei.cz\">Kakusei</a> \n");
      out.write("                        <!-- Not removing these links is part of the licence conditions of the template. Thanks for understanding :) -->\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- *** COPYRIGHT END *** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#all -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- *** SCRIPTS TO INCLUDE ***\n");
      out.write(" _________________________________________________________ -->\n");
      out.write("    <script src=\"resources/js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"resources/js/jquery.cookie.js\"></script>\n");
      out.write("    <script src=\"resources/js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"resources/js/modernizr.js\"></script>\n");
      out.write("    <script src=\"resources/js/bootstrap-hover-dropdown.js\"></script>\n");
      out.write("    <script src=\"resources/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"resources/js/front.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
