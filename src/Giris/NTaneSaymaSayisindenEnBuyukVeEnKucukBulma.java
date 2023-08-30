package Giris;
import java.util.Scanner;
public class NTaneSaymaSayisindenEnBuyukVeEnKucukBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Tane Sayma Sayısı Gireceksiniz? ");
        int SaymaSayisiAdeti = input.nextInt();

        System.out.print("1. Sayıyı Girin :");
        int Maks = input.nextInt();
        int Min = Maks;



        for (int SayiGirisi =2; SayiGirisi<=SaymaSayisiAdeti; SayiGirisi++) {

            System.out.print(SayiGirisi+". Sayıyı Girin :");
            int GirilenDigerSayilar = input.nextInt();

            if (GirilenDigerSayilar>Maks) {
                Maks = GirilenDigerSayilar;
            } if (GirilenDigerSayilar<Min){
                Min = GirilenDigerSayilar;
            }


        }

        System.out.println("Girilen En Büyük Sayı :"+Maks);

        System.out.println("Girilen En Küçük Sayı :"+Min);





    }
}
