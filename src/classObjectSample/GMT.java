package classObjectSample;

//import java.io.*;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class GMT {

	public static void main(String[] args)
	{
		 Date localTime = new Date();
		 System.out.println("local Time:" + localTime);
		 
		 
		 
		 DateFormat s = new SimpleDateFormat("dd/MM/yyyy"+" "+"HH:MM:SS");
			// DateFormat s = new SimpleDateFormat();
			 s.setTimeZone(TimeZone.getTimeZone("GMT"));
			 System.out.println("Time IN Gmt : " + s.format(localTime));
                  

	}

}
