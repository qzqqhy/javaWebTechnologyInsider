package jwt.adapter;

/**
 * 定义输出电压为 110V 的变压器类
 * 
 * @author qiu_zhongqiang
 *
 */
public class CClass extends ChangeAdapter implements IAdapter {

	@Override
	public String Drive() {
		return this.web("（1）输出电压：110V");
	}

}
