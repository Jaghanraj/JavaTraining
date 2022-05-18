package trailFiles;

import java.io.File;

public class FolderCreate {
	void FileCreate() {
		File file = new File("c:\\");
		File[] list =file.listFiles();
		for (File file2 : list) {
			if (file2.isDirectory()){
				System.out.println(file2);				
			}
		}
	}

	public static void main(String[] args) {
		FolderCreate fc = new FolderCreate();
		fc.FileCreate();	 

	}

}
