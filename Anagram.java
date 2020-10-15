import java.util.*;
public class Anagram
{

	public static void main(String args[])
	{
	String x="cat";
	String Y="mat";
	char x1[]=x.toCharArray();
	char Y1[]=Y.toCharArray();
	Arrays.sort(x1);
	Arrays.sort(Y1);
	boolean result=Arrays.equals(x1,Y1);
	if(result==true)
	{
	System.out.println(" anagaram");
	System.exit(0);
	}
	else
	{
	System.out.println("Not anagaram");
	System.exit(0);
	}

	}
}
