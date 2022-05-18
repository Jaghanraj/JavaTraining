package classObjectSample;
//import java.util.Scanner;
public class Count_types {

	public static void main(String[] args) {
		  String test = "Aa Kiu, I swd skieo 236587. GH Kiu: sieo?? 25.33";
		  count(test);

	}
	public static void count(String X){
		char[] chars = X.toCharArray();
		int letter = 0, space = 0, num =0, other =0;
		for(int i = 0; i < X.length(); i++) {
			if(Character.isLetter(chars[i])) {
				letter ++;
			}
			else if(Character.isDigit(chars[i])) {
				num ++;
			}
			else if(Character.isSpaceChar(chars[i])) {
				space ++;
			}
			else {
				other ++;
			}
		
		}
		
	
	System.out.println("The string is :Aa Kiu, I swd skieo 236587. GH Kiu: sieo?? 25.33");
	System.out.println("letters:"+ letter);
	System.out.println("number :"+ num);
	System.out.println("Space :"+ space);
	System.out.println("Others :"+ other);
	
	}

}
