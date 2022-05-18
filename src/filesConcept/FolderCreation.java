package filesConcept;                     //File creation, Sub folder Creation, Folder deletion
import java.io.File;
public class FolderCreation {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
  //how to create folder 
                File folder=new File("C:\\Users\\jaghanraj.srinivasan\\Desktop\\jaghan");
                //to verify the jaghan folder is there are not
                
                boolean present= folder.exists();
                System.out.println("Folder Present - "+present);
                //if the folder is not, use if to create a folder
                if(present == false)
                	folder.mkdir();  //to create a folder
                // file.mkdirs();        to create a multiple sub folders. add one by one near Desktop
                
                present=folder.exists();
                System.out.println("Folder Present - "+present);
                
                //To delete the existing folder
                //folder.delete();
        }
}
