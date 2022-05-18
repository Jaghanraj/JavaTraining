package taskFileHandling;
//Read a file and print in console and show the num of Lines and words
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderEg {
    
    void countWordsAndLines() throws Exception {
        
        int LinesCount = 0;
        int wordCount = 0;
        
        File file;
        file = new File("D:\\Data2.txt");
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        
        String currentLine = bufferedReader.readLine();
        
        while (currentLine != null) {
            
            LinesCount++;           
            
            
            String[] words = currentLine.split(" ");          
         
                   
            wordCount = wordCount + words.length;
            
            System.out.println(currentLine);
            
            currentLine = bufferedReader.readLine();
            
            
        }
        
        System.out.println("Number of Lines : " + LinesCount);
        System.out.println("Number of Words : " + wordCount);
        bufferedReader.close();
    }
}