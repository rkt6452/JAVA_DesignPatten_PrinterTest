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
		StringBuffer buf = new StringBuffer();//stringbuffer�� ���ڿ��� ���������� ��� ����
		
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
