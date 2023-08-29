package anarghyacomm;

public class logical {

	public static void main(String[] args) {
		int a=99, b=35;
		
		System.out.println((a>b) && (a<b));
		System.out.println((a>b) && (a>b));
		
		System.out.println((a>b) || (a<b));
		System.out.println((a<b) || (a<b));
		System.out.println((a<b) || (a>b));
		
		System.out.println(!(a==b));
		System.out.println(!(a<b));
		

	}

}
