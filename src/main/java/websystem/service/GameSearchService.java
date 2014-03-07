package websystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBean;

public class GameSearchService {

	@Resource
	protected static JdbcManager jdbcManager;

	private static final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/serach.sql";

	public static List<GameBean> getSqlOfSelectGameList() {

		return jdbcManager.selectBySqlFile(GameBean.class, SQL_FILE, gameSearchconditionBeanForm)
				.getResultList();

	}
}
