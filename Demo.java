class Demo {  // JE
	public static void main(String... args){
		Raam raam = new Raam();
		Raam.kijken();
	
	}	
}
class Raam implements Doorzichtig{

}
interface Doorzichtig{
	static void kijken(){
		System.out.println("Het is doorzichtig");
	}
}


















