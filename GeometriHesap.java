/*
 * Ad Soyad: MEHMET ALİ KIRAÇÇAKALI
 * Ogrenci No: 250541069
 * Tarih: 07.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;
public class algo {
    static double pi = 3.14;
    static Scanner input = new Scanner(System.in);
    //kare
    public static double kareninAlaniniHesapla(double side){
        return side*side;
    }
    public static double karecevre(double kenar){
        return 4*kenar;
    }
    //dikdörtgen
    public static double dikdörtgenCevre(double shortside ,Double longside ){
        return 2*shortside+longside*2;

    }
    public static double dikdötgenAlan(double kısakenar , Double uzunukenar){
        return kısakenar*uzunukenar;
    }
    //DAİRE
    public static double daireCevreHesap(double yarıcap){
        return 2*pi*yarıcap;
    }
    public static double DaireAlanHesap(double yarcap){
        return Math.PI*yarcap*yarcap;
    }
    //ÜÇGEN
    public static double ücgenÇevre(double kenar1,double kenar2,double kenar3){
        return kenar1+kenar2+kenar3;
    }
    public static double üçgenAlan(double taban,double yükseklik){
        return taban*yükseklik/2;
    }


    public static void main(String[] args) {
        //kare
        System.out.println("==================KARE===============");
        System.out.printf("Sayı giriniz: ");
        double karekenar =input.nextDouble();
        double karealan = kareninAlaniniHesapla(karekenar);
        double karecevre = karecevre(karekenar);
        System.out.printf("kare alanı: %.3f" ,karealan);
        System.out.println("\nkare çevre: "+karecevre);
        System.out.println("================DİKDÖRTGEN===============");
        //dikdörtgen
        System.out.print("kısa kenarı giriniz: ");
        double kısakenar = input.nextDouble();
        System.out.print("Uzun kenarı giriniz: ");
        double uzunkenar = input.nextDouble();
        System.out.println("dikdörtgen alan: "+dikdötgenAlan(kısakenar, uzunkenar));
        System.out.println("Dikdötgen çevre: "+dikdörtgenCevre(uzunkenar, kısakenar));
        //DAİRE
        System.out.println("================DAİRE======================");
        System.out.print("Yarı çap giriniz: ");
        double ycap= input.nextDouble();
        System.out.printf("Dairenin Alanı: %.3f",DaireAlanHesap(ycap));
        System.out.printf("\nDaire Çevre: %.3f",daireCevreHesap(ycap));
        //üÇGEN
        System.out.println("\n==================ÜÇGEN====================");
        System.out.print("Yükseklik giriniz: ");
        double yükseklik = input.nextDouble();
        System.out.print("Taban'ı Girinizz: ");
        double taban = input.nextDouble();
        System.out.print("1. Kenar'ı giriniz: ");
        double kenar1 = input.nextDouble();
        System.out.print("2. Kenar'ı giriniz: ");
        double kenar2 = input.nextDouble();
        System.out.print("3. Kenar'ı giriniz: ");
        double kenar3 = input.nextDouble();
        System.out.print("Üçgenin çevresi: "+ücgenÇevre(kenar1, kenar2, kenar3));
        System.out.print("\nÜçgen Alan: "+üçgenAlan(taban, yükseklik));


        input.close();
    }
    
}

