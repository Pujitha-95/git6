import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]= {10,20,10,5,2, 54,4,20};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		
		
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
