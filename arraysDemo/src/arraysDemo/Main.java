package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenci1 = "Şule";
		String ogrenci2 = "Mehmet";
		String ogrenci3 = "Nuray";
		String ogrenci4 = "Hanifi";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Şule";
		ogrenciler[1] = "Mehmet";
		ogrenciler[2] = "Nuray";
		ogrenciler[3] = "Hanifi";
		
		for(int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------------------");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
