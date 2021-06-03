import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharactersinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Poojitjha";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
			for(int i=0;i<s.length(); i++)
			{
			 set.add(s.charAt(i));
		
			
		}
			for(char c: set)
			{
				System.out.println(c);
			}
		
		String s1="Pujitha Pujitha Hello Pujitha Kusuma Charitha Navya";
		Set<String> set1 = new LinkedHashSet<String>();
		String s2[]=s1.split(" ");
		
		
		for(int i=0;i<s2.length;i++)
		{
			
		
			set1.add(s2[i]);
		}
		
		for(String s3: set1)
		{
			System.out.println(s3);
		}
		
		
			
			
		
		
	}

	
}
