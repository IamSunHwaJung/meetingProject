/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-03-11 21:20:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->\r\n");
      out.write("<title>main</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: #FFA7A7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar, .dropdown-menu {\r\n");
      out.write("\tbackground: rgba(255, 203, 203, 0.25);\r\n");
      out.write("\tborder: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav>li>a, .dropdown-menu>li>a:focus, .dropdown-menu>li>a:hover,\r\n");
      out.write("\t.dropdown-menu>li>a, .dropdown-menu>li {\r\n");
      out.write("\tborder-bottom: 3px solid transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav>li>a:focus, .nav>li>a:hover, .nav .open>a, .nav .open>a:focus, .nav .open>a:hover,\r\n");
      out.write("\t.dropdown-menu>li>a:focus, .dropdown-menu>li>a:hover {\r\n");
      out.write("\tborder-bottom: 3px solid transparent;\r\n");
      out.write("\tbackground: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a, .dropdown-menu>li>a, .dropdown-menu>li>a:focus,\r\n");
      out.write("\t.dropdown-menu>li>a:hover, .navbar-toggle {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-menu {\r\n");
      out.write("\t-webkit-box-shadow: none;\r\n");
      out.write("\tbox-shadow: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+1), .nav li.active:nth-child(8n+1) {\r\n");
      out.write("\tborder-bottom: #FD65B0 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+2), .nav li.active:nth-child(8n+2) {\r\n");
      out.write("\tborder-bottom: #DB9DBE 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+3), .nav li.active:nth-child(8n+3) {\r\n");
      out.write("\tborder-bottom: #FD65B0 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+4), .nav li.active:nth-child(8n+4) {\r\n");
      out.write("\tborder-bottom: #DB9DBE 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+5), .nav li.active:nth-child(8n+5) {\r\n");
      out.write("\tborder-bottom: #FD65B0 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+6), .nav li.active:nth-child(8n+6) {\r\n");
      out.write("\tborder-bottom: #DB9DBE 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+7), .nav li.active:nth-child(8n+7) {\r\n");
      out.write("\tborder-bottom: #FD65B0 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav li:hover:nth-child(8n+8), .nav li.active:nth-child(8n+8) {\r\n");
      out.write("\tborder-bottom: #DB9DBE 3px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-toggle .icon-bar {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"navbar-wrapper\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("\t\t\t\t\t\t\taria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\">Logo</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\" class=\"\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">모임신청</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\" dropdown\"><a href=\"#\" class=\"dropdown-toggle \"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-expanded=\"false\">공지/후기<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> 공지사항 </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> 회원 후기 </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\" dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-toggle active\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"> 문의\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">자주 묻는 질문</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Q & A</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav pull-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"#\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"userId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"ID\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Page Header -->\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<h1 class=\"page-header\">\r\n");
      out.write("\t\t\t\t모임 정보 <small>- 미팅/모임/테마별 신청 -</small>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Projects Row -->\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/123.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">와인파티</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 와인을 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/122.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">맥주파티</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 맥주을 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/1234.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">이벤트</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 선물을 준비하여 나누는 이벤트 파티<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Projects Row -->\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/보드게임.PNG\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">보드게임</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 보드게임을 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/야광볼링장.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">야광볼링</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 야광볼링을 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/퍼러글라이딩.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">패러글라이딩</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 패러글라이딩 을 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Projects Row -->\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/블라인드사진.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">블라인드카페</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 앞이안보이는 카페에서 대화를 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/경복궁.PNG\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">경복궁야간모인</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 경복궁의 야경을 즐기며 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 portfolio-item\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img class=\"img-responsive\" src=\"images/영화관.jpg\"\r\n");
      out.write("\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<a href=\"#\">영화관모임</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t남자:10/여자:10 최신영화를 즐기며 친목 도모<br> 참가비:10,000원\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<table width=\"97%\" align=center cellpadding=0 cellspacing=0>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<!-- 분류 셀렉트 박스, 게시물 몇건, 관리자화면 링크 -->\r\n");
      out.write("\t\t\t\t<table border=0 width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr height=\"20\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"50%\">\r\n");
      out.write("\t\t\t\t\t\t\t<form name=\"fcategory\" method=\"get\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"margin: 0; padding: 0;\"></form>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\"><img align=absmiddle> <span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #463627; font-weight:\">Total 637</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=3></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table> <!-- 제목 -->\r\n");
      out.write("\t\t\t\t<form name=\"fboardlist\" method=\"post\" style=\"margin: 0;\">\r\n");
      out.write("\t\t\t\t\t<input type='hidden' name='bo_table' value='01_1'> <input\r\n");
      out.write("\t\t\t\t\t\ttype='hidden' name='sfl' value=''> <input type='hidden'\r\n");
      out.write("\t\t\t\t\t\tname='stx' value=''> <input type='hidden' name='spt'\r\n");
      out.write("\t\t\t\t\t\tvalue=''> <input type='hidden' name='page' value='1'>\r\n");
      out.write("\t\t\t\t\t<input type='hidden' name='sw' value=''>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tstyle=\"background-image: url('../skin/board/aechae_ba/img/title_bg.gif'); background-repeat: repeat-x; border-width: 0px; border-color: rgb(208, 208, 208); border-style: solid; height: 28px;\">\r\n");
      out.write("\t\t\t\t\t\t<table width=100% border=0 cellpadding=0 cellspacing=0\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-weight: color:#63452B;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=28 align=center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=50><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle='font-family: tahoma; font-size: 8pt; color: #63452B;'>번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=left><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle='font-family: tahoma; font-size: 8pt; color: #63452B;'>제&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=110 align=left><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle='font-family: tahoma; font-size: 8pt; color: #63452B;'>글쓴이</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=40><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref='/gnuboard4/bbs/board.php?bo_table=01_1&sop=and&sst=wr_datetime&sod=desc&sfl=&stx=&page=1'><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle='font-family: tahoma; font-size: 8pt; color: #63452B;'>날&nbsp;짜</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=50><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref='/gnuboard4/bbs/board.php?bo_table=01_1&sop=and&sst=wr_hit&sod=desc&sfl=&stx=&page=1'><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle='font-family: tahoma; font-size: 8pt; color: #63452B;'>조회</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--<td width=40>날짜</td>\r\n");
      out.write("    <td width=50>조회</td>-->\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 1px; line-height: 1px; background-image: url('../skin/board/aechae_ba/img/title_shadow.gif'); background-repeat: repeat-x; height: 3px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table width=100% border=0 cellpadding=0 cellspacing=0>\r\n");
      out.write("\t\t\t\t\t\t<!-- 목록 -->\r\n");
      out.write("\t\t\t\t\t\t<tr height=26 align=center>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=50><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='font: normal 11px tahoma; color: #63452B;'>637</span></td>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=5 height=1 bgcolor=#A9987B></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=26 align=center>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=50>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=5 height=1 bgcolor=#A9987B></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"margin-top: 7px; height: 31px; clear: both;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"float: left;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"float: right;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/shop/mypage/mypage_qna.php\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size: 1px; line-height: 1px; background-color: rgb(155, 140, 112); height: 1px; clear: both;\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size: 1px; line-height: 1px; background-color: rgb(155, 140, 112); height: 1px; clear: both;\">&nbsp;</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 페이지 -->\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"font-family: gulim; text-align: center; line-height: 30px; margin-top: 5px; margin-right: 0; margin-bottom: 10px; margin-left: 0; padding-top: 5px; padding-right: 0; padding-bottom: 5px; padding-left: 0; clear: both;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;<b><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: #4D6185; font-size: 12px; text-decoration: underline;\">1</span></b>\r\n");
      out.write("\t\t\t\t\t&nbsp;<a href='./board.php?bo_table=01_1&page=2'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">2</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=3'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">3</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=4'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">4</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=5'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">5</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=6'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">6</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=7'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">7</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=8'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">8</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=9'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">9</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=10'><b><span\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #B3B3B3; font-size: 12px;\">10</span></b></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=11'><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"page_next.gif\" border='0' align='absmiddle' title='다음'\r\n");
      out.write("\t\t\t\t\t\twidth=\"14\" height=\"14\"></a> &nbsp;<a\r\n");
      out.write("\t\t\t\t\t\thref='./board.php?bo_table=01_1&page=64'><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"css/images/pixgif\" border='0' align='absmiddle' title='맨끝'\r\n");
      out.write("\t\t\t\t\t\twidth=\"17\" height=\"14\"></a>\r\n");
      out.write("\t\t\t\t</div> <!-- 링크 버튼, 검색 -->\r\n");
      out.write("\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<form name=fsearch method=get style=\"margin: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=hidden name=bo_table value=\"01_1\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=hidden name=sca value=\"\"> <select name=sfl\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: #f6f6f6; border: 1px solid #7f9db9; height: 21px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value='wr_subject'>제목</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='wr_content'>내용</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='wr_subject||wr_content'>제목+내용</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='mb_id,1'>회원아이디</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='mb_id,0'>회원아이디(코)</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='wr_name,1'>글쓴이</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='wr_name,0'>글쓴이(코)</option>\r\n");
      out.write("\t\t\t\t\t\t</select> <input name=stx maxlength=15 itemname=\"검색어\" required value=''\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 204px; background-color: #f6f6f6; border: 1px solid #7f9db9; height: 21px;\">\r\n");
      out.write("\t\t\t\t\t\t<!-- \t<input type=image src=\"btn_search.gif\" border=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=absmiddle width=\"45\" height=\"22\"> -->\r\n");
      out.write("\t\t\t\t\t\t<input type=radio name=sop value=and>and <input type=radio\r\n");
      out.write("\t\t\t\t\t\t\tname=sop value=or>or\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"20\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<script language=\"JavaScript\">\r\n");
      out.write("\t\tif ('')\r\n");
      out.write("\t\t\tdocument.fcategory.sca.value = '';\r\n");
      out.write("\t\tif ('') {\r\n");
      out.write("\t\t\tdocument.fsearch.sfl.value = '';\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ('and' == 'and')\r\n");
      out.write("\t\t\t\tdocument.fsearch.sop[0].checked = true;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ('and' == 'or')\r\n");
      out.write("\t\t\t\tdocument.fsearch.sop[1].checked = true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdocument.fsearch.sop[0].checked = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- 게시판 목록 끝 -->\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Pagination -->\r\n");
      out.write("\t<!--   <div class=\"row text-center\"> \r\n");
      out.write("             <div class=\"col-lg-12\"> \r\n");
      out.write("                 <ul class=\"pagination\"> \r\n");
      out.write("                     <li> \r\n");
      out.write("                         <a href=\"#\">&laquo;</a> \r\n");
      out.write("                     </li> \r\n");
      out.write("                     <li class=\"active\"> \r\n");
      out.write("                         <a href=\"#\">1</a> \r\n");
      out.write("                     </li> \r\n");
      out.write("                     <li> \r\n");
      out.write("                         <a href=\"#\">2</a> \r\n");
      out.write("                     </li> \r\n");
      out.write("                     <li> \r\n");
      out.write("                         <a href=\"#\">3</a> \r\n");
      out.write("                    </li> \r\n");
      out.write("                     <li> \r\n");
      out.write("                         <a href=\"#\">4</a> \r\n");
      out.write("                     </li> \r\n");
      out.write("                     <li> \r\n");
      out.write("                         <a href=\"#\">5</a> \r\n");
      out.write("                     </li> \r\n");
      out.write("                     <li> \r\n");
      out.write("                         <a href=\"#\">&raquo;</a> \r\n");
      out.write("                     </li> \r\n");
      out.write("                 </ul> \r\n");
      out.write("            </div>  -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<p>사업자 : 000-00-00000 대표이사 : 고길동 주소 : 서울특별시 강남구 역삼동 대표번호\r\n");
      out.write("\t\t\t\t\t1688-0000</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.row -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
