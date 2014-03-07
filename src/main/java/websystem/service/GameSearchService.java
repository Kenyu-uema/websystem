package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import websystem.dto.GameBean;

public class GameSearchService {

	@Resource
	protected static JdbcManager jdbcManager;

	private static final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/serach.sql";

	public static List<GameBean> getSqlOfSelectGameList(String gameTitle, String hardWare) {

		return jdbcManager.selectBySqlFile(GameBean.class, SQL_FILE,)
				.getResultList();

	}
}
