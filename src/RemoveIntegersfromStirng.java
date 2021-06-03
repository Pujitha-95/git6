
public class RemoveIntegersfromStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Puji 123 456 Gundu";
		
		s=s.replaceAll("[ ]", "");
	String	s1= s.replaceAll("[^A-Za-z]", "");
		
		System.out.println(s1);
		
	String	s2 =s.replaceAll("[A-Za-z]", "");
	
	System.out.println(s2);
	
	int a= Integer.parseInt(s2);
	System.out.println(a);
	}

}
