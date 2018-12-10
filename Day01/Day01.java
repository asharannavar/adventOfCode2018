package adventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day01 {
	int frequency = 0;
	List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		
	Day01 day1 = new Day01();	
	while (!day1.readFile()) {
		System.out.println("Frequency = " +day1.frequency);
		
	}

	}
	
	public boolean readFile() throws IOException {
		File f = new File("Day01_Input.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = br.readLine();
		
		while(line != null) {			
			Integer sum = Integer.valueOf(line);
			frequency += sum; 
			if(!list.contains(frequency)) {
				list.add(frequency);
			} else {
				System.out.println("Duplicate = " +frequency);
				return true;
			}
			line = br.readLine();
		}
			br.close();
			return false;
		
		}

}
