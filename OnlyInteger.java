import java.util.*;
public class OnlyInteger
{
	public static void main(String args[])
	{
	String x="3125";
	char y[]=x.toCharArray();
	int size=y.length;
	int i=0;
	while(i!=size)
		{
			if(y[i]>='0' && y[i]<='9')
			{
				i++;
			}	
			else
			{

			System.out.println("Not integer");
			System.exit(0);
			}
		}

			System.out.println("Numbers is integer");		
	}
}
