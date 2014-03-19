package websystem.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanParam;

public class GameSearchCountService {
	@Resource
	protected JdbcManager jdbcManager;

	public long count;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/searchcount.sql";

	/*検索のSQL実行*/
	public long searchGameCount(String gameTitle, String hardWare) {

		GameBeanParam param = new GameBeanParam();
		param.gameTitle = gameTitle;
		param.hardWare = hardWare;

		return count = jdbcManager.getCountBySqlFile(SQL_FILE, param);
	}
}
