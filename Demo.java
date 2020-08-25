class Demo {  // CD
	public static void main(String... args) {
		Fruit f = new Fruit();
		System.out.println("einde");
	}	
}
class Fruit{
	void groeien(){
		System.out.println("ik groei");
		throw new RuntimeException();
	}
}


















