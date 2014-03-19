package websystem.form;

import org.seasar.struts.annotation.Required;

public class GameSearchConditionBeanForm {
	/**
	 * ゲームタイトル
	 */
	@Required(target = "search")
	public String gameTitle;

	/**
	 * ハードウェア
	 */
	@Required(target = "search")
	public String hardWare;

	/**
	 * ゲームID
	 */
	public String gameId;
}
