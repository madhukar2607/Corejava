package userdefined;

public class customexception {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			
		throw	new ArithmeticException("we are not able to divided any number with 0");	
		}

	}

	}
