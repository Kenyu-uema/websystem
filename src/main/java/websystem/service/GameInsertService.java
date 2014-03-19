package websystem.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanParam;

public class GameInsertService {
	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/insert.sql";

	/*登録のSQL実行*/
	public void insertGame(String gameTitle, String hardWare, String impression) {

		GameBeanParam param = new GameBeanParam();
		param.gameTitle = gameTitle;
		param.hardWare = hardWare;
		param.impression = impression;

		jdbcManager.updateBySqlFile(SQL_FILE, param)
				.execute();

	}
}
