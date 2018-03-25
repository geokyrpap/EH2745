public class Employee {
String name; 
double BasePay;
int Whours;
	Employee(String name, double BasePay,int Whours){
		this.name=name;
		this.BasePay=BasePay;
		this.Whours=Whours;
	}
	void salary()
	{// Define method “salary”
	double salary=BasePay*Whours;
	System.out.printf("%s earned %.02f dollars. \n", name, salary);
	}
}