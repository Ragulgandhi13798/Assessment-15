package castingeg;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Typecastingdate {

	public static void main(String[] args)
	{
		
		String date = "04/03/1998";
		 Date d = null;
		try
		{
			 d = new SimpleDateFormat ("dd/mm/yyyy").parse(date);
			
		} 
		catch (ParseException e) 
		{
		
			e.printStackTrace();
		}
	  System.out.println(d);
	}

}
