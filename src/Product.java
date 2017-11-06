import java.text.NumberFormat;

/*
 * A basic Product Java Bean.  This is based on the Product object
 * from the Murach book.
 */
public class Product {
	private String code;
	private String description;
	private double price;
	public static int objectCount = 0 ;
	
	public Product() {
		this.code = "";
		this.description = "";
		this.price = 0.0;
		objectCount++;
	}
	
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
		objectCount++;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getPriceFormatted() {
		NumberFormat c = NumberFormat.getCurrencyInstance();
		return c.format(price);
	}
	
}
