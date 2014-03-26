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
 					width="760";
				}
			
				div.back {
					text-align: left;
					float: left;
				}
				div.update{
					text-align: right;
				}

			</style>

		</head>
		<body class= "body"  bgcolor="#ffffff">
			<h1 id = "title">ゲーム管理システム&gt;修正画面</h1>
			<!-- メッセージの表示 -->
				<html:errors/>
			<p><c:if test = "${message != null}" >
				${message}
			</c:if></p>
			<p><c:if test = "${error != null}">
				${error}
			</c:if></p>

			<!-- 修正用のボタン設定 -->
			<s:form method="post" focus="gameTitle"  onsubmit="a();return false;">
				<div class="back"><a><s:link tabindex="5"  href="result">前の画面に戻ります </s:link></a></div>
				<div class="update"><s:submit property ="update" tabindex="4" styleId= "update" clientValidate = "true" >修正</s:submit></div>
				<br>

			<!-- 修正内容の入力 -->
				<table class="float-left" >
					<html:hidden property="gameId" value="${gameBeanList[0].gameId}"/>
					<tr>
						<th>ゲームID</th><td> <html:hidden property="gameId" value="${gameBeanList[0].gameId}" onchange="wupBtn()"/> ${gameBeanList[0].gameId}</td>
					</tr>
					<tr>
						<th>ゲームタイトル</th><td><html:text size="80%" maxlength="50"  name="gameTitle" property = "gameTitle" tabindex="1" value="${gameBeanList[0].gameTitle}" onchange="wupBtn()"/></td>
					</tr>
					<tr>
						<th>ハードウェア</th><td><html:text size="80%" maxlength="50"  name="hardWare"  property = "hardWare"  tabindex="2" value="${gameBeanList[0].hardWare}" onchange="wupBtn()"/></td>
					</tr>
					<tr>
						<th>感想</th><td><textarea name="impression" id="updatetextarea" cols="100"  rows="10" maxlength="1000" tabindex="3" >${gameBeanList[0].impression}</textarea></td>
					</tr>
				</table>
			</s:form>
		</body>

	</html>