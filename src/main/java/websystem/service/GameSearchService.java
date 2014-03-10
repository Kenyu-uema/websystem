package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBeanDto;
import websystem.dto.GameBeanParam;

public class GameSearchService {

	@Resource
	protected JdbcManager jdbcManager;

	private static final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/search.sql";

	public List<GameBeanDto> getSqlOfSelectGameList(String gameTitle, String hardWare) {

		GameBeanParam param = new GameBeanParam();
		param.gameTitle = gameTitle;
		param.hardWare = hardWare;

		return jdbcManager.selectBySqlFile(GameBeanDto.class, SQL_FILE, param)
				.getResultList();

	}
}
