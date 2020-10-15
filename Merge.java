import java.util.*;
 class Reverse
{
	public static void main(String args[])
	{
	int a[]={1,2,3,4,5};
	int n=a.length;
	int b[]=new int[n];
	int i=0;
		while(i!=n)
		{
		b[n-1-i]=a[i];
		i++;
		}
		System.out.println(b);
	}
}
