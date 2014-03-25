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
			}
			
		</style>

		<script type="text/javascript">
	
		function btnTest_Click() {
			showModalDialog();
		}

		function btnTest_Click() {
			setTimeout(function(){ showModalDialog(); }, 0);
		}

		function btnTest_Click() {
			setTimeout(function(){ showModalDialog(); }, 5000);
		}
		
		</script>

	</head>
	<body bgcolor="#ffffff">
		<!-- 検索条件の入力 -->
		<h1 id = "title">ゲーム管理システム</h1>
		
		<s:form method="post"  focus="gameTitle"  onsubmit = "return checkForm()">
			<p>ゲームタイトル:<html:text size="100"  maxlength="50"   name="gameTitle" property="gameTitle" value=""/></p>
			<p>ハードウェア &nbsp; :<html:text size="100"  maxlength="50" name="hardWare"  property="hardWare" value=""/>

		<!-- 検索・新規のボタン設定 -->
			<s:submit property = "search"  clientValidate = "true" >検索</s:submit>
			<s:submit property = "insert" >新規</s:submit>
			<s:submit property = "clear" >クリア</s:submit></p>
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

		<table class="float-left" >
			<caption>ゲームマスタ一覧</caption>
			<tr>
				<th>No.</th><th>ゲームタイトル</th><th>ハードウェア</th><th> &nbsp;</th><th> &nbsp;</th>
			</tr>

			<c:if test="${searchCount != 0}">
				<p>${countmessage}</p>
			</c:if>
			<c:forEach var="m" items="${gameBeanList}">
				<s:form method="post"   onsubmit = "btnTest_Click()">
					<tr>
		<!-- 検索結果の表示 -->
						<td  align="right"> <html:hidden property="gameId" value="${m.gameId}"/> ${f:h(m.gameId)}</td>
						<td> <html:hidden property="gameTitle" value="${m.gameTitle}"/>${f:h(m.gameTitle)}</td>
						<td> ${f:h(m.hardWare)}</td>
						<td><input type="submit" value="修正"   name="update"  ></td>
						<td><input type="submit"  value="削除" name="delete"  onclick="btnTest_Click();return confirm('${m.gameTitle}削除しますか?');btnTest_Click()"/></td>
					</tr>
				</s:form>
			</c:forEach>
		</table>
	</body>
</html>