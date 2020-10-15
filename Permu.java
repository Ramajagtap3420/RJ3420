import java.util.*;
class Permu
{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
		{

		String str1=sc.next();
		char a[]=str1.toCharArray();
		Arrays.sort(a);
		String str=String.valueOf(a);
		permutation(" ",str);

		}
	}

	static void permutation(String prefix,String str)

	{
	int n=str.length();
	if(n==0)
	{
	System.out.println(prefix+" ");
	}
	else

	{
	for(int i=0;i<n;i++)
		{
		permutation(prefix+str.charAt(i),substring(0,i)+str.substring(i+1,n));
		}
	}
	
	}
}
