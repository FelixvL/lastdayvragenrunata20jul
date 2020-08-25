class Demo {  // GG
	public static void main(String... args){
		int a = 15;
		int[] go = new int[a];
		try{
			System.out.println(go[a]);
			throw new MijnFout();
		}catch(Exception e){
			System.out.println("not 20 min");
		}catch(MijnFout e){
			System.out.println("klaar");
		}
		System.out.println("nog klaarder");
	}	
}

class MijnFout extends Exception{
}



















