package websystem.service;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import websystem.dto.GameBean;

public class GameSearchService {

	private static final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/serach.sql";

	public static void main(String[] args) {
		SingletonS2ContainerFactory.init();
		try {
			JdbcManager jdbcManager = SingletonS2Container
					.getComponent(JdbcManager.class);
			SqlOfSelectGameList(jdbcManager);
		} finally {
			SingletonS2ContainerFactory.destroy();
		}
	}

	public static String SqlOfSelectGameList(JdbcManager jdbcManager) {

		List<GameBean> sql = jdbcManager
				.selectBySqlFile(GameBean.class, SQL_FILE)
				.getResultList();
		System.out.println(sql.toString());

		return sql.toString();

	}
}
