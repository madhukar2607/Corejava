package userdefined;

public class trycatchfinally {

	public static void main(String[] args) {
		{
			try {
				System.out.println("Madhu");
				System.out.println(10/0);
			}catch(Exception e) 
			{  
				System.out.println("error will catch");
				throw e;
				
			}
			finally {
				System.out.println("finally block will executed");
			}
			System.out.println("rest of code ");

		}
	}
	}

