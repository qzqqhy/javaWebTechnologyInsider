package jwt.decorated;

/**
 * 另外一个增加了功能那个的类
 * 
 * @author qiu_zhongqiang
 *
 */
public class HScrollBarDecorator extends WindowDecorator {

	public HScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		this.decoratedWindow.draw();
		drawHScrollBar();
	}

	private void drawHScrollBar() {
		System.out.println("draw HScroll Bar");
	}

	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + "--include hscrollbar";
	}

}
