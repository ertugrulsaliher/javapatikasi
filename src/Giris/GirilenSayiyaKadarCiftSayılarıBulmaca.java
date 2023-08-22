package Giris;
import java.util.Scanner;
public class GirilenSayiyaKadarCiftSayılarıBulmaca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        System.out.print("Lütfen Maksimum Sayıyı Girin :");
        int MaksSayi = input.nextInt();
        int i ;

        for (i = 1 ; i<=MaksSayi; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

         */

        System.out.print("Maksimum Sayıyı Girin :");
        double MaksSayi = input.nextInt();

        double UceVeDordeBolunenSayilarToplami = 0;
        double UceVeDordeBolunenSayiAdeti = 0 ;

        for (double i = 0; i<=MaksSayi; i++) {

            if (i%3==0 || i%4==0){
                UceVeDordeBolunenSayilarToplami += i;
                UceVeDordeBolunenSayiAdeti++;


            }


        }

        double Ortalama = (UceVeDordeBolunenSayilarToplami/UceVeDordeBolunenSayiAdeti);
        System.out.println("Ortalama :" + Ortalama);
    }
}
