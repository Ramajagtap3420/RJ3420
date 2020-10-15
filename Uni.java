import java.util.*;
public class Uni
{
	public static void main(String arg[])
	{
	Map<Character,Integer>m=new HashMap<>();
	String x="Rahul";
	char y[]=x.toCharArray();
	int size=y.length;
	int i=0;
		while(i!=size)
		{
		if(m.containsKey(y[i])==false)
			{
			m.put(y[i],1);
			}
		else
			{
			int oldval= m.get(y[i]);
			int newval=y[i]+1;
			m.put(y[i],newval);
			}
			i++;
		}

		Set<Map.Entry<Character,Integer>>hmap=m.entrySet();
		for(Map.Entry<Character,Integer>data:hmap)
		{
			if(data.getValue()>1)
				{
				System.out.println("is not uni");
				System.exit(0);
				}	
			else

				{
				System.out.println("is uni");
				System.exit(0);
				}
		}
		
	}
}
