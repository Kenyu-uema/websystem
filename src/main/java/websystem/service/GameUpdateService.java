package websystem.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanParam;

public class GameUpdateService {

	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/update.sql";

	public void searchGame(String gameId, String gameTitle, String hardWare, String impression) {

		GameBeanParam param = new GameBeanParam();
		param.gameId = gameId;
		param.gameTitle = gameTitle;
		param.hardWare = hardWare;
		param.impression = impression;

		jdbcManager.updateBySqlFile(SQL_FILE, param)
				.execute();
	}
}
