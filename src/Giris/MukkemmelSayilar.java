package Giris;
import java.util.Scanner;
public class MukkemmelSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif Bir Tam Sayı Girin :");
        int GirilenSayi = input.nextInt();


        if (GirilenSayi>0) {
            int GirilenSayiBolenleriToplami = 0;


            for (int i = 1; i < GirilenSayi; i++) {

                if (GirilenSayi % i == 0) {
                    GirilenSayiBolenleriToplami += i;
                }


            }

            if (GirilenSayi == GirilenSayiBolenleriToplami) {
                System.out.print(GirilenSayi + " Bir Mükemmel Sayıdır.");
            } else {
                System.out.print(GirilenSayi + " Bir Mükemmel Sayı Değildir!");
            }


        } else {
            System.out.print("Lütfen 0'dan Büyük Pozitif Bir Tam Sayı Girin!!");
        }
    }
}
