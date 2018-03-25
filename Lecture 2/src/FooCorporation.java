public class FooCorporation {
public static void main(String[] args) {
Employee John = new Employee("John",7.5,38);
Employee Annabel = new Employee("Annabel",8.2,42);
Employee Graham = new Employee("Graham",10.5,41);
Manager Bill=new Manager("Bill",15.5,39,"A332");
Manager Gregory=new Manager("Gregory",18.2,40,"A415");
John.salary();
Annabel.salary();
Graham.salary();
Bill.salary();
Bill.Office();
Gregory.salary();
Gregory.Office();
}
}

