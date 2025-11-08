/*
 * Ad Soyad: MEHMET ALİ KIRAÇÇAKALI
 * Ogrenci No: 250541069
 * Tarih: 08.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */



import java.util.Scanner;
public class SepetHesap {
static Scanner input = new Scanner(System.in);
final static double SHIPPING_FEE = 29.99;
final static double VAT_RATE = 0.18;





    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("=========SEPET TUTAR HESABLAMAYA HOŞGELDİNİZ....=========");
        System.out.println("---------------------------------------------------------");

        //ÜRÜN 1
        System.out.println("Ürün(1): hakkında bilgileri doldurunuz");
        System.out.print("Birim fiyatı: ");
        double birimfiyat = input.nextDouble();
        System.out.print("Adet sayısınıgiriniz (tam sayı zorunlu): ");
        int adet = input.nextInt();
        double ürün1 = adet*birimfiyat;
        double toplam = calculateLineTotal(birimfiyat, adet);
        System.out.println("=============================================================");

        //ÜRÜN 2
        System.out.println("Ürün(2): hakkında bilgileri doldurunuz");
        System.out.print("Birim fiyatı: ");
        double birimfiyat2 = input.nextDouble();
        System.out.print("Adet sayısınıgiriniz (tam sayı zorunlu): ");
        int adet2 = input.nextInt();
        double ürün2 = adet2*birimfiyat2;
        double toplam2 = calculateLineTotal(birimfiyat2, adet2);
        System.out.println("=============================================================");


        //ÜRÜN 3
        System.out.println("Ürün(3): hakkında bilgileri doldurunuz");
        System.out.print("Birim fiyatı: ");
        double birimfiyat3 = input.nextDouble();
        System.out.print("Adet sayısınıgiriniz (tam sayı zorunlu): ");
        int adet3 = input.nextInt();
        double ürün3 = adet3*birimfiyat3;
        double toplam3 = calculateLineTotal(birimfiyat3, adet3);

        //İNDİRİM   
        System.out.print("İndirim yüzdesini giriniz: ");
        double indirim = input.nextDouble();

        

        //İŞLEMLER
        double saftoplam = calculateSubtotal(toplam, toplam2, toplam3);
        double çikarilanpara = calculateDiscountAmount(saftoplam, indirim);
        double indirimlfiyat = applyDiscount(saftoplam, çikarilanpara);
        double kdvtutar = calculateVAT(indirimlfiyat, VAT_RATE);
        double tamfiyat = calculateGrandTotal(kdvtutar,indirimlfiyat,SHIPPING_FEE);
        

        //ÇIKTILAR
        System.out.println("=================================================");
        System.err.println("               SEPET ÖZETİ                       ");
        System.out.println("=================================================");
        System.out.printf("Ürün 1 tutar: (%.2f x %d )  : %.2f TL\n",birimfiyat,adet,ürün1);
        System.out.printf("Ürün 2 tutar: (%.2f x %d )  : %.2f TL\n",birimfiyat2,adet2,ürün2);
        System.out.printf("Ürün 3 tutar: (%.2f x %d )  : %.2f TL\n",birimfiyat3,adet3,ürün3);
        System.out.println("\n-----------------------------------------------");
        System.out.printf(" Ara toplam              : %.2f ",saftoplam);

        System.out.printf("\n İndirim Tutarı (%%%.0f)     : %.2f TL\n",indirim,çikarilanpara );
        System.out.printf(" İndirimli Fiyatı        : %.2f TL\n",indirimlfiyat);

        System.out.printf(" KDV tutarı  (%%%.0f)       : %.2f TL\n ",kdvtutar,kdvtutar);
        System.out.printf("Kargo ücreti            : %.2f TL\n",SHIPPING_FEE);
        System.out.println("\n-----------------------------------------------");
        System.out.printf(" GENEL TOPLAM            : %.2f TL\n ",tamfiyat);
        System.out.println("=================================================");
input.close();
    }
    


        //METODLAR  
    public static double calculateLineTotal(double price, int quantity){
        return price*quantity;
    }
    public static double calculateSubtotal(double line1, double line2,double line3){
        return line1 + line2 + line3;
    }
    public static double calculateDiscountAmount( double saftoplam, double discountPercentage){
        return saftoplam*discountPercentage/100;
    }
    public static double applyDiscount(double saftoplam, double discountAmount){
        return saftoplam-discountAmount;
    }
    public static double calculateVAT( double discountedTotal,double  vatRate){
        return discountedTotal*vatRate;
    }
    public static double calculateGrandTotal(double discountedTotal, double vatAmount,double shippingFee){
        return discountedTotal+vatAmount+shippingFee;
    }
}
