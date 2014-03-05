package websystem.form;

import org.seasar.struts.annotation.Required;

public class GameSearchConditionBean {

	/**
	 * ゲームID
	 */
	@Required
	private String gameId = "";

	/**
	 * ゲームタイトル
	 */
	@Required
	private String gameTitle = "";

	/**
	 * ハードウェア
	 */
	@Required
	private String hardware = "";

	/**
	 * 感想
	 */
	@Required
	private String impression = "";
}
