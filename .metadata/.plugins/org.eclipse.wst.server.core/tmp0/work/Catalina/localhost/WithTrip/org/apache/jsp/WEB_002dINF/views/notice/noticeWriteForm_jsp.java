/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-07-11 14:04:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticeWriteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Basic -->\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<!-- Mobile Metas -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<!-- Site Metas -->\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/images/favicon.png\" type=\"\">\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css5/Review-writeForm.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css5/Review-writeForm.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Notice</title>\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap core css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css5/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("<!--owl slider stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("<!-- nice select  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css\" integrity=\"sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==\" crossorigin=\"anonymous\" />\r\n");
      out.write("<!-- font awesome style -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css5/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css5/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- responsive style -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css5/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("<style>\r\n");
      out.write("#ntitle{\r\n");
      out.write("width: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"sub_page\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"trip_section layout_padding\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"heading_container heading_center\">\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("<!-- 사용할 부분 board list 시작-->\r\n");
      out.write("		<div class=\"detail_outer\">\r\n");
      out.write("        <br>\r\n");
      out.write("      		<div class=\"table-area\">\r\n");
      out.write("      		 <h2 class=\"b_title\" style=\"color:#6495ED;\">Notice</h2>\r\n");
      out.write("  				<form action=\"nInsert.no\" method=\"post\" id=\"noticeWriteForm\">\r\n");
      out.write("					<table style=\"color: black; font-weight: bold;\">\r\n");
      out.write("<!--                     	<tr> -->\r\n");
      out.write("<!--                     	 <td class=\"tr_title\" id=\"ntitle\" width=\"200px;\">고정 여부</td> -->\r\n");
      out.write("<!--                     	 <td class=\"td_content\" colspan=\"20\"> -->\r\n");
      out.write("<!-- 						<select class=\"custom-select mr-3\" id=\"fixselect\" name=\"fix\" required> -->\r\n");
      out.write("<!-- 							 <option value=\"0\" selected>비고정</option> -->\r\n");
      out.write("<!-- 							 <option value=\"1\">고정</option> -->\r\n");
      out.write("<!-- 						</select> -->\r\n");
      out.write("<!-- 						</td> -->\r\n");
      out.write("<!--                     	</tr> -->\r\n");
      out.write("	    				<tr>\r\n");
      out.write("	                          <td class=\"tr_title\">제목</td>\r\n");
      out.write("	                          <td class=\"td_content\" colspan=\"10\">\r\n");
      out.write("	                             <input type=\"text\" id=\"q_Title\" name=\"noticeTitle\" required>\r\n");
      out.write("	                            \r\n");
      out.write("	                          &emsp;&emsp;<input class=\"form-check-input\" type=\"checkbox\" id=\"flexCheckChecked\" name= \"fix\">\r\n");
      out.write("	                          \r\n");
      out.write("	                           		<label class=\"form-check-label\" for=\"flexCheckChecked\">\r\n");
      out.write("						   			 고정\r\n");
      out.write("						 			</label>\r\n");
      out.write("	                          </td>\r\n");
      out.write("	                          \r\n");
      out.write("	                      </tr>\r\n");
      out.write("	                      <tr>\r\n");
      out.write("	                          <td colspan=\"6\"><textarea cols=\"70px\" rows=\"100px\" style=\"resize:none;\" name=\"noticeContent\" required></textarea></td>\r\n");
      out.write("	                      </tr>\r\n");
      out.write("                      </table>\r\n");
      out.write("							<input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                     \r\n");
      out.write("<!-- button area -->\r\n");
      out.write("						<br><br>\r\n");
      out.write("                        <div class=\"row md-2 mt-2 mb-2\">\r\n");
      out.write("                        	<div class=\"col md-2\" id=\"btnSubmit\">\r\n");
      out.write("                        		<button type=\"submit\" id=\"reviewPost\" style=\" display: inline-block;\">등록</button>\r\n");
      out.write("                        		<button type=\"button\" id=\"reviewPost\" style=\" display: inline-block;\" onclick=\"location.href='javascript:history.go(-1)'\" >취소</button>\r\n");
      out.write("                        	</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                  </div>   \r\n");
      out.write("              </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- end about section -->\r\n");
      out.write("\r\n");
      out.write("<!-- footer section -->\r\n");
      out.write("<br><br><br><br>\r\n");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- footer section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("resources/js5/Review-writeForm.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- jQery -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("resources/js5/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<!-- popper js -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\r\n");
      out.write("</script>\r\n");
      out.write("<!-- bootstrap js -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("resources/js5/bootstrap.js\"></script>\r\n");
      out.write("<!-- owl slider -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<!-- isotope js -->\r\n");
      out.write("<script src=\"https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js\"></script>\r\n");
      out.write("<!-- nice select -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("<!-- custom js -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js5/custom.js\"></script>\r\n");
      out.write("<!-- Google Map -->\r\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js5?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap\">\r\n");
      out.write("</script>\r\n");
      out.write("<!-- End Google Map -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("		$('#flexCheckChecked').click(function(){\r\n");
      out.write("			var checked = $('#flexCheckChecked').is(':checked');\r\n");
      out.write("			var fix = $('#flexCheckChecked').val();\r\n");
      out.write("			console.log(fix);\r\n");
      out.write("			if(checked == true){\r\n");
      out.write("				fix = \"1\";\r\n");
      out.write("				console.log(fix);\r\n");
      out.write("			}else{\r\n");
      out.write("				fix = \"0\";\r\n");
      out.write("				console.log(fix);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /WEB-INF/views/notice/noticeWriteForm.jsp(46,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("../common/navbar.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /WEB-INF/views/notice/noticeWriteForm.jsp(108,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("../common/footer.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }
}
