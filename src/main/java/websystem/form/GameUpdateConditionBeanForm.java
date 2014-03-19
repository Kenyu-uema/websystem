package websystem.form;

import org.seasar.struts.annotation.Required;

public class GameUpdateConditionBeanForm {
	/**
	 * ゲームID
	 */
	public String gameId;

	/**
	 * ゲームタイトル
	 */
	@Required(target = "update")
	public String gameTitle;

	/**
	 * ハードウェア
	 */
	@Required(target = "update")
	public String hardWare;

	/**
	 * 感想
	 */
	public String impression;
}
