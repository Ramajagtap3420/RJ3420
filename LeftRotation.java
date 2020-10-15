import java.util.*;
public class LeftRotation
{
	public static void main(String args[])
	{
	int a[]={1,2,3,4};
	int n=a.length;
	int d=1;
	LeftRotate(a,d,n);
	for(int i=0;i<n;i++)
		{
		System.out.print(a[i]);
		}
	}
	static void LeftRotate(int a[],int d,int n)
	{
	for(int i=0;i<d;i++)
	Left(a,n);
	}
	
	static void Left(int a[],int n)
	{
	int i;
	int temp=a[0];
		for(i=0;i<n-1;i++)
		
		a[i]=a[i+1];
		a[i]=temp;
		
	}
}
