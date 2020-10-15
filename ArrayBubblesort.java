import java.util.*;
class ArrayBubblesort
{
	public static void main(String args[])
	{
	int []a={5,4,3,1,2};
	int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				{
				if(a[i]<a[j])
					{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}		
		}

			for(int i=0;i<n;i++)
			{
			System.out.println(a[i]);

			}
	}
}
