
public class CountCharactersinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Pujitha Gundapaneni";
		
		int len=s.length();
		int count =0;
		
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)!= ' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
