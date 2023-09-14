package Giris;
import java.util.Scanner;
public class PalindromSayiBulma {
    static boolean isPalindrom (int GirilenSayi) {
        int GeciciGirilenSayi = GirilenSayi, SonRakam =0 , TersSayi = 0;

        while (GeciciGirilenSayi !=0) {
            SonRakam = GeciciGirilenSayi%10;
            TersSayi = ((TersSayi *10)+SonRakam);
            GeciciGirilenSayi /= 10;
        }
        if (GirilenSayi==TersSayi) {
            System.out.println(GirilenSayi+" Sayısı bir Polindrom Sayıdır.");
            return true;
        }else {
            System.out.println(GirilenSayi+" Bir Polindrom Sayısı değildir. ");
            return false;
        }


    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Lütfen Kontrol Etmek İstediğiniz Sayıyı Girin :");
       int GirilenSayi = input.nextInt();

       System.out.println(isPalindrom(GirilenSayi));
    }
}
