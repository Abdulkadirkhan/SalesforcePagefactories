package Test;

import java.util.Date;

public class StartTimeEndTime {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		//code
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		Date now = new Date();
		Date startTime1 = now;
		
		System.out.println(startTime1);

	}

}


