class Demo { // HZ
	public static void main(String... args) {
		System.out.println("pizza");
		Dier d = new Koe();
		System.out.println(d.leeftijd);
		d.ademen();
		
	}	

}
class Koe extends Dier{
	int leeftijd = 23;
	int melken(){
		System.out.println("gaos");
		return 14;
	}
}
class Dier{
	int leeftijd = 25;
	void ademen(){
		System.out.println("ademen"+leeftijd);
	}
}
















