package singleton;

public class singleton {

	private static singleton uniqueInstance; 
	private static int counter;
	private singleton(){}  

	// method to instantiate the class and return an instance of it
	public static singleton getInstance () { 
		if (uniqueInstance == null) {                
			uniqueInstance = new singleton();  
		}
		return uniqueInstance;
	}
	
	public static void incrementCount () { 
		counter++;
	}

	public static int getCount () { 
		System.out.println ("Count " + counter);
		return counter;
	}

}