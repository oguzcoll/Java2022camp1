package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Ahmet";
		ogrenciler[2] = "Mehmet";
		ogrenciler[3] = "Salih";
		
		for (int i = 0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------------");
		
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
