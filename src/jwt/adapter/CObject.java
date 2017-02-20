package jwt.adapter;

/**
 * 定义输出电压为 220V 的变压器类
 * 
 * @author qiu_zhongqiang
 *
 */
public class CObject implements IAdapter {

	private ChangeAdapter changeAdapter;

	public CObject() {
		changeAdapter = new ChangeAdapter();
	}

	@Override
	public String Drive() {
		return changeAdapter.web("（2）输出电压：220V");
	}

}
