package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 15, sayi2 = 45, sayi3 = 6;
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("En büyük sayı: " + sayi1 + " dir.");
		}
		else if(sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("En büyük sayı: " + sayi2 + " dir.");
		}
		else {
			System.out.println("En büyük sayı: " + sayi3 + " dir.");
		}
	}
	
	/*
	 *int sayi1 = 24, sayi2 = 25, sayi3 =2;
	 *int enBuyuk = sayi1;
	 *
	 *if(enBuyuk < sayi2){
	 *	enBuyuk = sayi2;
	 *}
	 *
	 *if(enBuyuk < sayi3){
	 *	enBuyuk = sayi3;
	 *}
	 *System.out.println("En büyük: " + enBuyuk);
	*/

}
