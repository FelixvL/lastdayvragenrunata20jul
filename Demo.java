class Demo {  // ID
	public static void main(String... args){
		Fiets fiets = new Fiets();
		fiets.fietsen();
		System.out.println("einde");
	}	
}
class Fiets{
	int a = 35;
	void fietsen(){
		int a = 25;
		System.out.println(a);
	}
}
abstract class Mountainbike extends Fiets{
	int a = 37;
	abstract void fietsen();
}


















