package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanDto;
import websystem.dto.GameBeanParam;

public class GameSearchService {

	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "/search.sql";

	public List<GameBeanDto> searchGameList(String gameTitle, String hardWare) {

		GameBeanParam param = new GameBeanParam();
		param.gameTitle = gameTitle;
		param.hardWare = hardWare;

		return jdbcManager.selectBySqlFile(GameBeanDto.class, SQL_FILE, param)
				.getResultList();

	}
}
