package userdefined;

public class userdefined {

	public static void main(String[] args) throws error_message {

		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
		throw	new  error_message("Login page is not avvalible");
		}
		
	}

}
