/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package websystem.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import websystem.dto.GameBeanDto;
import websystem.form.GameSearchConditionBeanForm;
import websystem.service.GameDeleteService;
import websystem.service.GameSearchCountService;
import websystem.service.GameSearchService;
import websystem.service.GameUpdateSearchService;

public class IndexAction {
	public String gameTitle;
	public String hardWare;
	public String gameId;
	public String message;
	public String countmessage;
	int count = 0;
	long searchCount = 0;

	public List<GameBeanDto> gameBeanList;

	@ActionForm
	@Resource
	protected GameSearchConditionBeanForm gameSearchconditionBeanForm;

	@Resource
	public GameSearchService gameSearchService;

	@Resource
	public GameDeleteService gameDeleteService;

	@Resource
	public GameUpdateSearchService gameUpdateSearchService;

	@Resource
	public GameSearchCountService gameSearchCountService;

	/*初期表示*/
	@Execute(validator = false)
	public String index() {
		gameId = gameSearchconditionBeanForm.gameId;

		gameBeanList = gameUpdateSearchService.searchGame(gameId);
		return "index.jsp";
	}

	/*初期表示*/
	@Execute(validator = false, removeActionForm = true)
	public String clear() {

		return "index.jsp";
	}

	/*検索処理*/
	@Execute(input = "index.jsp")
	public String search() throws Exception {
		gameTitle = gameSearchconditionBeanForm.gameTitle;
		hardWare = gameSearchconditionBeanForm.hardWare;

		String error = "";
		try {
			gameBeanList = gameSearchService.searchGameList(gameTitle, hardWare);
		} catch (Exception e) {
			error = "SQLが間違っているか、DBに接続できません。" + e.getMessage();
			e.printStackTrace();
		}

		gameSearchconditionBeanForm.count++;
		message = gameSearchconditionBeanForm.count + "回目のこんにちは";

		searchCount = gameSearchCountService.searchGameCount(gameTitle, hardWare);

		if (searchCount == 0) {
			countmessage = "該当データがありません";
		} else {
			countmessage = "検索件数:" + searchCount + "件";
		}
		return "index.jsp";
	}

	/*登録画面へ*/
	@Execute(validator = false, redirect = true)
	public String insert() {
		return "gameInsert";
	}

	/*更新画面へ*/
	@Execute(validator = false, redirect = true)
	public String update() {
		gameId = gameSearchconditionBeanForm.gameId;
		return "gameUpdate?gameID=" + gameId;
	}

	/*削除機能*/
	@Execute(validator = false, input = "index.jsp")
	public String delete() {
		gameId = gameSearchconditionBeanForm.gameId;
		gameTitle = gameSearchconditionBeanForm.gameTitle;

		gameDeleteService.deleteGame(gameId);
		String error = "";
		if (error == "") {
			message = gameTitle + "は削除されました。";
		}

		return "index.jsp";
	}
}
