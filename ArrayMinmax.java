import java.util.*;
public class ArrayMinmax
{
	public static void main(String rags[])
	{
	int a[]={10,20,30,40};
	for(int i=0;i<a.length;i++)
		{
		if(a[i]>a[i+1])
			{
			System.out.println(a[i]);
			}else
			{
			System.out.println(a[i+1]);
			}
		}
	}
	
}
