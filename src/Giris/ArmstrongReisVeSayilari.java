package Giris;
import java.util.Scanner;
public class ArmstrongReisVeSayilari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol Etmek İstediğiniz Sayıyı Girin :");
        int GirilenSayi = input.nextInt();
        int BasamakSayisi = 0;
        int GeciciGirilenSayi = GirilenSayi;
        int BasamakDegeri;
        int Sonuc = 0;
        int BasamakUsSonucu;


        while (GeciciGirilenSayi !=0 ) {

            GeciciGirilenSayi/=10;
            BasamakSayisi++;
        }
        System.out.println("Basamak Sayısı :"+BasamakSayisi);

        GeciciGirilenSayi = GirilenSayi;

        while (GeciciGirilenSayi !=0) {

            BasamakDegeri = GeciciGirilenSayi % 10;
            System.out.println("Basamak Değerleri : "+BasamakDegeri);

            BasamakUsSonucu = 1;
            for (int i = 1; i<=BasamakSayisi; i++) {
                BasamakUsSonucu *= BasamakDegeri;
            }

            Sonuc += BasamakUsSonucu;

            GeciciGirilenSayi/=10;

        }


        if (GirilenSayi==Sonuc) {
            System.out.println(Sonuc+ " Bir Armstrong Sayısıdır" );
        } else {
            System.out.println(GirilenSayi + " Bir Armstrong Sayısı Değildir!!");
        }















    }
}
