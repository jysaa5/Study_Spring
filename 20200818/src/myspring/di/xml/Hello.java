package myspring.di.xml;

public class Hello {
	private String name;
	private Printer printer;
	
	//setter 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	//setter 메서드
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "Hello "+name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
	
	
}
