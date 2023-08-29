package constructorsexamples;

public class Doctor {
	private int docId;
	private String dochos;
	private String docName;
	private String docSpl;
	private int docsal;


	public void setdoctor(int id,String hos, String name, String spl,int sal) {
		docId = id;
		dochos = hos;
		docName = name;
		docSpl = spl;
		docsal = sal;

	}

	public void showdoctor() {
		System.out.println("Doctor Information is : ");
		System.out.println("Id:"+docId);
		System.out.println("hospital:"+dochos);
		System.out.println("Name:"+docName);
		System.out.println("specialization:"+docSpl);
		System.out.println("salary:"+docsal);
	}
}
