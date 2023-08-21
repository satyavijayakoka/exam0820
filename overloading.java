package exam0820;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();

		cal.addition(156,123);
		cal.addition(156,123, 112);
		cal.addition(156,123,112,45);
	}

}

// program5
class Calculator{
	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	public void addition(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public void addition(int x, int y, int z, int a) {
		System.out.println(x+y+z+a);
	}
}