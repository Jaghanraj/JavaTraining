package taskFileHandling;
//To create a file and print the lines to the file

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.InputMismatchException;
import java.util.Scanner;

public class  FileWriterEg {
	Scanner scan = new Scanner(System.in);
	
	void getNumberOfLines() throws IOException    
	{
		Integer numberOfLines = 0;
		String sentences;
		
		File  file=new File(" D:\\fileHandling.txt");
		boolean present = file.exists();
		System.out.println("File present :" +present);
		
		
		System.out.println("Enter the number of lines needed :");
		try {
			numberOfLines = scan.nextInt();
			scan.nextLine();
		}
		 catch(InputMismatchException ime) {
			System.out.println("Enter Integer values");
		}	 
		
		
		FileWriter  fileWriter = new FileWriter("D:\\fileHandling.txt");		
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter); 
		
		System.out.println("Enter the content to store in file :");
		
		for(int line = 0; line < numberOfLines; line++)
		{
			sentences = scan.nextLine();
			bufferWriter.write(sentences);
			bufferWriter.newLine();
		}
		
		bufferWriter.flush();
		bufferWriter.close();	
		scan.close();
	
	}

}
