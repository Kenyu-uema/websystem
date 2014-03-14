package websystem.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import websystem.form.GameInsertConditionBeanForm;

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

	@ActionForm
	@Resource
	protected GameInsertConditionBeanForm gameInsertConditionBeanForm;

	@Execute(input = "insert.jsp")
	public String insert() {
		gameTitle = gameInsertConditionBeanForm.gameTitle;
		hardWare = gameInsertConditionBeanForm.hardWare;
		impression = gameInsertConditionBeanForm.impression;

		return "insert.jsp";
	}
}
