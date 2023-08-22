package Giris;
import java.util.Scanner;
public class TekSayiGirileneKadarkiVerilenCiftVeDordeBolunebilenlerinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Sayi;
        double Toplam = 0;
        double ToplamSayi = 0;

        do {
            System.out.print("Bir Sayı Girin :");
            Sayi = input.nextInt();
            if (Sayi%2==0 && Sayi%4==0){
                Toplam += Sayi;
                ToplamSayi++;
            }
        } while (Sayi>0);

        System.out.print("Toplam :");
        System.out.println(Toplam/ToplamSayi);





    }
}
