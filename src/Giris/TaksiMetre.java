package Giris;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        //km başına 2.2tl, indi bindi 20 tl, açılış ücreti 10 tl

        double Mesafe, KmBasinaUcret, AcilisUcreti;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek Mesafe (km) : ");
        Mesafe = input.nextDouble();

        double TaksimetreEkrani = (10+(Mesafe*2.2))<=20 ? 20 : (10+(Mesafe*2.2));

        System.out.print("Taksimetre Ekranı (TL)");
        System.out.print(TaksimetreEkrani);


    }
}
