class Demo {  // BI
	public static void main(String... args) {
		
		Kip k = new Kip();
		k.waggelen(6);
		
	}	

}

class Kip{
	void waggelen(){
		System.out.println("waggelen1");
	}
	int waggelen(short t){
		System.out.println("waggelen2");
		return 3;
	}
}


















