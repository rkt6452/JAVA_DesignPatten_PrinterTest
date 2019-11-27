package ex5;

public class main {

	public static void main(String[] args) {
		Item item1 = new Item("cake");
		Item item2 = new Item("cake");
		Item item3 = new Item("cake");
		
		Sale sale = new Sale();
		sale.addItem(item1);
		sale.addItem(item2);
		sale.addItem(item3);
		
		
	}

}
