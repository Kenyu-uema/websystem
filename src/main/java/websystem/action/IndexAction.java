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
import websystem.service.GameSearchService;

public class IndexAction {

	public List<GameBeanDto> gameBeanList;
	public String gameTitle;
	public String hardWare;
	public String gameId;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Resource
	public GameSearchService gameSearchService;

	@ActionForm
	@Resource
	protected GameSearchConditionBeanForm gameSearchconditionBeanForm;

	@Execute(validator = false, input = "index.jsp")
	public String search() {
		gameTitle = gameSearchconditionBeanForm.gameTitle;
		hardWare = gameSearchconditionBeanForm.hardWare;

		gameBeanList = gameSearchService.searchGameList(gameTitle, hardWare);
		return "index.jsp";
	}

	@Execute(validator = false, redirect = true)
	public String insert() {
		return "gameInsert";
	}

	@Execute(validator = false, redirect = true)
	public String update() {
		gameId = gameSearchconditionBeanForm.gameId;
		return "gameUpdate?gameID=" + gameId;
	}

	@Resource
	public GameDeleteService gameDeleteService;

	@Execute(validator = false, input = "index.jsp")
	public String delete() {
		gameId = gameSearchconditionBeanForm.gameId;

		gameDeleteService.deleteGame(gameId);

		return "index.jsp";
	}
}
