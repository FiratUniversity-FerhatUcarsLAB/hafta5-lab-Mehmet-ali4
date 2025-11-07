/*
 * Ad Soyad: MEHMET ALİ KIRAÇÇAKALI
 * Ogrenci No: 250541069
 * Tarih: 07.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class fizikFormul {
static Scanner input = new Scanner(System.in);
final static double gravity = 9.8;

public static void main(String[] args) {
System.out.println("------FİZİK FORMÜL HESABA HOŞ GELDİNİZ------");
   //HIZ=MESAFE/ZAMAN
    System.out.print("Süreyi giriniz giriniz(saniye cinsinden): ");
    double süre = input.nextDouble();
    System.out.print("Mesafeyi giriniz(metre cinsinden): ");
    double mesafe = input.nextDouble();
    double hiz = calculateVelocity(mesafe,süre);
    System.out.printf("Hızınız: %.2f m/s",hiz );
    //İVME HESAPLAMA
    System.out.println("\n========================================");
    System.out.print("Hız değişimini giriniz(m/s olarak giriniz): ");
    double hizdegisim = input.nextDouble();
    System.out.printf("Süreyi giriniz(saniye olarak): ");
    double time = input.nextDouble();
    double ivme = alculateAcceleration(hizdegisim, time);   
    System.out.printf("İvme: %.2f m/s^2",ivme);
    //KUVVET HESAPLMAMA
    System.out.println("\n========================================");
    System.out.print("Kütleyi Giriniz: ");
    double kütle = input.nextDouble();
    System.out.print("İvmeyi giriniz: ");
    double ivme2 = input.nextDouble();
    double kuvvet = calculateForce(ivme2, kütle);
    System.out.printf("Kuvvet: %.2f Newtondur",kuvvet);
    //İŞ HESAP
    System.out.println("\n========================================");
    System.out.print("Kuvveti giriniz: ");
    double kuvvet2 = input.nextDouble();
    System.out.print("Mesafeyi giriniz: ");
    double süre23 = input.nextDouble();
    double is = calculateWork(kuvvet2, süre23);
    System.out.printf("İş: %.2f W", is);
    //GÜÇ HESAPLAMA
     System.out.println("\n========================================");
    System.out.print("İş'i Giriniz: ");
    double is2 = input.nextDouble();
    System.out.print("Süreyi giriniz: ");
    double time2 = input.nextDouble();
    double güc = calculatePower(is2, time2);
    System.out.printf("Güç: %.2f W",güc);
    //KİNETİK ENERJİ    
     System.out.println("\n========================================");
    System.out.print("Kütleyi giriniz: ");
    double kütle2 = input.nextDouble();
    System.out.print("Hız'ı giriniz: ");
    double hız3= input.nextDouble();
    double kinetikEnerji= calculateKineticEnergy(kütle2, hız3);
    System.out.printf("Kinetik Enerji: %.2f J",kinetikEnerji);
    //POTANSİYEL ENERJİ
    System.out.println("\n========================================");
    System.out.print("Kütleyi giriniz: ");
    double kütle3 = input.nextDouble();
    System.out.print("Yüksekliği giriniz: ");
    double yükseklik =input.nextDouble();
    double potansiyelenerji=calculatePotentialEnergy( gravity ,kütle3, yükseklik);
    System.out.printf("Potansiyel Enerji: %.2f J",potansiyelenerji);
    //MOMENTUM
     System.out.println("\n========================================");
    System.out.print("Kütelyi giriniz: ");
    double kütle4 = input.nextDouble();
    System.out.print("Hız'ınızı Giriniz: ");
    double hız4= input.nextDouble();
    double momentum = calculateMomentum(kütle4, hız4);
    System.out.printf("Momentum: %.2f kg.m/s",momentum);





    input.close();
    }
    

    public static double calculateVelocity(double distance ,double time){
        return  distance/time;
    }
    public static double alculateAcceleration(double velocityChange, double time){
        return velocityChange/time;
    }
    public static double calculateForce(double mass, double acceleration){
        return mass*acceleration;
    }
    public static double calculateWork(double force, double distance){
        return force*distance;
    }
    public static double calculatePower(double work, double time){
        return work/time;
    }
    public static double calculateKineticEnergy(double mass, double velocity){
        return 0.5*mass*velocity*velocity;
    }
    public static double calculatePotentialEnergy(double mass,double gravity,double height){
        return mass*gravity*height;
    }
    public static double calculateMomentum(double mass, double velocity){
        return mass*velocity;
    }
    
    
}   

