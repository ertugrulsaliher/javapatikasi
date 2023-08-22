package Giris;
import java.util.Scanner;

public class DoWhileOgreniyorum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean KullaniciAdiDogruMu = true;

        do {
            System.out.print("Kullanıcı Adı Girin :");
            String KullaniciAdi = input.nextLine();

            if (KullaniciAdi.equals("JavaPatikası")) {

                KullaniciAdiDogruMu =false;

                System.out.println("Kullanıcı Adı Doğru");

            } else {
                System.out.println("Kullanıcı Adı Hatalı!!!");
            }
        } while (KullaniciAdiDogruMu);



    }
}
