<%@page pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>ゲーム管理システム</title>

		<!-- スタイルの設定 -->
		<style type=text/css>
			#title{background-color:#00ffff;}
			tr th {
				background-color:#00ffff;
				color:black;
				font-weight:bold;
				width: 400;
			}
			tr td {
				background-color:white;
			}
			table,th,td {
				border:solid thin;
			}
			.float-left {
				margin-left: auto;
 				margin-right: auto;
 				border-spacing:0px;
			}

			div.back {
				text-align: left;
				float: left;
			}
			div.insert{
				text-align: right;
			}

		</style>

		<!-- 入力チェック -->

	</head>
	<body class= "body"  bgcolor="#ffffff">
		<h1 id = "title">ゲーム管理システム&gt;登録画面</h1>
		<!-- メッセージの表示 -->
			<html:errors/>
			<p><c:if test = "${message != null}" >
				${message}
			</c:if></p>
			<p><c:if test = "${error != null}">
				${error}
			</c:if></p>

		<!-- 登録用のボタン設定 -->
		<s:form  method="post" focus="gameTitle"  onsubmit = "return checkForm()">
				<div class="back"><a><s:link  tabindex="5"  href="result">前の画面に戻ります </s:link></a></div>
				<div class="insert"><s:submit property ="insert"  tabindex="4"  clientValidate = "true" >登録</s:submit></div>
				<br>

		<!-- 登録内容の入力 -->
			<table class="float-left" >
				<tr>
					<th>ゲームタイトル</th><td><html:text size="146"  maxlength="50"  name="gameTitle"  tabindex="1"  property = "gameTitle"  value=""/></td>
				</tr>
				<tr>
					<th>ハードウェア</th><td><html:text size="146"  maxlength="50"  name="hardWare" tabindex="2"  property = "hardWare"  value=""/></td>
				</tr>
				<tr>
					<th>感想</th><td><textarea name="impression"  cols="100"  rows="10"  tabindex="3" maxlength="1000" ></textarea></td>
				</tr>
			</table>
		</s:form>
	</body>

</html>