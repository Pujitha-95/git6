
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=121;
		int rev=0;
		int actualnumber=n;
		
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		
		System.out.println(rev);
		
		if(actualnumber==rev)
		{
			System.out.println("It is palindrome");
			
		}
		else 

			System.out.println("It is not palindrome");
		
	}

}
