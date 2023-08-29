package Getters;

public class demo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setemployee(12, "jhon", 50000);
		emp.setEmpid(155);
		emp.showemployee(); 
		
		Employee emp1 = new Employee();
		emp1.setemployee(34, "mike", 90000);
		emp1.showemployee();

	}

}
