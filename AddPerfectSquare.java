import java.util.*;
public class AddPerfectSquare
{
	public static int Sumofperfect(int num)
	{
		if(Math.sqrt(num)==Math.floor(Math.sqrt(num)))
		return num;
		else
		return 0;
	}

	public static void main(String args[])
	{
	int a[]={1,2,4,9};
	int sum=0;
	int n=a.length;
		for(int i=0;i<n;i++)
		{
		sum=sum+Sumofperfect(a[i]);
		}
	System.out.println(sum);		
	
	}
}
