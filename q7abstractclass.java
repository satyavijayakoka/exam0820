package exam0820;

public class q7abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car5 audi = new Car5(4);
		audi.brake();
		System.out.println(audi.wheels);
	}

}
abstract class Vehicle{
	int wheels;
	public Vehicle(int w) {
		this.wheels= w;
	}
		abstract void brake();
	
		
	}
class Car5 extends Vehicle{
	public Car5(int w) {
		super(w);
	}
	public void brake() {
		System.out.println("brake of car");
	}
}