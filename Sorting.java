import java.util.*;
class Sorting
{
	public static void main(String r[])
	{
		
	int a[]={2,5,1,7};
	int n=a.length;
	int i;
		for( i=0;i<n-1;i++)
		{	
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp;
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			
			}
			
		}

		  System.out.println("Sorted list of integers:");
 
    for (i = 0; i < n; i++) 
      System.out.println(a[i]);
	}
}
