/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-07-11 06:20:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findId_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1655617123373L));
    _jspx_dependants.put("jar:file:/C:/WithTrip/WithTrip/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>WITHTRIP :: 함께라서 좋은 여행</title>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&family=Raleway&display=swap\" rel=\"stylesheet\"></head>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("	html{\r\n");
      out.write("	font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("	font-family: 'Raleway', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-page{\r\n");
      out.write("  width:550px;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  overflow-x:hidden;\r\n");
      out.write("  margin:11% auto;\r\n");
      out.write("  background-color:#f9f9f9;\r\n");
      out.write("  vertical-align: middle;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-header {\r\n");
      out.write("  text-align:left;\r\n");
      out.write("  margin:60px 75px 0 75px;\r\n");
      out.write("  padding-bottom:10px;\r\n");
      out.write("  font-size:15pt;\r\n");
      out.write("  border-bottom:3px solid #6495ED;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-content {\r\n");
      out.write("  margin:30px 0 20px 85px;\r\n");
      out.write("  text-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-div {\r\n");
      out.write("  margin-bottom:15px;\r\n");
      out.write("  font-size: small;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-div1 {\r\n");
      out.write("  margin-bottom:12px;\r\n");
      out.write("  font-size: small;\r\n");
      out.write("  padding:24px;\r\n");
      out.write("}\r\n");
      out.write(".find-id-div span {\r\n");
      out.write("  font-size:14pt;\r\n");
      out.write("  color:#6495ED;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-content input[type=email] {\r\n");
      out.write("  width:380px;\r\n");
      out.write("  margin-top:5px;\r\n");
      out.write("  margin-bottom:5px;\r\n");
      out.write("  font-size:14pt;\r\n");
      out.write("  padding-left:10px;\r\n");
      out.write("  color:#666666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-content input[type=text] {\r\n");
      out.write("  width:380px;\r\n");
      out.write("  margin-top:5px;\r\n");
      out.write("  margin-bottom:5px;\r\n");
      out.write("  font-size:14pt;\r\n");
      out.write("  padding-left:10px;\r\n");
      out.write("  color:#666666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".find-id-button {\r\n");
      out.write("  padding-bottom:50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-button button {\r\n");
      out.write("  height:33px;\r\n");
      out.write("  background-color: #6495ED;\r\n");
      out.write("  border:none;\r\n");
      out.write("  color:white;\r\n");
      out.write("  padding-left:15px;\r\n");
      out.write("  padding-right:15px;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  cursor:pointer;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("  transition: background 0.3s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".find-id-button button:hover{\r\n");
      out.write("	background: #000000;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write(".text{\r\n");
      out.write("\r\n");
      out.write(" font-size: 10px;\r\n");
      out.write("  width: 500px;\r\n");
      out.write("  height: 32px;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  border-radius: 13px;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  padding-left: 10px;\r\n");
      out.write("  background-color: white;\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* .text:focus { */\r\n");
      out.write("/*     outline: none !important; */\r\n");
      out.write("/*     border:1px solid ; */\r\n");
      out.write("/*     box-shadow: 0 0 8px #6495ED; */\r\n");
      out.write("/*     border-color: white; */\r\n");
      out.write("/* } */\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"checkId.me\" , method=\"post\">\r\n");
      out.write("	");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("	<script>\r\n");
      out.write("		function addHypen(obj) {\r\n");
      out.write("   			var number = obj.value.replace(/[^0-9]/g, \"\");\r\n");
      out.write("   			var phone = \"\";\r\n");
      out.write("   			\r\n");
      out.write("   		  if(number.length < 4) {\r\n");
      out.write("   	        return number;\r\n");
      out.write("   	    } else if(number.length < 7) {\r\n");
      out.write("   	        phone += number.substr(0, 3);\r\n");
      out.write("   	        phone += \"-\";\r\n");
      out.write("   	        phone += number.substr(3);\r\n");
      out.write("   	    } else if(number.length < 11) {\r\n");
      out.write("   	        phone += number.substr(0, 3);\r\n");
      out.write("   	        phone += \"-\";\r\n");
      out.write("   	        phone += number.substr(3, 3);\r\n");
      out.write("   	        phone += \"-\";\r\n");
      out.write("   	        phone += number.substr(6);\r\n");
      out.write("   	    } else {\r\n");
      out.write("   	        phone += number.substr(0, 3);\r\n");
      out.write("   	        phone += \"-\";\r\n");
      out.write("   	        phone += number.substr(3, 4);\r\n");
      out.write("   	        phone += \"-\";\r\n");
      out.write("   	        phone += number.substr(7);\r\n");
      out.write("   	    }\r\n");
      out.write("   	    obj.value = phone;\r\n");
      out.write("   	}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("   		\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/member/findId.jsp(125,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty member.email }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<div class=\"find-id-page\" ng-controller=\"FindIdCtrl as findIdCtrl\">\r\n");
          out.write("    <div class=\"find-id-header\">아이디 찾기</div>\r\n");
          out.write("    <div class=\"find-id-content\">\r\n");
          out.write("        <div class=\"find-id-div\">가입하신 <span>이름</span> 을 입력하세요.</div>\r\n");
          out.write("        <div><input type=\"text\" name=\"userName\" class=\"text\" id=\"userName\" style=\"font-size: 13px;\"></div>\r\n");
          out.write("        <br>\r\n");
          out.write("        <div class=\"find-id-div\">가입하신 <span>휴대폰 번호</span> 를 입력하세요.</div>\r\n");
          out.write("        <div><input type=\"text\" name=\"phone\" class=\"text\" id=\"phone\" style=\"font-size: 13px;\" onkeyup=\"addHypen(this);\"></div>\r\n");
          out.write("    </div>\r\n");
          out.write("    <div class=\"find-id-button\">\r\n");
          out.write("    	<button type=\"submit\" id=\"btn\">확인</button>\r\n");
          out.write("    </div>\r\n");
          out.write("</div>\r\n");
          out.write("	");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/member/findId.jsp(140,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty member.email }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<div class=\"find-id-page\" ng-controller=\"FindIdCtrl as findIdCtrl\">\r\n");
          out.write("    <div class=\"find-id-content\">\r\n");
          out.write("    <br>\r\n");
          out.write("        <div class=\"find-id-div1\">\r\n");
          out.write("        <h3>가입하신 이메일은 ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 입니다.</h3>\r\n");
          out.write("        </div>\r\n");
          out.write("        <br>\r\n");
          out.write("    </div>\r\n");
          out.write("</div>\r\n");
          out.write("	");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
