package Giris;
import java.util.Scanner;

public class Manavcilik {
    public static void main(String[] args) {

        double Armut, Elma, Domates, Muz, Patlican;
        double ArmutKgFiyat = 2.14;
        double ElmaKgFiyat = 3.67;
        double DomatesKgFiyat = 1.11;
        double MuzKgFiyat = 0.95;
        double PatlicanKgFiyat = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut KG :");
        Armut = input.nextDouble();

        double ArmutFiyat = Armut*ArmutKgFiyat;

        System.out.print("Armut Fiyat TL ");
        System.out.println(ArmutFiyat);

        System.out.print("Elma KG :");
        Elma =input.nextDouble();

        double Elmafiyat = Elma*ElmaKgFiyat;

        System.out.print("Elma Fiyat TL ");
        System.out.println(Elmafiyat);

        System.out.print("Domates Kg :");
        Domates = input.nextDouble();

        double DomatesFiyat = Domates*DomatesKgFiyat;

        System.out.print("Domates Fiyat TL ");
        System.out.println(DomatesFiyat);

        System.out.print("Muz kg :");
        Muz = input.nextDouble();

        double MuzFiyat = Muz*MuzKgFiyat;

        System.out.print("Muz Fiyat TL ");
        System.out.println(MuzFiyat);

        System.out.print("Patlıcan Kg :");
        Patlican = input.nextDouble();

        double PatlicanFiyat = Patlican*PatlicanKgFiyat;

        System.out.print("Patlıcan Fiyat TL ");
        System.out.println(PatlicanFiyat);

        double ToplamFiyat = ArmutFiyat+Elmafiyat+DomatesFiyat+MuzFiyat+PatlicanFiyat;

        System.out.print("Toplam Fiyat :");
        System.out.println(ToplamFiyat);





    }
}
