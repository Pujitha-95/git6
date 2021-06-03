
public class AscendingOrderSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]= { 10, 4, 6, 20,54, 2,30,12};
		int temp=0;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					
					ar[j]=temp;
				}
			}
			
			System.out.println(ar[i]);
		}
		
	}

}
