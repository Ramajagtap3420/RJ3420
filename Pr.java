import java.util.*;
class Pr
{
	public static void main(String args[])
	{
	String x="Rama Jagtap";
	char y[]=x.toCharArray();
	int size=y.length;
	char a[]=new char[size];
	int i=0;
	while(i!=size)
	{
	a[i]=y[i];
	i++;
	}
	System.out.println(y);
	System.out.println(a);
	}
}
