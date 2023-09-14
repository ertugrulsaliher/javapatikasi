package Giris;
import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sayı Seçin :");
        int SecilenSayi = input.nextInt();



        for (int i=2; i<=SecilenSayi; i++) {

            for (int Bolen=2; Bolen<=i; Bolen++) {
                if (i%Bolen==0) {
                    if (Bolen==i) {
                        System.out.print(i);
                    }
                }
            }



        }




    }
}
