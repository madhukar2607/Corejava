package Getters;

public class Employee {
	 private int empid;
     private String empname;
     private int empsal;
     
     public void setemployee(int empid,String empname,int empsal) {
  	   this.empid=empid;
  	   this.empname=empname;
  	   this.empsal=empsal;
     }
     public void showemployee() {
  	   System.out.println("empid:"+empid+"empname:"+empname+ "empsal:"+empsal);
     }
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	    
}
