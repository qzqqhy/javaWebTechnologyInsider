package jwt.decorated;

/**
 * window 实现类
 * 
 * @author qiu_zhongqiang
 *
 */
public class SimpleWindow implements Window {

	@Override
	public void draw() {
		System.out.print("draw window");
	}

	@Override
	public String getDescription() {
		return "draw window";
	}

}
