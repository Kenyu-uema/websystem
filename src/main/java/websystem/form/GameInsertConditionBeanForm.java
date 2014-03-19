package websystem.form;

import org.seasar.struts.annotation.Required;

public class GameInsertConditionBeanForm {

	/**
	 * ゲームタイトル
	 */
	@Required(target = "insert")
	public String gameTitle;

	/**
	 * ハードウェア
	 */
	@Required(target = "insert")
	public String hardWare;

	/**
	 * 感想
	 */

	public String impression;

}
