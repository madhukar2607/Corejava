package anarghyacomm;

public class luckynumber {

	public static void main(String[] args) {
		String birthdate = "19/07/1997";
	    int digitSum = calculateDigitSum(birthdate);
	    System.out.println("The sum of the digits of the sum of your birthdate is my Lucky number: " + digitSum);
	  }

	  public static int calculateDigitSum(String birthdate) {
	    String[] parts = birthdate.split("/");
	   
	    int day = Integer.parseInt(parts[0]);
	    int month = Integer.parseInt(parts[1]);
	    int year = Integer.parseInt(parts[2]);
	    System.out.println(day);
	    System.out.println(month);
	    System.out.println(year);
	    int sum = day + month + year;
	    int digitSum = 0;
	    while (sum > 9) {
	      digitSum += sum % 10;
	      System.out.println(digitSum);
	      sum /= 10;
	    }
	    return digitSum;
	    

	}

}
