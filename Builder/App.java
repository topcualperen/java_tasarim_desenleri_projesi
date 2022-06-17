//Builder ve Bridge tasar�m kal�plar�n� kullanmaya �al��t�k.

package Builder;

import java.util.Scanner;

public class App { //main
	
    public static void main(String[] args) {
    	
    	int sayi;
    	boolean islem=false;
        
        try {

        Scanner giris = new Scanner(System.in);
        System.out.println("Yeni kay�t m� yap�yorsun?(true/false)");
        islem = giris.nextBoolean();
        
        Lesson lesson = new Lesson.Builder()
        		.id(1)
        		.name("Tasar�m Desenleri - Yeni gelenler i�in indirimli(%75) fiyat :")
        		.name2("Tasar�m Desenleri - Eski ��renciler i�in fiyat: ")
        		.isNewStudent(islem)
        		.price(99.99)
        		.build();
        
       Ali ali = new Ali();
       Fatma fatma = new Fatma();
       
            if(islem == true) {
            	String result = String.format("%s %f", lesson.getName(), lesson.getDiscountedPrice());
            	
            	System.out.println("1- AL�  \t" + ali.bilgiDuzeyi());
            	System.out.println("2- FATMA\t"+ fatma.bilgiDuzeyi());
            	System.out.println("�stedi�iniz hocay� se�iniz:");
            	sayi = giris.nextInt();
            	switch (sayi) {
            	case 1 : 
            		System.out.print("Se�ilen ��retmen : ");
            		ali.isimGetir();
            		System.out.println(ali.bilgiDuzeyi());
            		System.out.println(result);
            	break;
            	case 2 :
            		System.out.print("Se�ilen ��retmen : ");
            		fatma.isimGetir();
            		System.out.println(fatma.bilgiDuzeyi());
            		System.out.println(result);
            	break;
            	
            	default : 
            		System.out.println("Hatal� giri�.... TEKRAR DENEY�N�Z");
            	break;
            	}
        }
            else if(islem == false) {
            	
            	System.out.println("Eski ��rencimiz oldu�unz i�in iyi ��retmenimizi size ay�r�yoruz.");
            	System.out.print("Se�ilen ��retmen : ");
        		fatma.isimGetir();
        		System.out.println(fatma.bilgiDuzeyi());
        		
            String result = String.format("%s %f", lesson.getName2(), lesson.getPrice());
            System.out.println(result);
            
      } else System.out.println("Hatal� giri�"); // java.util.InputMismatchException
      } catch(Exception e) {
          System.out.println("Hatal� giri�.... TEKRAR DENEY�N�Z");
      }                                          
   }
}