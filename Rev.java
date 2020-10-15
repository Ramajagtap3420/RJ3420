import java.util.*;
class Rev
{
	public static void main(String args[])
	{
	String x="aba";
	char y[]=x.toCharArray();
	int size=y.length;
	char a[]=new char[size];
	int i=0;
	while(i!=size)

		{
		a[size-i-1]=y[i];
		i++;
		}
	i=0;
	while(i!=size)

		{
		if(a[i]!=y[i])
		{
			System.out.println("is not pali");
			System.exit(0);
		}

		else		
		{
			i++;
			continue;
		}
		
		}

		System.out.println("is pali");
	}
}
