package Giris;
import java.util.Scanner;
public class FaktoriyelHesaplamaVeKombinasyonOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i=1;
        int Faktoriyel = 1;

        System.out.print("Faktöriyelini Hesaplamak İstediğiniz Sayıyı Girin :");
        int Sayi = input.nextInt();


            for (i = 1; i <= Sayi; i++) {
                Faktoriyel = (Faktoriyel * i);
            }

            System.out.println(Sayi + "! = " + Faktoriyel);
    }
}
