package b;


public class main {
	
	public static void main (String[]args)
	{
		Mercedes[] MerCars = initMerCars();

	        for (int i = 0; i < MerCars.length; i++) {
	            System.out.println(MerCars[i]);
	        }
	        Volkswagen[] VolkCars = initVolkCars();

	        for (int i = 0; i < VolkCars.length; i++) {
	            System.out.println(VolkCars[i]);
	        }
	}
	
	 private static Mercedes[] initMerCars() {
		 Mercedes[] carsToReturn = new Mercedes[2];

	        // creating the car objects
		 Mercedes m240 = new Mercedes("240", 1988, "L6 (2,5 à 2,7 L) M 123 ; M 110" + 
		 		"", "5-speed manual", 4);
		 Mercedes MercedesBenz_220
 = new Mercedes("Mercedes-Benz 220" + 
 		"", 1951 , "6 cylindres en ligne" + 
 				"", "BVM 4" + 
 				"", 5);
		 Mercedes m3 = new Mercedes("M3", 1995, "3.0-3.2 L S50/S52 I6", "5-speed manual", 2);

	        // adding them to the cars list
	        carsToReturn[0] = m240;
	        carsToReturn[1] = MercedesBenz_220;
	       

	        return carsToReturn;

	 
	 

	        
	}
	 private static Volkswagen[] initVolkCars() {
		 Volkswagen[] carsToReturn = new Volkswagen[2];

	        // creating the car objects
		 Volkswagen m0 = new Volkswagen("Jetta", 1979, "1.1 50 ch à 1.6 110 ch " + 
		 		"", "5-speed manual_Automatique 3 rapports" + 
		 				"", 4);
		 Volkswagen JettaSagitar
 = new Volkswagen("Jetta / Sagitar" + 
 		"", 2010 , "L4 1.2l Turbo 90ch (Essence)" + 
 				"" + 
 				"" + 
 				"", "Manuelle 6 Rapports" + 
 						"" + 
 				"", 4);

	
		 carsToReturn[0] = m0;
	        carsToReturn[1] = JettaSagitar;
	        
	        return carsToReturn;
	 }
}



