package constructorsexamples;

public class demoproduct {

	public static void main(String[] args) {
		Product Pro = new Product();
		Pro.setProduct("Car","Kia",600000);
		Pro.showProduct();
      
		Product Pro1 = new Product();
		Pro1.setProduct("Mobile","Vivo",25000);
		Pro1.showProduct();
	}
    
}
