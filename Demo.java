class Demo { // HR
	public static void main(String... args) {
		System.out.println("regen");
		Dier koe = new Koe();
		Boot dier = (Boot)koe;
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
class Boot{
}
















