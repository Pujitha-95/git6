
public class Arraydeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]= { 1,2,3, 4, 5};
		
	int loc=2;
	int length= ar.length;
	
for(int i=loc;i<length-1;i++)
{
	ar[i]=ar[i+1];
	
	
	
}
System.out.println("elements after deleting");

for(int i=0;i<length-1;i++)
{
	System.out.println(ar[i]);
}

	
	
	}

}
