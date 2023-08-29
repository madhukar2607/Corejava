package constructorsexamples;

public class Demostudent {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudent(5257,"Jhon",567);
		stu.showStudent();
		
		Student stu1 = new Student();
		stu1.setStudent(5258,"Mike",588);
		stu1.showStudent(); 
	}

}
