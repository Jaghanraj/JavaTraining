package trailFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name :");
		String input = scan.nextLine();
		String getUserDirectory = System.getProperty("user.dir");
		String path = getUserDirectory +File.separator+input;
		System.out.println(path);
    	scan.close();
//		File file = new File(path);
//		try {
//			boolean store = file.createNewFile();
//		} catch (IOException e) {			 
//			e.printStackTrace();
//		}
//		
//		System.out.println();
//		System.out.println(input.isEmpty());
//		 

	}

}
