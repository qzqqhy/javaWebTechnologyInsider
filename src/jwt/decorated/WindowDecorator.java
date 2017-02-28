package jwt.decorated;

/**
 * window的修饰类，这里使用的修饰方法为将window做参数传入构造方法中，</br >
 * 这样的话，修饰类的子类可以动态的增加新的功能，也就是不需要编译时候就实例化window类了
 * 
 * @author qiu_zhongqiang
 *
 */
public abstract class WindowDecorator implements Window {

	protected Window decoratedWindow;

	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}

}
