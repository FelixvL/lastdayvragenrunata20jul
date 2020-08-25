class Demo {  // GD
	public static void main(String... args){
		int a = 15;
		System.out.println(args.length);
		int[] go = new int[a];
		System.out.println(go.length);
		try{
			System.out.println(go[a]);
		}finally{
			System.out.println("klaar");
		}
		System.out.println("nog klaarder");
	}	
}



















