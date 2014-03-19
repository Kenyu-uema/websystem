package websystem.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanParam;

public class GameDeleteService {
	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/delete.sql";

	/*削除のSQL実行*/
	public void deleteGame(String gameId) {

		GameBeanParam param = new GameBeanParam();
		param.gameId = gameId;

		jdbcManager.updateBySqlFile(SQL_FILE, param)
				.execute();
	}
}
