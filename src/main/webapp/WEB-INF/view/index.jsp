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

		<!-- 入力チェック -->
			<script type="text/javascript">
				function checkForm(){
					if(document.kakunin.gameTitle.value == ""){
						alert('ゲームタイトルを入力してください');
						document.kakunin.gameTitle.focus();
						return false;
					}
					if(document.kakunin.hardware.value == ""){
						alert('ハードウェアを入力してください');
						document.kakunin.hardware.focus();
						return false;
					}
				return true;
				}
		</script>
	</head>
	<body>


		<!-- 検索条件の入力 -->
		<h1 id = "title">ゲーム管理システム</h1>
		<s:form method="post"   onsubmit = "return checkForm()">
			<p>ゲームタイトル:<html:text size="100"  maxlength="50"  property="gameTitle" value=""/></p>
			<p>ハードウェア &nbsp; :<html:text name="hardware" size="100"  maxlength="50"  property="hardWare" value=""/>

		<!-- 検索・新規のボタン設定 -->
			<input type="button"   value="新規" name="new"  onclick ="goInsert();">
			<input type="submit"  value="検索"  name="search" onclick="return confirm('検索しますか?');"/></p>
		</s:form>


		<!-- エラーの表示 -->
		<p><%if(request.getAttribute("message") != null){%>
				<%=request.getAttribute("message")%>
			<%}%></p>

		<p><%if(request.getAttribute("error") != null){ %>
			<%=request.getAttribute("error")%>
			<%} %></p>
		<hr>

		<table class="float-left" >
			<caption>ゲームマスタ一覧</caption>
			<tr>
				<th>No.</th><th>ゲームタイトル</th><th>ハードウェア</th><th>キャラクター数</th><th></th><th></th>

		<!-- 検索結果の表示 -->
					<!-- <td align="right"><input type="hidden" name = "id" value="<GameBean.GameId()%>"> (GameBean.GameId())}</td>
					<td><input type="hidden" name = "title" value="<GameBean.GameTitle()%>"> (GameBean.GameTitle())}</td>
					<td><input type="hidden" name = "hardware" value="<GameBean.HardWare()%>"> (GameBean.HardWare())}</td>
					<td align="right"><input type="hidden" name = "character" value="<GameBean.Character_count()%>"> (GameBean.Character_count())}</td>
				</tr> -->
		</table>
	</body>
</html>