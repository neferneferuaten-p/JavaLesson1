package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main ba�lang�� noktas� oldu�unu g�steriyor
		System.out.println("Hello World");
		//Sat�r sonlar�na ; konmal�d�r
		//System.out.println ��kt� almaya yarar
		String internetSubeButonu = "�nternet �ubesi";
		//Metinsel veri tipleri �ift t�rnakla girilir
		//camelCase
		System.out.println(internetSubeButonu);
		System.out.println("�nternet �ubesi");
		System.out.println("�nternet �ubesi");
		System.out.println("�nternet �ubesi");
		
	
		//!!!!!!!!!Don't repeat your self!!!!!!!!!!
		
		int dolarDun= 11;
		//integer sadece tam say� tutabilir
		double dolarBugun = 11;
		//double ondal�kl� say�lar� tutar
		//boolean mant�ksal durular� t�td��umuz bir veri tipidir, de�eri true veya false
		// boolean dustuMu = true;
		
		if(dolarDun > dolarBugun) {
			System.out.println("A�a�� ok");
		}
		else if (dolarDun == dolarBugun) {
			System.out.println("d�z �izgi");
		}
		else {
			System.out.println("Yukar� ok");
		}
		
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Konut kredisi";
		String kredi3 = "Ara� kredisi";
		String kredi4 = "�ift�i kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		
		//Yukarda g�sterilen listeleme �ekli yeni �r�n eklemek �r�n ismini de�i�tirmek liseteyi de�itirmek i�in kullan��s�z bir yaz�m bi�imidir
		
		String[] krediler = {"H�zl� kredi","Konut kredisi","Ara� kredisi","�ift�i kredisi"};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
			//Listeyi ekrana yazd�rmak i�in foreach d�ng�s�n� kulland�k, bunu kullanmam�z listeyi g�ncellememizi kolayla�t�r�r
			
		}
		
		for (int i = 0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
			//0.eleman "H�zl� kredi"
			//1.eleman "Konut kredisi"
			//2.eleman "Ara� kredisi"
			//3.eleman  "�ift�i kredisi"
			
		}
		
		int sayi4 = 10;
		int sayi5 = 20;
		sayi4 = sayi5;
		sayi5 = 1212;
		System.out.println(sayi4);
		//de�er atamas� yap�lar ve ba�lant� kopar
		// int boolean double  de�er tiptir
		// string referans tip olsa bile de�er tip gibi �al���r
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {12,13,14,15};
		sayilar1 = sayilar2;
		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);
				
		//Arrayler, diziler, classlar, abstract classlar, diziler referans tiptir
		
	}

}
