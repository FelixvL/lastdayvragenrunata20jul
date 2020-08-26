class Demo {  // IF
	public static void main(String... args){
		Fiets fiets = new DirtBike();
		fiets.fietsen();
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


















