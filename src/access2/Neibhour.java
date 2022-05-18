package access2;
import access1.MainPerson;

public class Neibhour extends MainPerson {    //To achieve protected use inheritance technique

	public static void main(String[] args) {
		MainPerson obj = new MainPerson();
		obj.msg();
		Neibhour call = new Neibhour();
		call.protect();
		//call.personal(); //Private cannot be accessible
		 

	}

}
