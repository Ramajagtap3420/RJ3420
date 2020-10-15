import java.util.*;
class Countevenodd
{
	public static void main(String args[])
	{
		Map<Integer,Integer>m=new HashMap<>();
		int x[]={1,2,2,3,4,4,4};
		int n=x.length;
		int i=0;
		while(i!=n)
			{
			if(m.containsKey(x[i])==false)
				{
				m.put(x[i],1);
				}
			
			else
				{
				int old=m.get(x[i]);
				int newval=old+1;
				m.put(x[i],newval);
				}
			i++;
			
	}
		Set<Map.Entry<Integer,Integer>>hmap=m.entrySet();
		for(Map.Entry<Integer,Integer>data:hmap)
			
		{
			if(data.getValue()>2)
			{
				System.out.println("Number of odd values");
				System.out.println(data.getKey()+" "+data.getValue());	
					
			}
		}

}
}

