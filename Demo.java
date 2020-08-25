class Demo { // HA
	int a = fietsen();
	static int b = new Koe().melken();
	public static void main(String... args) {
		System.out.println("melk");
		System.out.println(new Demo().a);
	}	
	int fietsen(){
		System.out.println("gaan");
		return 7;
	}
}
class Koe{
	static int melken(){
		System.out.println("gaos");
		return 14;
	}
}

















