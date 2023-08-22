package Giris;
import java.util.Scanner;

public class ForVsWhile {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        /*
        for (boolean Run = true; Run;) {

            System.out.print("Sayı Girin :");
            int Sayi = Input.nextInt();
            if (Sayi<0) {
                Run = false;
                System.out.print("Sıfırdan Küçük Bir Sayı Girdiniz!!");
            }
        }

         */


        /*
        System.out.print("Sayı Girin :");
        int Sayi = Input.nextInt();



        while (Sayi>0) {
            System.out.print("Sayı Girin :");
            Sayi = Input.nextInt();
        }

         */

        int Sayi;

        do {
            System.out.print("Sayı Girin :");
             Sayi = Input.nextInt();
        } while (Sayi>0);




    }
}
