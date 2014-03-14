package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanDto;
import websystem.dto.GameBeanParam;

public class GameDeleteSevice {

	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/delete.sql";

	public List<GameBeanDto> searchGameList(String gameId) {

		GameBeanParam param = new GameBeanParam();
		param.gameId = gameId;

		return jdbcManager.selectBySqlFile(GameBeanDto.class, SQL_FILE, param)
				.getResultList();

	}
}
