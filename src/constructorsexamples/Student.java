package constructorsexamples;

public class Student {
    private int studentid;
    private String studentname;
    private int studentmarks;
    
     public void setStudent(int id,String name,int marks) {
    	 studentid = id;
    	 studentname = name;
    	 studentmarks = marks;
     }
    public void showStudent() {
    	System.out.println("student information is");
    	System.out.println("id :"+studentid);
    	System.out.println("name :"+studentname);
    	System.out.println("marks :"+studentmarks);
    }
}
