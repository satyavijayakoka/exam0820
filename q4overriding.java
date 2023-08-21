package exam0820;

public class q4overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog2 d = new Dog2(4,1);
		d.eat();
		d.makesound();
		System.out.println(d.legs);
		System.out.println(d.tail);
	}

}
class Animal{
	int legs;
	public Animal(int lg) {
		this.legs = lg;
	}
	public void eat() {
		System.out.println("i eat");
	}
	public void makesound() {
		System.out.println("makes sound");
	}
}
class Dog2 extends Animal{
	int tail;
	public Dog2(int lg, int tail) {
		super(lg);
		this.tail= tail;
	}
	public void eat() {
		System.out.println("i eat");
	}
	public void makesound() {
		System.out.println("barks");
	}
}
class Cat2 extends Animal{
	int tail;
	public Cat2(int lg, int tail) {
		super(lg);
		this.tail= tail;
		
	}
	public void eat() {
		System.out.println("i eat");
	}
	public void makesound() {
		System.out.println("meow");
	}
}



