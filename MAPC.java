import java.util.*;
public class MAPC
{
	public static void main(String ar[])
	{
	Map<Character,Integer>m=new HashMap<>();
	String x="RAMA";🤩️
	char y[]=x.toCharArray();
	int size=y.length;
	int i=0;
		while(i!=size){
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

			Set<Map.Entry<Character,Integer>>hmap=m.entrySet();
			for(Map.Entry<Character,Integer>data:hmap)🤩️


			{

			System.out.println(data.getKey());
			System.out.println(data.getValue());
			}
	}

	

}
