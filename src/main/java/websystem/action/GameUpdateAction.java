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

	public List<GameBeanDto> gameBeanList;

	@ActionForm
	@Resource
	public GameUpdateConditionBeanForm gameUpdateConditionBeanForm;

	public GameUpdateSearchService gameUpdateSearchService;

	@Execute(validator = false)
	public String index() {
		gameId = gameUpdateConditionBeanForm.gameId;

		gameBeanList = gameUpdateSearchService.searchGame(gameId);
		return "update.jsp";
	}

	@Execute(validator = false, redirect = true)
	public String result() {
		return "/index";
	}

	public GameUpdateService gameUpdateService;

	@Execute(validator = false, input = "update.jsp")
	public String update() {
		gameId = gameUpdateConditionBeanForm.gameId;
		gameTitle = gameUpdateConditionBeanForm.gameTitle;
		hardWare = gameUpdateConditionBeanForm.hardWare;
		impression = gameUpdateConditionBeanForm.impression;

		gameUpdateService.searchGame(gameId, gameTitle, hardWare, impression);

		gameBeanList = gameUpdateSearchService.searchGame(gameId);
		return "update.jsp";
	}
}
