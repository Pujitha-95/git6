import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]= {10,20, 30, 50,70};
		ArrayList<Integer> list= new ArrayList<Integer>();

		
		
		//int loc =3;
		int length=ar.length;
	
		
		for(int i=0;i<length;i++)
		{
			list.add(ar[i]);
		}
		
		
for(int i: list)
			
			System.out.println(i);
	
		
		list.add(3, 40);
for(int i: list)
			
			System.out.println(i);


}


}
