package exam0820;
enum size{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}
class Order{
	size pizzasize;
	public Order(size pizzasize) {
		this.pizzasize = pizzasize;
		
	}
	public void getConfirmation() {
		switch(pizzasize) {
		case SMALL:
			System.out.println("pizzasize is small");
			break;
		case MEDIUM:
			System.out.println("pizzasize is medium");
			break;
		case LARGE:
			System.out.println("pizzasize is large");
			break;
		case EXTRALARGE:
			System.out.println("pizzasize is extralarge");
			break;
		}
		
	}
}

public class q9enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order ord = new Order(size.LARGE);
		ord.getConfirmation();
	}

}
