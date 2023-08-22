package Giris;

import java.util.Scanner;

public class WhileOgreniyorum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean KullaniciAdiDogruMu = false;


        while (!KullaniciAdiDogruMu) {

            System.out.print("Kullanıcı Adınızı Girin :");
            String KullaniciAdi = input.nextLine();


            if (KullaniciAdi.equals("Patika")) {


                KullaniciAdiDogruMu = true;

                boolean SifreDogruMu = false;

                while (!SifreDogruMu) {


                    System.out.print("Parola :");
                    String Parola = input.nextLine();

                    if (Parola.equals("Java.123")) {

                        System.out.println("Giriş Yapıldı");
                        SifreDogruMu = false;

                    } else {

                        System.out.println("Şifreyi yenilemek isterseniz '1' , Tekrar denemek isterseniz '2' tuşlarına basın.");


                        int a = input.nextInt();

                        if (a == 1) {

                            Scanner input2 = new Scanner(System.in);

                            System.out.print("Yeni Şifreyi Girin :");
                            String ParolaYeni = input2.nextLine();


                            if (ParolaYeni.equals("Java.123")) {

                                System.out.print("Yeni Parolanız Eski Parolanız ile Aynı Olamaz! \n Lütfen Tekrar Deneyin!");

                            } else {

                                System.out.print("Yeni Parolanız Başarıyla Oluşturulmuştur.");

                            }
                        }


                    }


                }

            }
        }
    }
}