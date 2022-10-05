package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6 --> 1+2+3 = 6 
		// 28 ---> 1+2+4+7+14=28
		

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i < number; i++){
			if(number % i ==0) {
				total = total +i;
			}
			
		}
		if(total == number) {
			System.out.println("Mükemmel sayıdır");
		}else
			System.out.println("Mükemmel sayı değildir");

		
		
		

	}

}
