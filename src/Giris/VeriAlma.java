package Giris;
import java.util.Scanner;

public class VeriAlma {
    public static void main(String[] args) {

       String KullaniciAdi;
       String Parola;

       Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adı");
        System.out.println("Parola");

        KullaniciAdi = String.valueOf(input.nextInt());
        System.out.println(KullaniciAdi);

        Parola = String.valueOf(input.nextInt());
        System.out.println(Parola);


    }
}
