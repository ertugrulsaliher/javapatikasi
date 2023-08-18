package Giris;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bilgisini Almak İstediğiniz Yılı Yazın :");
        int SecilenYil = input.nextInt();
        int Mod4 = SecilenYil % 4;
        int Mod100 = SecilenYil % 100;
        int Mod400 = SecilenYil % 400;

        if (!(Mod400==0)) {

            if (!(Mod100==0)) {

                if (Mod4==0) {
                    System.out.print("Seçilen Yıl Artık Yıldır!!");
                } else {
                    System.out.print("Seçilen Yıl Artık Yıl Değildir!!");
                }
            } else {
                System.out.print("Seçilen Yıl Artık Yıl Değildir!!");
            }


        } else {
            System.out.print("Seçilen Yıl Artık Yıldır!!");
        }


    }
}
