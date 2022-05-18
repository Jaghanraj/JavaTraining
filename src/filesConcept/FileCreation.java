package filesConcept;        //To create text file, delete text file, Rename text file , to find FileName

import java.io.File;
 

public class FileCreation {

	public static void main(String[] args)   {
		//To create a text file inside the Folder
		File  file=new File("C:\\Users\\jaghanraj.srinivasan\\Desktop\\jaghan\\Text.txt");
		boolean present = file.exists();
		System.out.println("File present :" +present);
		if (present == false)
		{
			file.mkdirs();
		}
		present = file.exists();
		System.out.println("File Present :" +present); 
		
		//How to delete file
		/*File file = new File("C:\\Users\\jaghanraj.srinivasan\\Desktop\\jaghan\\Text");
		file.delete();
		boolean present = file.exists();
		System.out.println("File exist :" +present); */
		
		//How to rename a File
		/* File file = new File("C:\\Users\\jaghanraj.srinivasan\\Desktop\\Jaghan\\Text.txt");
		 file.mkdir();
		File newName = new File("C:\\Users\\jaghanraj.srinivasan\\Desktop\\Jaghan\\Jaghan.txt");
		
		boolean renameSuccess = file.renameTo(newName);
		System.out.println("ReNameSuccess :" +renameSuccess); */
		
		//How to find file name   (Printing fileName)
	/*	file.getName();
		System.out.println("FileName : "+newName.getName()); */
		
		// use of canExecute() , use of canRead() , use of canWrite()
		/* System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite()); */
		
		
		
	}

}
