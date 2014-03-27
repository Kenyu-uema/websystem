package websystem.form;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class GameInsertConditionBeanForm {

	/**
	 * ゲームタイトル
	 */
	@Maxlength(maxlength = 50)
	@Required(target = "insert")
	public String gameTitle;

	/**
	 * ハードウェア
	 */
	@Maxlength(maxlength = 50)
	@Required(target = "insert")
	public String hardWare;

	/**
	 * 感想
	 */

	@Maxlength(maxlength = 1000)
	public String impression;

}
