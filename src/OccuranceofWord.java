import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Big Big Bull Big Bull Big Bull";
		
		String s1[] = s.split(" ");
		HashMap<String, Integer> hmap = new  HashMap<String, Integer>();
		
		for(String i : s1)
		{
		if(hmap.containsKey(i))
			{
				hmap.put(i, hmap.get(i)+1);
			}
		else hmap.put(i, 1);
		}
		
		Set<Entry<String, Integer>> s2 = hmap.entrySet();
		Iterator<Entry<String, Integer>> it = s2.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String, Integer> entry1		=	(Map.Entry<String, Integer>)it.next();
			System.out.println(entry1.getKey()+ "  " +entry1.getValue());
		}
		
		for(Entry<String, Integer> entry :hmap.entrySet())
		{
			System.out.println(entry.getKey()+ "  " +entry.getValue());
		}
		
		
		
	}

}
