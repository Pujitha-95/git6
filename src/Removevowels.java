
public class Removevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Pujitha";
		s=s.replaceAll("[AEIOUaeiou]","");
		
		System.out.println(s);
		
		String s1="Poojitha";
		s1=s1.replaceAll("[^AEIOUaeiou]", "");
		System.out.println(s1);
	}

}
