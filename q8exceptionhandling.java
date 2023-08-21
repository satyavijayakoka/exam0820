package exam0820;

public class q8exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(("hello"));
      
      try {
    	  int dividebyzero = 5/0;
      }
      catch(ArithmeticException e) {
    	  System.out.println(e.getMessage());
      }
      System.out.println("bye");
	}

}
