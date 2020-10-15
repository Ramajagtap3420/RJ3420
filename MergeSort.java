import java.util.*;
class MergeSort
{
	public static void main(String args[])
	{
	int a[]={1,4,5,7};
	int b[]={2,3,6};
	int n1=a.length;
	int n2=b.length;
	int res[]=new int[n1+n2];
	int i=0;
	int j=0;
	int k=0;
		while(i<n1 && j<n2)
		{
			if(a[i]<b[j])
			
			res[k++]=a[i++];
			
			else
			
			res[k++]=b[j++];
		}
		while(i<n1)
		res[k++]=a[i++];
		while(i<n2)
		res[k++]=b[j++];

		for(int w=0;w<n1+n1;w++)
		{
		System.out.println(res[w]+" ");
		}
	}
}
