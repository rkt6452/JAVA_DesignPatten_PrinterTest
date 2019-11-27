package ex5;

public class PrintTest extends Printer {
	String contents;
	@Override
	public void print(String contents) {
		// TODO Auto-generated method stub
		this.contents = contents;
	}
	public String getContents() {
		return contents;
	}
}
