import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraylisttoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	List<String> al=new ArrayList<String>();
		
		al.add("Pujitha");
		al.add("Charitha");
		al.add("Navya");
		al.add("Satya");
		System.out.println(al);
		Object[] s= al.toArray();
		for(Object i: s)
		{
			System.out.println(i);
		}
		
	}

}
