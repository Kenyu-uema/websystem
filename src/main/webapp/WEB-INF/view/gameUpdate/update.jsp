		<%@page pageEncoding="UTF-8"%>
	<html>
		<head>
			<!-- 入力チェック -->
			<html:javascript formName="gameUpdateActionForm_update"/>

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
			
				div.back {S
					text-align: left;S
					float: left;
				}
				div.update{
					text-align: right;
				}
			</style>


		</head>
		<body bgcolor="#ffffff">
			<h1 id = "title">ゲーム管理システム&gt;修正画面</h1>
				<html:errors/>
			<p><c:if test = "${message != null}" >
				${message}
			</c:if></p>
			<p><c:if test = "${error != null}">
				${error}
			</c:if></p>

			<!-- 修正用のボタン設定 -->
			<s:form method="post"  onsubmit = "return checkForm()">
				<div class="back"><a><s:link href="result">前の画面に戻ります </s:link></a></div>
				<div class="update"><s:submit property ="update"  clientValidate = "true"  >修正</s:submit></div>
				<br>

			<!-- 修正内容の入力 -->
				<table class="float-left" >
					<html:hidden property="gameId" value="${gameBeanList[0].gameId}"/>
					<tr>
						<th>ゲームID</th><td> <html:hidden property="gameId" value="${gameBeanList[0].gameId}"/> ${gameBeanList[0].gameId}</td>
					</tr>
					<tr>
						<th>ゲームタイトル</th><td><html:text size="146"  maxlength="50"   property = "gameTitle"  value="${gameBeanList[0].gameTitle}"/></td>
					</tr>
					<tr>
						<th>ハードウェア</th><td><html:text size="146"  maxlength="50"   property = "hardWare"  value="${gameBeanList[0].hardWare}"/></td>
					</tr>
					<tr>
						<th>感想</th><td><textarea name="impression"  cols="100"  rows="10" maxlength="1000" >${gameBeanList[0].impression}</textarea></td>
					</tr>
				</table>
			</s:form>
		</body>

	</html>