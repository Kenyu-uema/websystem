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

		//新規登録画面へ
				function goInsert(){
					 location.href="http://localhost:8081/kenshu/game/insert";
				}

		//修正画面へ
				function goUpDate(i){
					document.getElementById('deleteForm' + i).method = "get";
					document.getElementById('deleteForm' + i).action = "/kenshu/game/update";
				}
		</script>
	</head>
	<body>


		<!-- 検索条件の入力 -->
		<h1 id = "title">ゲーム管理システム</h1>
		<form id="searchForm"  method="post" action="/kenshu/game/list"  name="kakunin"   onsubmit = "return checkForm()">
			<p>ゲームタイトル:<input type="text" name="gameTitle"  size="100"  maxlength="50" ></p>
			<p>ハードウェア &nbsp; :<input type="text" name="hardware" size="100"  maxlength="50" >

		<!-- 検索・新規のボタン設定 -->
			<input type="button"   value="新規" name="new"  onclick ="goInsert();">
			<input type="submit"  value="検索"  name="search" onclick="return confirm('検索しますか?');"/></p>
		</form>


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
			</tr>


		<!-- 検索結果の表示 -->
					<input type="hidden" name = "impression" >
				<tr>
					<td align="right"><input type="hidden" name = "id" ></td>
					<td><input type="hidden" name = "title" ></td>
					<td><input type="hidden" name = "hardware" ></td>
					<td align="right"><input type="hidden" name = "character" ></td>

		<!-- 修正・削除のボタン設定 -->
					<td><input type="submit"  name="update" value="修正"  onclick ="goUpDate();" ></td>
					<td><input type="submit"  name="del" value="削除" onclick="return confirm('削除しますか?');"/></td>
				</tr>
		</table>






		<!-- <div class="float-left" style="width:500px;margin-top:50px;margin-left:50px">
			課題１
			<ol>
			<li>htmlとcssを駆使して、画面デザインをかっこよくします。<br>
			かっこいいデザインが思いつかない人は、Webシステム仕様書を参考にしてください。</li>
			<li>始めの画面表示で、「null」という文字が表示されないようにします。</li>
			<li>検索を開始する前に、クライアント側のJavaScriptで処理を続行するかどうかの確認メッセージを表示します。
			<br>キャンセルした場合は検索実行を取りやめます。</li>
			<li>DBの研修課題で作ったゲームマスタの情報を画面下部の一覧に表示します。</li>
			</ol>

			課題２
			<ol>
			<li>検索条件に入力した内容で、SQLの検索条件を増やして、検索結果に反映させます。</li>
			<li>検索を開始する前にJavaScriptで入力をチェックします。<br>
				<ul>
					<li>ゲームタイトルに値が入力されていない場合にエラーメッセージ表示</li>
					<li>ハードウェアに値が入力されていない場合にエラーメッセージ表示</li>
				</ul>
			</li>
			</ol>

			課題３
			<ol>
			<li>ゲームマスタ一覧の検索結果件数を画面に表示します。<br>
			ただし、件数は、select count(*) from ...を使ってDBから取得してください。
			</li>
			<li>ゲームマスタ一覧に、キャラクタ数を表示する列をを追加してください。</li>
			</ol>

			課題４
			<ol>
			<li>各ゲームマスタ一覧の最終列に、削除ボタンを追加します。<br>
				削除ボタンを押すと、ゲームマスタの該当レコードを削除します。
				<ul>
					<li>htmlを編集し、削除ボタンを追加</li>
					<li>GameDeleteServletの追加</li>
					<li>web.xmlにservletを登録</li>
					<li>削除ボタンをクリックすると、GameDeleteServletにリクエストを送信する。</li>
					<li>GameDeleteServletでDBのレコード処理を実装</li>
					<li>一覧画面を再表示し、メッセージ「{ゲームタイトル}を削除しました。」を表示します。<br>
					（{ゲームタイトル}は削除したゲームタイトル名）
				</ul>
			</li>
			</ol>
			
			課題５
			<ol>
			<li>各自で自由にアレンジを加えてみましょう。</li>
			<li>Webシステム仕様書を参考に、新規登録・編集画面にも挑戦してみましょう。</li>
			</ol>
			
			
		</div>-->
	</body>
</html>