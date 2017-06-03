package helping;

import java.util.Random;

public class genrator {
	
	
	public static int emailgen(){
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		return randomInt;
		
		
	}
	
	

}
