package taskArray; 
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorter {
    DataStorage oDataStorage = new DataStorage();
    
        
    void getTheArrayElements(){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the length of array:");
        try {
        oDataStorage.setLengthOfTheArray(scan.nextInt());
        }//catch(NegativeArraySizeException e) 
        catch(InputMismatchException e)
        {
        	//e.printStackTrace();
        	System.out.println("Enter a integer value");
        	System.exit(0);
        }
        System.out.println("Enter the Array Elements :");
        int array[] = new int[oDataStorage.getLengthOfTheArray()];
        try {
        for(int iterate = 0;iterate < oDataStorage.getLengthOfTheArray();iterate++ )
        {
            array[iterate]=scan.nextInt();
        }
        }catch(InputMismatchException e) {
        	System.out.println("Enter only Integer datatype");
        	System.exit(0);
        }
        
        oDataStorage.setUnSortedArray(array);
        scan.close();
        
        System.out.println("Length of Array :"+oDataStorage.getLengthOfTheArray());
        int array1[] = oDataStorage.getUnSortedArray();
        System.out.print("Unsorted array :");
        for(int iterator =0;iterator < array1.length;iterator++)
            System.out.print(array1[iterator]+ " ");
    }
    
    void sortTheArrayInAscendingOrder() {
        int unSortedArray[] = oDataStorage.getUnSortedArray();
        for(int count1 = 0;count1 < unSortedArray.length;count1++) {
            for (int count2 = 0;count2 < unSortedArray.length;count2++) {
                int temp = 0;
                if (unSortedArray[count1] < unSortedArray[count2])
                {
                    temp = unSortedArray[count1];
                    unSortedArray[count1] = unSortedArray[count2];
                    unSortedArray[count2] = temp;
                }
            }
            
        }
        oDataStorage.setArraySortedInAscendingOrder(unSortedArray); 
               }
    
    void sortTheArrayInDescendingOrder() {
        int unSortedArray[] = oDataStorage.getUnSortedArray();
        for(int count1 = 0;count1 < unSortedArray.length;count1++) {
            for (int count2 = 0;count2 < unSortedArray.length;count2++) {
                int temp = 0;
                if (unSortedArray[count1] > unSortedArray[count2]) //20 30 40
                {
                    temp = unSortedArray[count1];
                    unSortedArray[count1] = unSortedArray[count2];
                    unSortedArray[count2] = temp;
                }
            }
            
        }
        oDataStorage.setArraySortedInDescendingOrder(unSortedArray);
        
           }
    
    void displayTheArraySortedInAscendingOrder() {
        int array1[] = oDataStorage.getArraySortedInAscendingOrder();
        System.out.print("\nAscending Order :");
        for(int iterator =0;iterator < array1.length;iterator++)
            System.out.print(array1[iterator]+ " ");         
    }
    
    void displayTheArraySortedInDescendingOrder() {
        int array1[] = oDataStorage.getArraySortedInDescendingOrder();
        System.out.print("\nDescending Order :");
        for(int iterator =0;iterator < array1.length;iterator++)
            System.out.print(array1[iterator]+ " ");         
    }

}