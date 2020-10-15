import java.util.*;
public class Nonre
{
	public static void main(String args[])
	{
	Map<Character,Integer>m=new HashMap<>();
	String x="RAMA";
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
				int oldval=m.get(y[i]);
				int newval=oldval+1;
				m.put(y[i],newval);
				}
				i++;
		}

			Set<Map.Entry<Character,Integer>>hamp=m.entrySet();
			for(Map.Entry<Character,Integer> data:hamp)
			{
				if(data.getValue()==1)
				{
				System.out.println(data.getKey()+" "+data.getValue());
				}
			
			}
	}
}
