package Giris;
import java.util.Scanner;
public class FaktoriyelHesaplamaVeKombinasyonOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        int i=1;
        int Faktoriyel = 1;

        System.out.print("Faktöriyelini Hesaplamak İstediğiniz Sayıyı Girin :");
        int Sayi = input.nextInt();


            for (i = 1; i <= Sayi; i++) {
                Faktoriyel = (Faktoriyel * i);
            }

            System.out.println(Sayi + "! = " + Faktoriyel);

            C(n,r) = n! / (r! * (n-r)!)

         */


        System.out.print("n Sayısını Seçin :");
        int nSayisi = input.nextInt();

        System.out.print("r Sayısını Seçin :");
        int rSayisi = input.nextInt();

        int i = 1;
        int k = 1;
        int l = 1;
        int nEksir = nSayisi-rSayisi;
        int NFaktoriyel =1;
        int RFaktoriyel =1;
        int nEksirFaktoriyel =1;

        for (i=1; i<=nSayisi; i++) {
            NFaktoriyel = NFaktoriyel * i;
        }

        for (k=1; k<=rSayisi; k++) {
            RFaktoriyel = RFaktoriyel *k;
        }

        for (l=1; l<=nEksir; l++) {
            nEksirFaktoriyel = nEksirFaktoriyel *l;
        }


        System.out.print("Sonuç = ");
        System.out.print(NFaktoriyel/(RFaktoriyel*nEksirFaktoriyel));


    }
}
