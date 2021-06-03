import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";

		char[] c = s.toCharArray();

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (char i : c)

		{
			if (hmap.containsKey(i)) {
				hmap.put(i, hmap.get(i) + 1);
			}

			else
				hmap.put(i, 1);
		}

		System.out.println(hmap);

		for (Entry<Character, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		
		Iterator<Entry<Character, Integer>> it =hmap.entrySet().iterator();
		
		while(it.hasNext())
		{
			
			Map.Entry<Character,Integer>	entry= (Map.Entry<Character,Integer>) it.next();
			
			System.out.println(entry.getKey()+ "  " +entry.getValue()); 
			
	/*	Iterator<Entry<Character, Integer>> it1 =hmap.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Map.Entry<Character,Integer>	entry1= (Map.Entry<Character,Integer>) it1.next();
			
			System.out.println(entry1.getKey()+ "  " +entry1.getValue()); */

	}

}
}
