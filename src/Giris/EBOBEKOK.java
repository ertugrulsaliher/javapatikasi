package Giris;
import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Girin :");
        int NSayisi = input.nextInt();

        System.out.print("M Sayısını Girin :");
        int MSayisi = input.nextInt();

        int KucukSayi;


        if (NSayisi>MSayisi) {
            KucukSayi = MSayisi;
        } else {
            KucukSayi = NSayisi;
        }



        int ebob = 1;
        int bolen = 2;

        while (bolen <= NSayisi && bolen <= MSayisi) {
            if (NSayisi % bolen == 0 && MSayisi % bolen == 0) {
                ebob = bolen;
                System.out.println(ebob);
            }
            bolen++;
        }

        System.out.println("Girilen sayıların EBOB'u: " + ebob);






    }
}
