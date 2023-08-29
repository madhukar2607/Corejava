package anarghyacomm;

public class Demo7 {

	public static void main(String[] args) {
		revc("Madhukarreddy");

	}
	
	public static String revc(String rec) {
		
		String rvc="";
		
		for(int i=rec.length()-1;i>=0;i--) 
		{
			rvc=rvc+rec.charAt(i);
		
		}
		System.out.println(rvc);
		return null;

	}

}
