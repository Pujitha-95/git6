
public class VowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="Pujitha Gundapaneni";
		s=s.toLowerCase();
		
		int len= s.length();
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				
				vowelCount++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				consonantCount++;
			}
			
			
				
		}
		System.out.println("vowels count are" +vowelCount);
		System.out.println("Consonant count are" +consonantCount);
	}

}
