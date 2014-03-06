package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/common/common.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>ゲーム管理システム</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- スタイルの設定 -->\r\n");
      out.write("\t\t<style type=text/css>\r\n");
      out.write("\t\t\t#title{background-color:#00ffff;}\r\n");
      out.write("\t\t\ttr th {\r\n");
      out.write("\t\t\t\tbackground-color:#00ffff;\r\n");
      out.write("\t\t\t\tcolor:black;\r\n");
      out.write("\t\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttr td {\r\n");
      out.write("\t\t\t\tbackground-color:white;\r\n");
      out.write("\t\t\t\tcolor:green;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttable,th,td {\r\n");
      out.write("\t\t\t\tborder:solid thin;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.float-left {\r\n");
      out.write("\t\t\t\tmargin-left: auto;\r\n");
      out.write(" \t\t\t\tmargin-right: auto;\r\n");
      out.write(" \t\t\t\tborder-spacing:0px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 入力チェック -->\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction checkForm(){\r\n");
      out.write("\t\t\t\tif(document.kakunin.gameTitle.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert('ゲームタイトルを入力してください');\r\n");
      out.write("\t\t\t\t\tdocument.kakunin.gameTitle.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(document.kakunin.hardware.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert('ハードウェアを入力してください');\r\n");
      out.write("\t\t\t\t\tdocument.kakunin.hardware.focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//新規登録画面へ\r\n");
      out.write("\t\t\t\tfunction goInsert(){\r\n");
      out.write("\t\t\t\t\t location.href=\"http://localhost:8081/kenshu/game/insert\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//修正画面へ\r\n");
      out.write("\t\t\t\tfunction goUpDate(i){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('deleteForm' + i).method = \"get\";\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('deleteForm' + i).action = \"/kenshu/game/update\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 検索条件の入力 -->\r\n");
      out.write("\t\t<h1 id = \"title\">ゲーム管理システム</h1>\r\n");
      out.write("\t\t<form id=\"searchForm\"  method=\"post\" action=\"/kenshu/game/list\"  name=\"kakunin\"   onsubmit = \"return checkForm()\">\r\n");
      out.write("\t\t\t<p>ゲームタイトル:<input type=\"text\" name=\"gameTitle\"  size=\"100\"  maxlength=\"50\" ></p>\r\n");
      out.write("\t\t\t<p>ハードウェア &nbsp; :<input type=\"text\" name=\"hardware\" size=\"100\"  maxlength=\"50\" >\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 検索・新規のボタン設定 -->\r\n");
      out.write("\t\t\t<input type=\"button\"   value=\"新規\" name=\"new\"  onclick =\"goInsert();\">\r\n");
      out.write("\t\t\t<input type=\"submit\"  value=\"検索\"  name=\"search\" onclick=\"return confirm('検索しますか?');\"/></p>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- エラーの表示 -->\r\n");
      out.write("\t\t<p>");
if(request.getAttribute("message") != null){
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print(request.getAttribute("message"));
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<p>");
if(request.getAttribute("error") != null){ 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(request.getAttribute("error"));
      out.write("\r\n");
      out.write("\t\t\t");
} 
      out.write("</p>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<table class=\"float-left\" >\r\n");
      out.write("\t\t\t<caption>ゲームマスタ一覧</caption>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>No.</th><th>ゲームタイトル</th><th>ハードウェア</th><th>キャラクター数</th><th></th><th></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
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
}
