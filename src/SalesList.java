
public class SalesList 
{
	private int price;
	private String product;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public void display()
	{
		System.out.println("product is:"+product);
		System.out.println("price is"+price);
	}

}
