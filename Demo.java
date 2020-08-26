class Demo {  // JG
	public static void main(String... args){
		Raam raam = new Raam();
		raam.kijken();
	
	}	
}

class Raam implements Doorzichtig{
	void kijken(){
		System.out.println("Kijken in Raam");
	}
}
interface Doorzichtig{
	default void kijken(){
		System.out.println("Kijken in Doorzichtig");
	}	
}


















