import java.util.*;
public class Palidrom
{
	public static void main(String ars[])
	{
	String x="abao";
	int size=x.length();
	String rev=" ";
	for(int i=size-1;i>=0;i--)
		
		rev=rev+x.charAt(i);
		
		if(x.equals(rev))
		
		
		System.out.println("Is not palidrom");
		
		else
		
		System.out.println("Is palidrom");
		
		}
	
}
