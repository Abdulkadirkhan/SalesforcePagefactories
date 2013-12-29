package Test;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String sspath = "C:\\Abdul kadir khan1\\Selenium Architecture\\WorkSpace\\MavenSaleForcePageFactories\\screenshots\\2013_25_12_2_12_14.jpeg";

	String concatenated_String=sspath;

	 String split_string_array[]=concatenated_String.split(":");
	
		    	  System.out.println(split_string_array[1]);
		}

	}



