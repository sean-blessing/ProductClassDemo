
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product application!");
		// Create an instance of Product using the empty / default constructor
		Product product1 = new Product();
		product1.setCode("java");
		product1.setDescription("Murach's Java Programming");
		product1.setPrice(57.50);
		
		// Create an instance of Product using the constructor accepting parameters
		Product product2 = new Product("mysql", "Murach's MySQL", 54.50);
		
		System.out.println("Products info:");
		System.out.println(product1.getCode()+", "+product1.getDescription()
				+", "+product1.getPrice()+", "+product1.getPriceFormatted()+
				", "+product1.objectCount);
		System.out.println(product2.getCode()+", "+product2.getDescription()
		+", "+product2.getPriceFormatted()+", "+product2.objectCount);

		System.out.println("Bye!");
	}

}
