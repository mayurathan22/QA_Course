package Pack_selenium;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v= {2,5,6,5,8,15,11,256};
		//find even number in the array
		
		
		for(int i=0; i<v.length;i++) {
			if(v[i] %2==0 ) {
				System.out.println(v[i]);
			}
			else
			{
				System.out.println("this is not even number ");
			}
		}
		

	}

}
