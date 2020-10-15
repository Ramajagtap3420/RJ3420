import java.util.*;
class Panagram
{
	public static void main(String args[])
	{
	String x="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
	x=x.replace(" ","");
	char y[]=x.toCharArray();
	int size=y.length;
	int i=0;
	int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	while(i!=size)
			{
			int index=y[i]-65;
			a[index]=1;
			i++;
			}

		i=0;
		while(i!=26)
			{
			if(a[i]==1)
			{
				i++;
			}
			else
			{
			System.out.println("not a pangram");
				System.exit(0);
			}
		}

		System.out.println(" a pangram");
	}
}
//a to z leeter  are present in string
//t ascii value 84 and a is 65 so 84-65=19;
