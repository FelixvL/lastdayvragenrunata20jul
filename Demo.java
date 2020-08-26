class Demo {  // JH
	public static void main(String... args){
		Raam raam = new Raam();
		raam.kijken();
	
	}	
}

class Raam implements Doorzichtig{

}
interface Doorzichtig{
	default void kijken(){
		System.out.println("Kijken in Doorzichtig");
	}	
}


















