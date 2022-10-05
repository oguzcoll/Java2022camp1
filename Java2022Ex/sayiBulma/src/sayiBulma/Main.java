package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = {1,2,3,4,5};
		int aranacak = 9;
		boolean varMı = false;
		
		for (int sayi: sayilar) {
			if (sayi == aranacak) {
				varMı = true;
			}
		}
		
		if(varMı) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
