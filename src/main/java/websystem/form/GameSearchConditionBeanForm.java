package websystem.form;

import org.seasar.struts.annotation.Required;

public class GameSearchConditionBeanForm {
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
}
