import java.util.*;
 class Upper
{

	public static void main(String args[])
	{

	String x="rama jagtap";
	
	char y[]=x.toCharArray();
	int size=y.length;
	
	y[0]=(char)(y[0]-32);
	int i=0;
	
	while(i!=size)
	{
	if(y[i]==' '){
	 y[i+1]=(char)( y[i+1]-32);
	
	}
	i++;
	}
	System.out.println(y);	

	}
}
