package myspring.di.xml;

// Printer 인터페이스를 구현.
public class StringPrinter implements Printer {
	
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void print(String message) {		
		buffer.append(message);
	}
	
	public String toString() {
		return buffer.toString();
	}
	
}
