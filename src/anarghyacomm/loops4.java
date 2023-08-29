package anarghyacomm;

public class loops4 {

	public static void main(String[] args) {
		int num=5637;
		int revc=0;
		while(num>0) {
			int digt=num%10;
			revc=revc*10+digt;
			num=num/10;
			
		}
		System.out.println(revc);


	}

}
