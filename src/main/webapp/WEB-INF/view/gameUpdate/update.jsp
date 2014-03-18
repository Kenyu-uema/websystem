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
				div.update{
					text-align: right;
				}
			</style>

			<!-- 入力チェック -->
			<script type="text/javascript">
					function checkForm(){
					if(document.update.gameTitle.value == ""){
						alert('ゲームタイトルを入力してください');
						document.update.gameTitle.focus();
						return false;
					}
					if(document.insert.hardware.value == ""){
						alert('ハードウェアを入力してください');
						document.insert.hardware.focus();
						return false;
					}
						return true;
					}
			</script>
		</head>
		<body>
			<h1 id = "title">ゲーム管理システム&gt;修正画面</h1>

			<!-- 修正用のボタン設定 -->
			<s:form method="post"  onsubmit = "return checkForm()">
				<div class="back"><a><s:link href="result">前の画面に戻ります </s:link></a></div>
				<div class="update"><input type="submit"   value="修正" name="update" onclick="return confirm('修正しますか?');"/></div>
				<br>

			<!-- 修正内容の入力 -->
			<c:forEach items="${gameBeanList}" var="m">
				<table class="float-left" >
					<html:hidden property="gameId" value="${m.gameId}"/>
					<tr>
						<th>ゲームタイトル</th><td><html:text size="146"  maxlength="50"   property = "gameTitle"  value="${m.gameTitle}"/></td>
					</tr>
					<tr>
						<th>ハードウェア</th><td><html:text size="146"  maxlength="50"   property = "hardWare"  value="${m.hardWare}"/></td>
					</tr>
					<tr>
						<th>感想</th><td><textarea name="impression"  cols="100"  rows="10" maxlength="1000" >${m.impression}</textarea></td>
					</tr>
				</table>
			</c:forEach>
			</s:form>
		</body>

	</html>