package Giris;
import java.util.Scanner;
public class GirilenSayiyaKadarCiftSayılarıBulmaca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Maksimum Sayıyı Girin :");
        int MaksSayi = input.nextInt();
        int i ;

        for (i = 1 ; i<=MaksSayi; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }




    }
}
