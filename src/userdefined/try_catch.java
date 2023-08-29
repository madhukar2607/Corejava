package userdefined;

		public class try_catch {

			public static void main(String[] args) {
				
				try {
					int[]a= {10,20,30,60};
					System.out.println(a[0]);
					System.out.println(a[1]);
					System.out.println(a[2]);
					System.out.println(a[3]);
					System.out.println(a[4]);
					
					}catch (Exception e){
						System.out.println("it is out of bound");
						throw e;
					}

			}
	}

