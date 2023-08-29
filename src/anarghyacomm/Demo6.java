
public class Demo6 {

	public static void main(String[] args) {
		String str = "this is Madhu";
		String str2 = "this is Reddy";

		char res = str.charAt(9);
		System.out.println(res);

		int a = str.length();
		System.out.println(a);

		String str3 = str.concat(" " + str2);
		System.out.println(str3);

		boolean b = str.contains("Madhu");
		boolean c = str2.contains("Madhu");
		System.out.println(b);
		System.out.println(c);

		boolean d = str.contentEquals(str2);
		System.out.println(d);

		String str4 = str.toUpperCase();
		System.out.println(str4);

	}

}
