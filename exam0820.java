

package exam0820;

public class exam0820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PROGRAM 1
		int [][] numbers = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		for(int [] s1: numbers) {
			for(int s2 : s1) {
				System.out.println(s2);
			}
		}
		
		// program 2
		
		Database3 db3 = Database3.getObject();
		db3.connect();

		}

}


// program 2
class Database3{
	private static Database3 obj;
	private Database3() {
	}
		public static Database3 getObject() {
			if(obj == null) {
				obj = new Database3();	
			}
			return obj;
			
		}
		public void connect() {
			System.out.println("connected");
		}
	}
