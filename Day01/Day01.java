package adventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day01 {

	public static void main(String[] args) throws IOException {
		
		try{
			File f = new File("Day01_Input.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int sum = 0;
		String line = br.readLine();
	
		while(line != null) {
			sum += Integer.parseInt(line);
			line = br.readLine();
		}
			br.close();
			System.out.println("Sum = " +sum);
		
		}
		
		catch (IOException e) {
            e.printStackTrace();
        }                       
		

	}

}
