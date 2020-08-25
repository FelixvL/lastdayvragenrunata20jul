class Demo {  // BW
	public static void main(String... args) {
		JJJ j = new BBB();
		AAA a = (AAA)j;
		
	}	
}

class AAA implements III{  			
	public void lopen(){

	}
}

class BBB extends AAA implements JJJ{	 	
	public void fietsen(){

	}
}

interface III{  
	void lopen();
}

interface JJJ{
	void fietsen();
}

















