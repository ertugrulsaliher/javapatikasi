package Giris;
import java.util.Scanner;
public class GirilenSayiyaKadarKuvvetBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Tam Sayı Girin :");
        int Sayi = input.nextInt();
        int i;
        int k;

        while (Sayi<=0) {
            System.out.println("Lütfen 0'dan Büyük Bir Tam Sayı Girin!!!");
            System.out.print("Bir Sayı Girin :");
            Sayi = input.nextInt();
        }

        System.out.println("Seçilen Sayıya Kadar 5'in Kuvvetleri :");
        for (i=1; i<=Sayi; i*=5){

            System.out.println(i+" , ");
        }



        System.out.println("Seçilen Sayıya Kadar 4'ün Kuvvetleri :");
        for (k=1; k<=Sayi; k*=4) {

            System.out.println(k+" , ");
        }







    }
}
