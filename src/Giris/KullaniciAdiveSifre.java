package Giris;
import java.util.Scanner;
public class KullaniciAdiveSifre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Girin :");
        String KullaniciAdi = input.nextLine();

        System.out.print("Parola :");
        String Parola = input.nextLine();

        if (KullaniciAdi.equals("Patika") && Parola.equals("Java.123")) {

            System.out.println("Giriş Yapıldı...");

        } else {

            System.out.println("Kullanıcı Adı ya da Parola Hatalı!");


            System.out.println("Şifreyi yenilemek isterseniz '1' , yenilemek istemezseniz '2' tuşlarına basın.");
            int a = input.nextInt();

            if (a==1) {

                Scanner input2 = new Scanner(System.in);

                System.out.print("Kullanıcı Adınızı Girin :");
                String KullaniciAdiDogrulama = input2.nextLine();

                if (KullaniciAdiDogrulama.equals("Patika")) {

                    System.out.print("Yeni Şifreyi Girin :");
                    String ParolaYeni = input2.nextLine();


                    if (ParolaYeni.equals("Java.123")) {

                        System.out.print("Yeni Parolanız Eski Parolanız ile Aynı Olamaz! \n Lütfen Tekrar Deneyin!");

                    } else {

                        System.out.print("Yeni Parolanız Başarıyla Oluşturulmuştur.");

                    }
                } else {

                    System.out.println("Kullanıcı Adınız Hatalı Lütfen Doğru Kullanıcı Adınızı Girin...");
                }


            } else {

                System.out.println("Eğer Kullanıcı Adınız ve Parolanızın Doğru olduğunu Düşünüyorsanız Tekrar deneyin...");

            }


        }

    }
}

