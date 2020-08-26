class Demo {  // IH
	public static void main(String... args){
		Mountainbike fiets = new DirtBike();
		fiets.fietsen(25);
		System.out.println("einde");
	}	
}
class Fiets{
	int a = 35;
	long fietsen(){
		int a = 25;
		System.out.println(a);
		return 9;
	}
}
abstract class Mountainbike extends Fiets{
	int a = 37;
	abstract int fietsen(int c);
}
class DirtBike extends Mountainbike{
	int fietsen(int d){
		System.out.println("in db"+d);
		return 7;
	}
}


















