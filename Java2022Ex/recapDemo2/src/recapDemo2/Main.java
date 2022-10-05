package recapDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {8.9,1.3,4.3,5.6 };
		double total = 0;
		double max = myList[3];
		
		for(double number: myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("toplam: " + total);
		System.out.println("En büyük: " + max);
	}
}
