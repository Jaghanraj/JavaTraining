package trailFiles;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	void fileCreate() throws IOException {
		File file = new File("d:\\jaghan.txt");
		boolean createfile = file.createNewFile();
		System.out.println(createfile);
		System.out.println(file.getName());
		
	}

	public static void main(String[] args) throws IOException {
		FileCreate fl = new FileCreate();
		fl.fileCreate();
		 

	}

}
