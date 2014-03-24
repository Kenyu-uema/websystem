package websystem.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class GameUpdateConditionBeanForm implements Serializable {

	private static final long serialVersionUID = 1L;

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
