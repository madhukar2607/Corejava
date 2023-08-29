package anarghyacomm;

public class maxnumber {

	public static void main(String[] args) {
		 int[] arr = { 546,232,543,789,678,88 };
		    for (int i = 0; i < arr.length; i++) {
		      int max = 0;
		      int num = arr[i];
		      while (num > 0) {
		        int digit = num % 10;
		        max = Math.max(max, digit);
		        num /= 10;

	        }
	        System.out.println("The maximum number is " + max);
		    }		 
	}
}
