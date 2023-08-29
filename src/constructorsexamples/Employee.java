package constructorsexamples;

public class Employee {

		private int empId;
		private String empName;
		private int empSal; 

		public void setEmployee(int id, String name, int sal) {
			empId = id;
			empName = name;
			empSal = sal;

		}

		public void showEmployee() {
			System.out.println("Employee Information is : ");
			System.out.println(empId);
			System.out.println(empName);
			System.out.println(empSal);
		}

	}
