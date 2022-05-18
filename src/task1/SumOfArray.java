package task1;

public class SumOfArray {
		 int array[] =   {1,2,3,4,5}, count,sum=0;
		 public void sumarray()
		 {	 
		 for(count = 0; count<array.length;count++)		 
			 sum = sum + array[count];
		 }
		 public void display()
		 {
			 System.out.println("Sum of array elements :" +sum);
		 }
	}


