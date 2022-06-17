//Builder ve Bridge tasarým kalýplarýný kullanmaya çalýþtýk.

package Builder;

import java.util.Scanner;

public class App { //main
	
    public static void main(String[] args) {
    	
    	int sayi;
    	boolean islem=false;
        
        try {

        Scanner giris = new Scanner(System.in);
        System.out.println("Yeni kayýt mý yapýyorsun?(true/false)");
        islem = giris.nextBoolean();
        
        Lesson lesson = new Lesson.Builder()
        		.id(1)
        		.name("Tasarým Desenleri - Yeni gelenler için indirimli(%75) fiyat :")
        		.name2("Tasarým Desenleri - Eski öðrenciler için fiyat: ")
        		.isNewStudent(islem)
        		.price(99.99)
        		.build();
        
       Ali ali = new Ali();
       Fatma fatma = new Fatma();
       
            if(islem == true) {
            	String result = String.format("%s %f", lesson.getName(), lesson.getDiscountedPrice());
            	
            	System.out.println("1- ALÝ  \t" + ali.bilgiDuzeyi());
            	System.out.println("2- FATMA\t"+ fatma.bilgiDuzeyi());
            	System.out.println("Ýstediðiniz hocayý seçiniz:");
            	sayi = giris.nextInt();
            	switch (sayi) {
            	case 1 : 
            		System.out.print("Seçilen Öðretmen : ");
            		ali.isimGetir();
            		System.out.println(ali.bilgiDuzeyi());
            		System.out.println(result);
            	break;
            	case 2 :
            		System.out.print("Seçilen Öðretmen : ");
            		fatma.isimGetir();
            		System.out.println(fatma.bilgiDuzeyi());
            		System.out.println(result);
            	break;
            	
            	default : 
            		System.out.println("Hatalý giriþ.... TEKRAR DENEYÝNÝZ");
            	break;
            	}
        }
            else if(islem == false) {
            	
            	System.out.println("Eski öðrencimiz olduðunz için iyi öðretmenimizi size ayýrýyoruz.");
            	System.out.print("Seçilen Öðretmen : ");
        		fatma.isimGetir();
        		System.out.println(fatma.bilgiDuzeyi());
        		
            String result = String.format("%s %f", lesson.getName2(), lesson.getPrice());
            System.out.println(result);
            
      } else System.out.println("Hatalý giriþ"); // java.util.InputMismatchException
      } catch(Exception e) {
          System.out.println("Hatalý giriþ.... TEKRAR DENEYÝNÝZ");
      }                                          
   }
}