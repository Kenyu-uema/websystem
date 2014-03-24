package websystem.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import websystem.dto.GameBeanDto;
import websystem.form.GameUpdateConditionBeanForm;
import websystem.service.GameUpdateSearchService;
import websystem.service.GameUpdateService;

public class GameUpdateAction {

	public String gameTitle;
	public String hardWare;
	public String impression;
	public String gameId;
	public String message;

	public List<GameBeanDto> gameBeanList;

	@ActionForm
	@Resource
	public GameUpdateConditionBeanForm gameUpdateConditionBeanForm;

	@Resource
	public GameUpdateSearchService gameUpdateSearchService;

	@Resource
	public GameUpdateService gameUpdateService;

	/*初期表示*/
	@Execute(validator = false)
	public String index() {
		gameId = gameUpdateConditionBeanForm.gameId;

		gameBeanList = gameUpdateSearchService.searchGame(gameId);
		return "update.jsp";
	}

	/*検索画面へ*/
	@Execute(validator = false, redirect = true)
	public String result() {
		gameId = gameUpdateConditionBeanForm.gameId;

		return "/index?gameID=" + gameId;
	}

	/*更新機能*/
	@Execute(input = "update.jsp")
	public String update() {
		gameId = gameUpdateConditionBeanForm.gameId;
		gameTitle = gameUpdateConditionBeanForm.gameTitle;
		hardWare = gameUpdateConditionBeanForm.hardWare;

		impression = gameUpdateConditionBeanForm.impression;

		String error = "";
		try {
			gameUpdateService.searchGame(gameId, gameTitle, hardWare, impression);
		} catch (Exception e) {
			error = "SQLが間違っているか、DBに接続できません。";
			message = error;
		}

		try {
			gameBeanList = gameUpdateSearchService.searchGame(gameId);
		} catch (Exception e) {
			error = "SQLが間違っているか、DBに接続できません。";
			message = error;
		}

		if (error == "") {
			message = gameTitle + "は修正されました。";
		}
		return "update.jsp";
	}
}
