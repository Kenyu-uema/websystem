package websystem.service;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;

import websystem.dto.GameBean;

public class GameSearchService {

	private static final String SQL_FILE = "META-INF/sql/websystem/entity/Employee/serach.sql";
	public JdbcManager jdbcManager;

	public String getSqlOfSelectGameList(JdbcManager jdbcManager) {
		List<GameBean> sql = jdbcManager
				.selectBySqlFile(GameBean.class, SQL_FILE)
				.getResultList();
		System.out.println(sql.toString());

		return sql.toString();

	}
}
