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
		<script type="text/javascript">
				function checkForm(){
				if(document.insert.gameTitle.value == ""){
					alert('ゲームタイトルを入力してください');
					document.insert.gameTitle.focus();
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
		<h1 id = "title">ゲーム管理システム&gt;登録画面</h1>

		<!-- 登録用のボタン設定 -->
			<s:form  method="post"  onsubmit = "return checkForm()">
			<div class="back"><a><s:link href="result">前の画面に戻ります </s:link></a></div>
			<div class="insert"><input type="submit"   value="登録" name="insert" onclick="return confirm('登録しますか?');"/></div>
			<br>
		<!-- 登録内容の入力 -->
			<table class="float-left" >
				<tr>
					<th>ゲームタイトル</th><td><input type="text" name="gameTitle"  size="146"  maxlength="50" ></td>
				</tr>
				<tr>
					<th>ハードウェア</th><td><input type="text" name="hardware"  size="146"  maxlength="50" ></td>
				</tr>
				<tr>
					<th>感想</th><td><textarea name="impression"  cols="100"  rows="10" maxlength="1000" ></textarea></td>
				</tr>
			</s:form>
			</table>
	</body>

</html>