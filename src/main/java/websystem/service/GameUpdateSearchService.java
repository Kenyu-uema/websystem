package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanDto;
import websystem.dto.GameBeanParam;

public class GameUpdateSearchService {
	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/updatesearch.sql";

	/*更新データ検索のSQL実行*/
	public List<GameBeanDto> searchGame(String gameId) {

		GameBeanParam param = new GameBeanParam();
		param.gameId = gameId;

		return jdbcManager.selectBySqlFile(GameBeanDto.class, SQL_FILE, param)
				.getResultList();
	}
}
