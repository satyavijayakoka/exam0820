package exam0820;
interface WBA{
	public void loan();
	public void save();
}
interface WBI{
	public void displaycountry();
	public void displaycity();
}

public class q6interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank hyd = new Bank();
		hyd.displaycity();
		hyd.displaycountry();
		hyd.loan();
		hyd.save();
	}

}
class Bank implements WBA,WBI{

	
	public void displaycountry() {
		
		System.out.println("I AM FROM INDIA");
	}

	
	public void displaycity() {
		
		System.out.println("I AM FROM HYDERABAD");
	}

	
	public void loan() {
		
		System.out.println("I AM loan method");
	}

	
	public void save() {
		
		System.out.println("I AM save method");
	}
	
}