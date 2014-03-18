package websystem.form;

import org.seasar.struts.annotation.Required;

public class GameUpdateConditionBeanForm {
	/**
	 * ゲームID
	 */
	@Required
	public String gameId;

	/**
	 * ゲームタイトル
	 */
	@Required
	public String gameTitle;

	/**
	 * ハードウェア
	 */
	@Required
	public String hardWare;

	/**
	 * 感想
	 */
	@Required
	public String impression;
}
