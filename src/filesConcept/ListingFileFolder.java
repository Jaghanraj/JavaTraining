package filesConcept;

import java.io.File;

public class ListingFileFolder {

	public static void main(String[] args) {
		//Listing all Files and Folders in a Directory
				/* File file = new File("C:\\Users\\jaghanraj.srinivasan\\Desktop");
				String[] listOfFilesFolders = file.list();
				for(int i =0; i<listOfFilesFolders.length; i++)
				{
					System.out.println(listOfFilesFolders[i]);
				} */
				
				//Print files and folders with location
				File file = new File("C:\\Users\\jaghanraj.srinivasan\\Desktop");
				File[] fileFolderList = file.listFiles();
				for( File f : fileFolderList )
				/*{
					System.out.println( fileFolderList[i]);
			    } */
				
				//continue above
				//Only to print Files. Close above sysout
			/*	if(f.isFile())
				{
					System.out.println(f);
				} */
				
				//Only to print Folders.
				if(f.isDirectory())
				{
					System.out.println(f);
				}
	}

}
