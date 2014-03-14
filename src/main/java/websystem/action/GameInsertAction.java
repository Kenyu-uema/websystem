package websystem.action;

import org.seasar.struts.annotation.Execute;

public class GameInsertAction {
	@Execute(validator = false)
	public String index() {
		return "insert.jsp";
	}

	@Execute(validator = false)
	public String result() {
		return "http://localhost:8081/WebSystem/";
	}

	@Execute(input = "insert.jsp")
	public String insert() {
		return "insert.jsp";
	}
}
