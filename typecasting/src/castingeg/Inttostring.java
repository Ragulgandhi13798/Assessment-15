package castingeg;

public class Inttostring {

	

	public static void main(String[] args) {
		
	String s = "4985";
	int i = Integer.parseInt(s);
	System.out.println(i);
	
	
	//using value of
	String s1 = "4985";
	int i1 = Integer.valueOf(s1);
	System.out.println(i1);

	
	//concate
	int i5 = 345;
	String S2 = String.valueOf(i5);
	System.out.println(i5+100);
	System.out.println(S2+100);
	
	//String to long
	
	String S0 = "12132443";
	long l = Long.valueOf(S0);
	System.out.println(l);
	
	//String to float 
	
	String S = "3536563.98";
	float f = Float.parseFloat(S);
	System.out.println(f);
	
	
	
	//double to string
	
	double d  = 65.657;
	String ss = String.valueOf(d);
	
	System.out.println(ss);
	
	
	
	
	
	
	
	
	}

}
