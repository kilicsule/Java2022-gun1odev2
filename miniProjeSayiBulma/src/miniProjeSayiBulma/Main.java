package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 2;

		/*for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				System.out.println("Aranan sayı bulundu");
				return;
			}

		}
		System.out.println("Aranan sayı mevcut değil");
		return;
		*/
		
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
