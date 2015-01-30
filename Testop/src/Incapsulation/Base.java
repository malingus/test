package Incapsulation;

public class Base {
	private String name;
	private int id;

	public void printName() {
		System.out.println("My name " + name + "My id" + id);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base my1 = new Base();
		
		my1.name="Example";
		my1.id=1;
		my1.printName();
		Base my2 = new Base();
		
		my2.name="Ex";
		my2.id=2;
		my2.printName();
	
	}
	

}
