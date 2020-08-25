class Demo {  // CM
	public static void main(String... args) throws Throwable{
		Fruit f = new Fruit();
		try{
			f.groeien();
		catch(Exception e){
			System.out.println("zie je niet");
		}finally{
			System.out.println("zie je nooit");
		}
		System.out.println("einde");
	}	
}
class Fruit{
	void groeien() throws Exception{
		System.out.println("ik groei");
		throw new Error();
	}
}


















