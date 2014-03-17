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
import websystem.service.GameSearchService;

public class IndexAction {

	public List<GameBeanDto> gameBeanList;
	public String gameTitle;
	public String hardWare;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Resource
	public GameSearchService gameSearchService;

	@ActionForm
	@Resource
	protected GameSearchConditionBeanForm gameSearchconditionBeanForm;

	@Execute(input = "index.jsp")
	public String search() {
		gameTitle = gameSearchconditionBeanForm.gameTitle;
		hardWare = gameSearchconditionBeanForm.hardWare;

		gameBeanList = gameSearchService.searchGameList(gameTitle, hardWare);
		return "index.jsp";
	}

	@Execute(validator = false, redirect = true)
	public String insert() {
		return "http://localhost:8081/WebSystem/gameInsert/";
	}

	@Execute(validator = false, redirect = true)
	public String update() {
		return "http://localhost:8081/WebSystem/gameUpdate/";
	}

	@Execute(validator = false, redirect = true)
	public String delete() {
		return "http://localhost:8081/WebSystem/gameUpdate/";
	}
}
