package exam0820;

public class q3inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son Jathin = new Son("ratnam","koka","shiva","Jathin");
		Jathin.displayFname();
		Jathin.displayGname();
		Jathin.displaySname();
		System.out.println(Jathin.firstName);
		System.out.println(Jathin.Fname);
		System.out.println(Jathin.lastName);
		System.out.println(Jathin.Sname);
	}

}

class GrandFather{
	String firstName;
	String lastName;
	public GrandFather(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayGname() {
		System.out.println(this.firstName + this.lastName);
	}
}
class Father2 extends GrandFather{
	String Fname;
	public Father2(String fn , String ln, String Fn) {
		super(fn, ln);
		this.Fname= Fn;
	}
	public void displayFname() {
		System.out.println(this.Fname+this.lastName);
	}
	
}
class Son extends Father2{
	String Sname;
	public Son(String fn , String ln, String Fn, String Sn) {
		super(fn,ln,Fn);
		this.Sname = Sn;
	}
	public void displaySname() {
		System.out.println(this.Sname +this.lastName);
	}
}


