package filesConcept;

import java.io.File;

public class SeparateTxtFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\jaghanraj.srinivasan\\Desktop");
		File[] fileFolderList = file.listFiles();
		for( File f : fileFolderList )
		{
			if (f.isFile())
			{
				String fileName = f.getName();
				int lastDot = fileName.lastIndexOf(".");
				String extension = fileName.substring( lastDot+1);
				if(extension.equals("ini"));
				System.out.println( fileName );  //To find SizeOfFile f.length()
			}
		}

	}

}
