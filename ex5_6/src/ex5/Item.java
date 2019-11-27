package ex5;

public class Item {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public Item(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
