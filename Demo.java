class Demo {  // JB
	public static void main(String... args){
		Raam raam = new Raam();
		raam.kijken();
	}	
}
class Raam implements Doorzichtig{
	static void kijken(){
		System.out.println("Kijken in raam");
	}
}
interface Doorzichtig{
	static void kijken();
}


















