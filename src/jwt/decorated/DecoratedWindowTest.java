package jwt.decorated;

public class DecoratedWindowTest {

	public static void main(String[] args) {
		// 这里可以看到原来见到的SimpleWindow就有了HScrollbar和VScrollBar
		Window decoratedWindow = new HScrollBarDecorator(new SimpleWindow());
		System.out.println(decoratedWindow.getDescription());
		decoratedWindow.draw();
	}
}
