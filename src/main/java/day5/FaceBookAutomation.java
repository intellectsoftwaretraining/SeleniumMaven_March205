package day5;

public class FaceBookAutomation {

	
	
	public String name ;
	
	public String getFullName() 
	{
		String firstname = "Bala";
		String lastName  = "Thavamani";
		
		String fullname = firstname + lastName;
		return fullname;
		
	}
	
	public void getCustomer() 
	{
		System.out.println("My Custmer name is " + name);
	}
	
	public void getProduct() 
	{
		System.out.println("My Product name is " + name);
	}
	
	public static void main(String[] args) {
		
		FaceBookAutomation obj = new FaceBookAutomation();
		obj.name = obj.getFullName();
		obj.getCustomer();
		obj.getProduct();
	}
}
