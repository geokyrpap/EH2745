public class Manager extends Employee {
// Create a constructor for the class with an additional field officeNumber
	String OfficeN;
	Manager(String name, double BasePay,int Whours, String OfficeN)
	{
		super(name,BasePay,Whours);
		this.OfficeN=OfficeN;
	}	
	public void Office() 
	{
		System.out.printf("Manager %s is in  Offie %s. \n", super.name, OfficeN);
	}
}