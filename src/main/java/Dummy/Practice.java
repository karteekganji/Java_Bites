package Dummy;

public class Practice {

	static int x;
	static int y;

	public void value() {
		x = x + 1;
		y = y + 1;
	}

	public void show() {
		System.out.println("X >>> " + x);
		System.out.println("Y >>> " + y);
	}

	public static void main(String[] args) {

		Practice object = new Practice();
		Practice object2 = new Practice();
		object.value();
		object.show();
		System.out.println("------------");
		object2.value();
		object2.show();
	}

}
