package Pack_selenium;

public class AccessMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessMethod a= new AccessMethod();
		String mtdString= a.PrintData();
		System.out.println(mtdString);
		AccessMethod2 a2 =new AccessMethod2();
		a2.PrintGetData();
		PrintStaticData();
	}
	
	public String PrintData() {
		System.out.println("this is is Printdata method");
		return "Im mayurathan";
	}
	
	public static String PrintStaticData() {
		System.out.println("this is is PrintStaticData method");
		return "Im mayurathan";
	}

}
