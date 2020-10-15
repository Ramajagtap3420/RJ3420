import java.util.*;
public class Reverseword
{
	public static void main(String args[])
	{
	String s="Rama is my name";
	String a[]=s.split(" ");
	int n=a.length;
	
	for(int i=n-1;i>=0;i--)
	{
	System.out.print(a[i]+" ");
	
	
	}
}
}
