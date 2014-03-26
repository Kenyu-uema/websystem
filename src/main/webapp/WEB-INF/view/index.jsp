<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>ゲーム管理システム</title>

		<!-- スタイルの設定 -->
			<style type=text/css>
				#title{background-color:#00ffff;}
				tr th {
					background-color:#00ffff;
					color:black;
					font-weight:bold;
				}
				tr td {
					background-color:white;
					color:green;
				}
				table,th,td {
					border:solid thin;
				}
				.float-left {
					margin-left: auto;
					margin-right: auto;
					border-spacing:0px;
					width="860";
					frame="void"
					border-collapse:separate;
					font-size: 16px;
				}
				}
				.bodyfloat-left {
					margin-left: auto;
					margin-right: auto;
					border-spacing:0px;
					width="820";
					frame="void"
					border-collapse:separate;
					font-size: 16px;
				}

				.body{
					width:1130;
					margin:0 auto;
				}
			</style>

			<script type="text/javascript">

				function go(){
					//EnterキーならSubmit
					if(window.event.keyCode==13)document.getElementById(update).submit();
				}
			</script>

	</head>

	<body  bgcolor="#ffffff">
		<!-- 検索条件の入力 -->
			<h1 id = "title">ゲーム管理システム</h1>
				<s:form method="post"  focus="gameTitle" >
					<div class =  "body"><p>ゲームタイトル:<html:text size="80%"  maxlength="50"   name="gameTitle" property="gameTitle" value=""/></p>
					<p>ハードウェア &nbsp; :<html:text size="80%"  maxlength="50" name="hardWare"  property="hardWare" value=""  onkeydown="go();"/>

		<!-- 検索・新規のボタン設定 -->
					<span id="button"  >
						<s:submit property = "search"  clientValidate = "true" >検索</s:submit>
						<s:submit property = "insert" >新規</s:submit>
						<s:submit property = "clear" >クリア</s:submit>
					</span></p></div>
					<html:errors/>
				</s:form>

		<!-- エラーの表示 -->
			<p><c:if test = "${message != null}" >
				${message}
			</c:if></p>
			<p><c:if test = "${error != null}">
				${error}
			</c:if></p>
			<hr>

		<!-- 検索表のヘッダ -->
			<table  class="float-left" >
				<caption>ゲームマスタ一覧</caption>
					<thead>
						<tr><th width="20" >No.</th><th width="380">ゲームタイトル</th><th width="380">ハードウェア</th><th width="130"> &nbsp;</th></tr>
					</thead>
					<tfoot>
					</tfoot>
		<!-- 検索数の表示-->
			<c:if test="${searchCount != 0}">
				<p>${countmessage}</p>
			</c:if>


		<!-- 検索結果の表示 -->
	<TD colspan="5">
		<div style="height:215px; overflow:auto;">
			<table  class="bodyfloat-left ">
			<colgroup span="4" ></colgroup>
			<colgroup span="1"  width="30"></colgroup>
				<c:forEach var="m" items="${gameBeanList}">
					<s:form method="post" >
						<tbody>
							<tr>
								<td width="25" align="right"><html:hidden property="gameId" value="${m.gameId}"/> ${f:h(m.gameId)}</td>
								<td width="415"><html:hidden property="gameTitle" value="${m.gameTitle}"/>${f:h(m.gameTitle)}</td>
								<td width="415">${f:h(m.hardWare)}</td>
								<td width="50"><input type="submit" value="修正"   name="update"  ></td>
								<td width="65"><input type="submit"  value="削除" name="delete"  onclick="return confirm('${m.gameTitle}削除しますか?');btnTest_Click()"/><td>
							</tr>
						</tbody>
					</s:form>
				</c:forEach>
			</table>
		</div>
	</TD>
	</table>
	</body>
</html>