package jwt.adapter;

public class Program {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IAdapter dap = new Adapter();
		System.out.println(dap.Drive());
		dap = new CClass();
		System.out.println(dap.Drive());
		dap = new CObject();
		System.out.println(dap.Drive());
	}
}
