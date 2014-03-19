package websystem.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import websystem.form.GameInsertConditionBeanForm;
import websystem.service.GameInsertService;

public class GameInsertAction {
	public String gameTitle;
	public String hardWare;
	public String impression;
	public String message;

	@ActionForm
	@Resource
	protected GameInsertConditionBeanForm gameInsertConditionBeanForm;

	@Resource
	public GameInsertService gameInsertService;

	/*初期表示*/
	@Execute(validator = false)
	public String index() {
		return "insert.jsp";
	}

	/*検索画面へ*/
	@Execute(validator = false, redirect = true)
	public String result() {
		return "/index";
	}

	/*登録機能*/
	@Execute(input = "insert.jsp")
	public String insert() {
		gameTitle = gameInsertConditionBeanForm.gameTitle;
		hardWare = gameInsertConditionBeanForm.hardWare;
		impression = gameInsertConditionBeanForm.impression;

		String error = "";
		try {
			gameInsertService.insertGame(gameTitle, hardWare, impression);
		} catch (Exception e) {
			error = "SQLが間違っているか、DBに接続できません。" + e.getMessage();
			e.printStackTrace();
		}

		if (error == "") {
			message = gameTitle + "は登録されました。";
		}

		return "insert.jsp";
	}
}
