class Demo {  // JI
	public static void main(String... args){
		Raam raam = new Raam();
		raam.kijken();
	
	}	
}

class Raam implements Doorzichtig{

}
interface Doorzichtig{
	int a;
	default void kijken(){
		System.out.println("Kijken in Doorzichtig");
	}	
}


















