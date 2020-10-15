import java.util.*;
public class WhiteSpace
{

	public static void main(String args[])
	{
	String x="Rama jagtap rahul	hello	is the string 	pgm";	
	x=x.replaceAll("\\s","");
	System.out.println(x);
	}
}
