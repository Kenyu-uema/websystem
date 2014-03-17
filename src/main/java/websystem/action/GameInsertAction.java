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

	@Execute(validator = false)
	public String index() {
		return "insert.jsp";
	}

	@Execute(validator = false, redirect = true)
	public String result() {
		return "http://localhost:8081/WebSystem/";
	}

	@Resource
	public GameInsertService gameInsertService;

	@ActionForm
	@Resource
	protected GameInsertConditionBeanForm gameInsertConditionBeanForm;

	@Execute(validator = false, input = "insert.jsp")
	public String insert() {
		gameTitle = gameInsertConditionBeanForm.gameTitle;
		hardWare = gameInsertConditionBeanForm.hardWare;
		impression = gameInsertConditionBeanForm.impression;

		gameInsertService.insertGame(gameTitle, hardWare, impression);

		return "insert.jsp";
	}
}
