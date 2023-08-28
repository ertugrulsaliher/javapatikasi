package Giris;
import java.util.Scanner;
public class BirSayininBasamaklariniToplayan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bri Sayı Girin :");
        int GirilenSayi = input.nextInt();
        int GeciciGirilenSayi = GirilenSayi;

        int BasamakDegerleri;
        int BasamakDegerleriToplam = 0;




        while (GeciciGirilenSayi!=0) {

            BasamakDegerleri = GeciciGirilenSayi%10;
            System.out.println(BasamakDegerleri);
            BasamakDegerleriToplam += BasamakDegerleri;

            GeciciGirilenSayi/=10;

        }
        System.out.print("Seçilen Sayının Basamak Değerleri Toplamı :"+BasamakDegerleriToplam);

    }
}
