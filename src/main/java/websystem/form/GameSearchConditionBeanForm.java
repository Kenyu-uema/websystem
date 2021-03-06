package websystem.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class GameSearchConditionBeanForm implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ゲームタイトル
	 */
	@Maxlength(maxlength = 50)
	@Required(target = "search")
	public String gameTitle;

	/**
	 * ハードウェア
	 */
	@Maxlength(maxlength = 50)
	@Required(target = "search")
	public String hardWare;

	/**
	 * ゲームID
	 */
	public String gameId;

	public int count;
}
