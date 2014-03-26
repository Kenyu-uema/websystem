package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.util.LikeUtil;

import websystem.dto.GameBeanDto;
import websystem.dto.GameBeanParam;

public class GameSearchService {
	@Resource
	protected JdbcManager jdbcManager;

	private final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/search.sql";

	/*検索のSQL実行*/
	public List<GameBeanDto> searchGameList(String gameTitle, String hardWare) {

		GameBeanParam param = new GameBeanParam();
		param.gameTitle = LikeUtil.escapeWildcard(gameTitle);
		param.hardWare = LikeUtil.escapeWildcard(hardWare);

		return jdbcManager.selectBySqlFile(GameBeanDto.class, SQL_FILE, param)
				.getResultList();
	}

}
