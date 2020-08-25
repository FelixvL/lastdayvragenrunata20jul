class Demo {  // CF
	public static void main(String... args) {
		Fruit f = new Fruit();
		f.groeien();
		System.out.println("einde");
	}	
}
class Fruit{
	void groeien() throws RuntimeException{
		System.out.println("ik groei");
		throw new RuntimeException();
	}
}


















