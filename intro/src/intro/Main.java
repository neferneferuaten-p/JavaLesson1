package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main baþlangýç noktasý olduðunu gösteriyor
		System.out.println("Hello World");
		//Satýr sonlarýna ; konmalýdýr
		//System.out.println çýktý almaya yarar
		String internetSubeButonu = "Ýnternet Þubesi";
		//Metinsel veri tipleri çift týrnakla girilir
		//camelCase
		System.out.println(internetSubeButonu);
		System.out.println("Ýnternet Þubesi");
		System.out.println("Ýnternet Þubesi");
		System.out.println("Ýnternet Þubesi");
		
	
		//!!!!!!!!!Don't repeat your self!!!!!!!!!!
		
		int dolarDun= 11;
		//integer sadece tam sayý tutabilir
		double dolarBugun = 11;
		//double ondalýklý sayýlarý tutar
		//boolean mantýksal durularý týtdýðumuz bir veri tipidir, deðeri true veya false
		// boolean dustuMu = true;
		
		if(dolarDun > dolarBugun) {
			System.out.println("Aþaðý ok");
		}
		else if (dolarDun == dolarBugun) {
			System.out.println("düz çizgi");
		}
		else {
			System.out.println("Yukarý ok");
		}
		
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Konut kredisi";
		String kredi3 = "Araç kredisi";
		String kredi4 = "Çiftçi kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		
		//Yukarda gösterilen listeleme þekli yeni ürün eklemek ürün ismini deðiþtirmek liseteyi deðitirmek için kullanýþsýz bir yazým biçimidir
		
		String[] krediler = {"Hýzlý kredi","Konut kredisi","Araç kredisi","Çiftçi kredisi"};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
			//Listeyi ekrana yazdýrmak için foreach döngüsünü kullandýk, bunu kullanmamýz listeyi güncellememizi kolaylaþtýrýr
			
		}
		
		for (int i = 0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
			//0.eleman "Hýzlý kredi"
			//1.eleman "Konut kredisi"
			//2.eleman "Araç kredisi"
			//3.eleman  "Çiftçi kredisi"
			
		}
		
		int sayi4 = 10;
		int sayi5 = 20;
		sayi4 = sayi5;
		sayi5 = 1212;
		System.out.println(sayi4);
		//deðer atamasý yapýlar ve baðlantý kopar
		// int boolean double  deðer tiptir
		// string referans tip olsa bile deðer tip gibi çalýþýr
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {12,13,14,15};
		sayilar1 = sayilar2;
		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);
				
		//Arrayler, diziler, classlar, abstract classlar, diziler referans tiptir
		
	}

}
