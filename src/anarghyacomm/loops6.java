package anarghyacomm;

import java.util.Scanner;

public class loops6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			int revc=0;
			while(num>0) {
				int digt=num%10;
				revc=revc*10+digt;
				num=num/10;
				
			}
			System.out.println(revc);
		}

	}

}
