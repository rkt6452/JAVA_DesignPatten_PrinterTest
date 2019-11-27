package ex5;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<Item> items = new ArrayList<Item>();
	Printer printer;
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void PrintReceipt() {
		StringBuffer buf = new StringBuffer();//stringbuffer는 문자열을 가변적으로 담는 구조
		
		for(Item item:items) {
			buf.append(item.getName());
			buf.append(item.getPrice());
		}
		printer.print(buf.toString());
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}
