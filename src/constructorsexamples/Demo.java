package constructorsexamples;

public class Demo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployee(12, "jhon", 50000);
		emp.showEmployee(); 
		
		Employee emp1 = new Employee();
		emp1.setEmployee(34, "mike", 90000);
		emp1.showEmployee();

	}

}
