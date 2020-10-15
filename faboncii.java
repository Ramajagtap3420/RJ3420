import java.util.*;
class faboncii
{
	public static void main(String args[])
	{
	int a=0;
	int b=1;
	int sum=0;
	int n=20;
	System.out.print(a+ " ");
	System.out.print(b+ " ");
	for(int i=0;i<n-2;i++)
	{
	int c=a+b;
	System.out.print(c+ " ");
	a=b;
	b=c;
	}

	
	}
}


