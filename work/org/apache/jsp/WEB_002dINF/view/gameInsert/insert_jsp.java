package org.apache.jsp.WEB_002dINF.view.gameInsert;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/common/common.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fmethod;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005flink_0026_005fhref;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fmethod = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fmethod.release();
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<title>ゲーム管理システム</title>\n");
      out.write("\n");
      out.write("\t\t<!-- スタイルの設定 -->\n");
      out.write("\t\t<style type=text/css>\n");
      out.write("\t\t\t#title{background-color:#00ffff;}\n");
      out.write("\t\t\ttr th {\n");
      out.write("\t\t\t\tbackground-color:#00ffff;\n");
      out.write("\t\t\t\tcolor:black;\n");
      out.write("\t\t\t\tfont-weight:bold;\n");
      out.write("\t\t\t\twidth: 400;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ttr td {\n");
      out.write("\t\t\t\tbackground-color:white;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ttable,th,td {\n");
      out.write("\t\t\t\tborder:solid thin;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.float-left {\n");
      out.write("\t\t\t\tmargin-left: auto;\n");
      out.write(" \t\t\t\tmargin-right: auto;\n");
      out.write(" \t\t\t\tborder-spacing:0px;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tdiv.back {\n");
      out.write("\t\t\t\ttext-align: left;\n");
      out.write("\t\t\t\tfloat: left;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tdiv.insert{\n");
      out.write("\t\t\t\ttext-align: right;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\n");
      out.write("\t\t<!-- 入力チェック -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\tfunction checkForm(){\n");
      out.write("\t\t\t\tif(document.insert.gameTitle.value == \"\"){\n");
      out.write("\t\t\t\t\talert('ゲームタイトルを入力してください');\n");
      out.write("\t\t\t\t\tdocument.insert.gameTitle.focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(document.insert.hardware.value == \"\"){\n");
      out.write("\t\t\t\t\talert('ハードウェアを入力してください');\n");
      out.write("\t\t\t\t\tdocument.insert.hardware.focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\treturn true;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<h1 id = \"title\">ゲーム管理システム&gt;登録画面</h1>\n");
      out.write("\n");
      out.write("\t\t<!-- 登録用のボタン設定 -->\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.seasar.struts.taglib.S2FormTag _jspx_th_s_005fform_005f0 = (org.seasar.struts.taglib.S2FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fmethod.get(org.seasar.struts.taglib.S2FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /WEB-INF/view/gameInsert/insert.jsp(58,3) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /WEB-INF/view/gameInsert/insert.jsp(58,3) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setOnsubmit("return checkForm()");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<div class=\"back\"><a>");
        if (_jspx_meth_s_005flink_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</a></div>\n");
        out.write("\t\t\t<div class=\"insert\"><input type=\"submit\"   value=\"登録\" name=\"new\" onclick=\"return confirm('登録しますか?');\"/></div>\n");
        out.write("\t\t\t<br>\n");
        out.write("\t\t<!-- 登録内容の入力 -->\n");
        out.write("\t\t\t<table class=\"float-left\" >\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<th>ゲームタイトル</th><td><input type=\"text\" name=\"gameTitle\"  size=\"146\"  maxlength=\"50\" ></td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<th>ハードウェア</th><td><input type=\"text\" name=\"hardware\"  size=\"146\"  maxlength=\"50\" ></td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<th>感想</th><td><textarea name=\"impression\"  cols=\"100\"  rows=\"10\" maxlength=\"1000\" ></textarea></td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fmethod.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fonsubmit_005fmethod.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f0 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /WEB-INF/view/gameInsert/insert.jsp(59,24) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f0.setHref("result");
    int _jspx_eval_s_005flink_005f0 = _jspx_th_s_005flink_005f0.doStartTag();
    if (_jspx_eval_s_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f0.doInitBody();
      }
      do {
        out.write("前の画面に戻ります ");
        int evalDoAfterBody = _jspx_th_s_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f0);
    return false;
  }
}
