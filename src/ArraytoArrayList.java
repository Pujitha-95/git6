import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ar[]= {"pujitha","charitha", "Navya","satya"};
		
		List<String> s= new ArrayList<String>(Arrays.asList(ar));
		
		s.add("Devi");
		s.remove(1);
		
		
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
	}

}
