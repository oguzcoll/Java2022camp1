
public class Gun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello world!");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		// integer 
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustumu = true;
		String okYonu = "";
		
	    if (dolarBugun < dolarDun) {
	    	okYonu = "down.svg";
	    	System.out.println(okYonu);
	    } else if (dolarBugun > dolarDun) {
	    	okYonu = "up.svg";
	    	System.out.println(okYonu);
	    } else {
	    	okYonu = "equal.svg";
	    	System.out.println(okYonu);
	    }
	    	// array 
	    String[] krediler = {"Hızlı kredi", "Maaşını halkbanktan alan", "emeklı"};
	    
	    for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	    	
	    
		

	}

}
