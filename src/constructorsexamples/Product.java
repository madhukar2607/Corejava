package constructorsexamples;

public class Product {
	private String productname;
	private String productcompany;
	private int productprice; 

	public void setProduct(String name, String company, int price) {
		productname = name;
		productcompany = company;
		productprice = price;

	}

	public void showProduct() {
		System.out.println("Product Information is : ");
		System.out.println("name:" +productname);
		System.out.println("company:" +productcompany);
		System.out.println("price:" +productprice);
	}
}
