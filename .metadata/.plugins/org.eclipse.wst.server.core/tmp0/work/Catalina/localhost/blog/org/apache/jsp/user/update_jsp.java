/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-10-31 04:43:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/nav.jsp", Long.valueOf(1572492612626L));
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1571796448777L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1571711427907L));
    _jspx_dependants.put("jar:file:/C:/workspace/blog_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/blog/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <link rel=\"icon\" href=\"/blog/img/favicon.png\" type=\"image/png\">\r\n");
      out.write("        <title>Opium Blog</title>\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/vendors/linericon/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/vendors/owl-carousel/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/vendors/lightbox/simpleLightbox.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/vendors/nice-select/css/nice-select.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/vendors/animate-css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/vendors/jquery-ui/jquery-ui.css\">\r\n");
      out.write("        <!-- main css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/blog/css/responsive.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <!--================Header Menu Area =================-->\r\n");
      out.write("        <header class=\"header_area\">\r\n");
      out.write("\t\t\t<div class=\"main_menu\">\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container box_1620\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand logo_h\" href=\"#\"><img src=\"/blog/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse navbar-collapse offset\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav menu_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"/blog/index.jsp\">Home</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/blog/board/write.jsp\">Posting</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right header_social ml-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\"><i class=\"fa fa-behance\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!--================Header Menu Area =================-->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<section class=\"contact_area\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<form class=\"row contact_form\" action=\"/blog/user?cmd=update\" method=\"post\" onsubmit=\"return validateCheck()\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" placeholder=\"아이디\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"비밀번호\" required=\"required\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"passwordCheck\" name=\"passwordCheck\" placeholder=\"비밀번호 확인\" required=\"required\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\" placeholder=\"이메일\" maxlength=\"40\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group float-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a style=\"cursor:pointer;\" class=\"blog_btn\" href=\"#\" onclick=\"goPopup()\">주소 찾기</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"name=\"address\" id=\"roadFullAddr\" placeholder=\"도로명 주소\" required=\"required\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 text-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" value=\"submit\" class=\"btn submit_btn\">Save</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t<br/><br/>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction validateCheck(){\r\n");
      out.write("\t\t\tvar password = document.querySelector('#password').value;\r\n");
      out.write("\t\t\tvar passwordCheck = document.querySelector('#passwordCheck').value;\r\n");
      out.write("\t\t\tvar address = document.querySelector('#roadFullAddr').value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(address == ''){\r\n");
      out.write("\t\t\t\talert('주소를 입력하세요.');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (password === passwordCheck) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert('비밀번호를 정확히 입력해주세요');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goPopup(){\r\n");
      out.write("\t\t\t// 주소검색을 수행할 팝업 페이지를 호출합니다.\r\n");
      out.write("\t\t\t// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.\r\n");
      out.write("\t\t\tvar pop = window.open(\"/blog/juso/jusoPopup.jsp\",\"pop\",\"width=570,height=420, scrollbars=yes, resizable=yes\"); \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.\r\n");
      out.write("\t\t    //var pop = window.open(\"/popup/jusoPopup.jsp\",\"pop\",\"scrollbars=yes, resizable=yes\"); \r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//주소입력 버튼 누르면 콜백됨\r\n");
      out.write("\t\tfunction jusoCallBack(roadFullAddr){\r\n");
      out.write("\t\t\t// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.\r\n");
      out.write("\t\t\tvar juso = document.querySelector('#roadFullAddr');\r\n");
      out.write("\t\t\tjuso.value = roadFullAddr;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--================ start footer Area  =================-->\r\n");
      out.write("<footer class=\"footer-area p_120\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-3  col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"single-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h6 class=\"footer_title\">About Us</h6>\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore dolore magna aliqua.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"single-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h6 class=\"footer_title\">Newsletter</h6>\r\n");
      out.write("\t\t\t\t\t<p>Stay updated with our latest trends</p>\r\n");
      out.write("\t\t\t\t\t<div id=\"mc_embed_signup\">\r\n");
      out.write("\t\t\t\t\t\t<form target=\"_blank\" action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\" method=\"get\" class=\"subscribe_form relative\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group d-flex flex-row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"EMAIL\" placeholder=\"Email Address\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Email Address '\" required=\"\" type=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn sub-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"lnr lnr-arrow-right\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mt-10 info\"></div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"single-footer-widget instafeed\">\r\n");
      out.write("\t\t\t\t\t<h6 class=\"footer_title\">Instagram Feed</h6>\r\n");
      out.write("\t\t\t\t\t<ul class=\"list instafeed d-flex flex-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-01.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-02.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-03.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-04.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-05.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-06.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-07.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/blog/img/instagram/Image-08.jpg\" alt=\"\"></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-2 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"single-footer-widget f_social_wd\">\r\n");
      out.write("\t\t\t\t\t<h6 class=\"footer_title\">Follow Us</h6>\r\n");
      out.write("\t\t\t\t\t<p>Let us be social</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"f_social\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-behance\"></i></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row footer-bottom d-flex justify-content-between align-items-center\">\r\n");
      out.write("\t\t\t<p class=\"col-lg-12 footer-text text-center\">\r\n");
      out.write("\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t<script>document.write(new Date().getFullYear());</script>\r\n");
      out.write("\t\t\t\tAll rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!--================ End footer Area  =================-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Optional JavaScript -->\r\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("<script src=\"/blog/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/popper.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/stellar.js\"></script>\r\n");
      out.write("<script src=\"/blog/vendors/lightbox/simpleLightbox.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/vendors/nice-select/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/vendors/isotope/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/vendors/isotope/isotope-min.js\"></script>\r\n");
      out.write("<script src=\"/blog/vendors/owl-carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/vendors/jquery-ui/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/mail-script.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/theme.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /include/nav.jsp(47,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/blog/user/join.jsp\">Join</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/blog/user/login.jsp\">Login</a></li>\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/blog/user/update.jsp\">Profile</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/blog/user?cmd=logout\">Logout</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
