package jwt.decorated;

public class VScrollBarDecorator extends WindowDecorator {

	public VScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	/**
	 * 这里可以看到window的功能方便的被扩展了，调用decoratedWindow.draw之前还可以增加其他的功能。</br>
	 * 并且在使用该方法的时候，才会去实例化window和decoratedWindow
	 */
	@Override
	public void draw() {
		decoratedWindow.draw();
		drawVScrollBar();
	}

	private void drawVScrollBar() {
		System.out.print(" ++draw VScroll Bar++");
	}

	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + "-- include vscorllbar";
	}

	public static void main(String[] args) {
		Window decoratedWindow = new SimpleWindow();
		VScrollBarDecorator vsbd = new VScrollBarDecorator(decoratedWindow);
		System.out.println("被修饰类SimpleWindow: " + decoratedWindow.getDescription());
		System.out.print("被修饰类 SimpleWindow: ");
		decoratedWindow.draw();

		System.out.println();

		System.out.println("修饰后的输出: " + vsbd.getDescription());
		System.out.print("修饰后的输出: ");
		vsbd.draw();
	}
}
