class Demo { // HK
	public static void main(String... args) {
		System.out.println("terras");
		Koe koe = new Koe();
		Dier dier = (Koe)koe;
		dier.melken();
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
















