package Giris;
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {


        int GirisHakki = 3;
        int Bakiye = 8500;
        int YatirilanTutar;
        int CekilenTutar;
        int Secenekler;


        while (GirisHakki>0) {
            Scanner input = new Scanner(System.in);

            System.out.println("** JAVA Bankasına Hoşgeldiniz **");

            System.out.print("Kullanıcı Adınızı Girin :");
            String KullaniciAdi = input.nextLine();


            System.out.print("Parolanızı Girin :");
            String Parola = input.nextLine();



            if (KullaniciAdi.equals("PatikaJava")&&Parola.equals("Java.123")) {

                    System.out.println("Giriş Başarılı");



                    do {


                        System.out.print("1) Para Yatırma\n" +
                                "2) Para Çekme\n" +
                                "3) Bakiye Sorgulama\n" +
                                "4) Çıkış Yapma\n" +
                                "Lütfen Yapmak İstediğiniz İşlemi Seçin :");
                        Secenekler = input.nextInt();

                        switch (Secenekler) {
                            case 1:
                                System.out.print("Yatırmak İstediğiniz Tutarı Girin :");
                                YatirilanTutar = input.nextInt();
                                Bakiye += YatirilanTutar;
                                System.out.println(YatirilanTutar + " TL Değerindeki Tutar Hesabınıza Yatırılmıştır.");
                                break;
                            case 2:
                                System.out.println("Çekmek İstediğiniz Tutarı Girin :");
                                CekilenTutar = input.nextInt();
                                Bakiye -= CekilenTutar;
                                System.out.println("Hesabınızdan" + CekilenTutar + " TL Değerinde Para Çekme İşlemi Gerçekleştirilmiştir.");
                                break;
                            case 3:
                                System.out.println("Hesabınızda " + Bakiye + " TL Bulunmaktadır.");
                                break;
                            default:
                                System.out.println("Hatalı Tuşlama!!!");
                                break;


                        }


                    } while (Secenekler !=4); {
                        System.out.println("Güvenle Çıkış Yaptınız");

                    }


            } else {
                GirisHakki--;

                System.out.println("Kullanıcı Adı ya da Parola Hatalı");
                System.out.println("Kalan Giriş Hakkınız..." + GirisHakki);
                if (GirisHakki==0) {
                    System.out.println("Hesabınız Bloke Edildi. Lütfen Banka ile İletişime Geçin!!");
                }

            }



        }




    }
}
