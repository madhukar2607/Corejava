package anarghyacomm;

public class Demo5 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60}};
		int b[][]= {{70,80,90},{100,110,120}};
		int c[][]=new int[2][3];
		System.out.println("A array");
		for(int i=0 ; i<2 ; i++) {
			for(int j=0;j<3;j++) {
			System.out.print(a[i][j]+"  ");
			}
			
		}
		System.out.println("B array");
		for(int i=0 ; i<2 ; i++) {
			for(int j=0;j<3;j++) {
			System.out.print(b[i][j]+"  ");
			}
			
		}
		
		System.out.println("sum of a and b  is c array  ");
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=(a[i][j]+b[i][j]);
				
			}
		}	
		
		
		System.out.println("C array");
		for(int i=0 ; i<2 ; i++) {
			for(int j=0;j<3;j++) {
			System.out.print(c[i][j]+"  ");
			}

	    }
	}
}

