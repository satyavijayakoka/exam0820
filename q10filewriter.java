package exam0820;

import java.io.FileWriter;
import java.io.IOException;

public class q10filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "example.txt";
		try {
			FileWriter writer = new FileWriter("example.txt");
			
			writer.write("hello world");
			writer.write("\n");
			writer.write("learning java");
			writer.write("\n");
			writer.write("learning sql");
			writer.write("\n");
			writer.close();			
		
		System.out.println("data is successfully written and file is closed");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
