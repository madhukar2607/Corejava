package constructorsexamples;

public class Demodoctor {

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.setdoctor(5321,"Yashoda","Senthil","cardiology",75000);
		doc.showdoctor();
      
		Doctor doc1 = new Doctor();
		doc1.setdoctor(5643,"apollo","Guna","Dermatology",82000);
		doc1.showdoctor();

	}

}
