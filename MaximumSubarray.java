import java.util.*;
class MaximumSubarray
{
	public static void main(String args[])
	{
	int  a[]={-2, -3, 4, -1, -2, 1, 5, -3};
	int n=a.length;
	int max_so_far=a[0];
	int max_ending=0;
	for(int i=0;i<n;i++)
		{
		max_ending=max_ending+a[i];
		 if(max_ending>max_so_far)
			{
			max_so_far=max_ending;
			}
		if(max_ending<0)
			{
			max_ending=0;
			}		
		}
		for(int i=0;i<n;i++){
		System.out.println(max_so_far);
		System.exit(0);
		}
	}
}
