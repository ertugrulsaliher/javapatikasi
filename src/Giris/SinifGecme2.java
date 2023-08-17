package Giris;

import java.util.Scanner;

public class SinifGecme2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ToplamDersPuani = 0;
        int ToplamDersSayisi = 0;

        System.out.print("Matematik Notu:");
        double Matematik = input.nextDouble();

        if ((Matematik>=0)&&(Matematik<=100)) {

            ToplamDersPuani += Matematik;
            ToplamDersSayisi++;

        } else {

            System.out.println("Geçersiz Not Aralığı, Girilen Not 0 ile 100 Arasında Bir Değer Almalıdır!!");

            Scanner inputMatSecenek= new Scanner(System.in);

            System.out.print("Notu Tekrar Girmek İçin 1'i, Devam Etmek İçin 2'yi Tuşlayın :");
            double Secenek = inputMatSecenek.nextDouble();

            if (Secenek == 1) {

                Scanner inputMat = new Scanner(System.in);

                System.out.print("Matematik Notu :");
                Matematik = inputMat.nextDouble();


                if ((Matematik>=0)&&(Matematik<=100)) {

                    ToplamDersPuani += Matematik;
                    ToplamDersSayisi++;

                }

            } else {

                System.out.println("Girilen Geçersiz Not Ortalama Hesaplamasına Dahil Edilmeyecektir!!");

            }

        }

        System.out.print("Fizik Notu :");
        double Fizik = input.nextDouble();

        if ((Fizik>=0)&&(Fizik<=100)) {

            ToplamDersPuani += Fizik;
            ToplamDersSayisi++;

        } else {

            System.out.println("Geçersiz Not Aralığı, Girilen Not 0 ile 100 Arasında Bir Değer Almalıdır!!");

            Scanner inputFizikSecenek= new Scanner(System.in);

            System.out.print("Notu Tekrar Girmek İçin 1'i, Devam Etmek İçin 2'yi Tuşlayın :");
            double Secenek = inputFizikSecenek.nextDouble();

            if (Secenek == 1) {

                Scanner inputFizik = new Scanner(System.in);

                System.out.print("Fizik Notu :");
                Fizik = inputFizik.nextDouble();


                if ((Fizik>=0)&&(Fizik<=100)) {

                    ToplamDersPuani += Fizik;
                    ToplamDersSayisi++;

                }

            } else {

                System.out.println("Girilen Geçersiz Not Ortalama Hesaplamasına Dahil Edilmeyecektir!!");

            }



        }

        System.out.print("Türkçe Notu :");
        double Turkce = input.nextDouble();

        if ((Turkce>=0)&&(Turkce<=100)) {

            ToplamDersPuani += Turkce;
            ToplamDersSayisi++;

        } else {

            System.out.println("Geçersiz Not Aralığı, Girilen Not 0 ile Arasında 100 Bir Değer Almalıdır!!");

            Scanner inputTurkceSecenek= new Scanner(System.in);

            System.out.print("Notu Tekrar Girmek İçin 1'i, Devam Etmek İçin 2'yi Tuşlayın :");
            double Secenek = inputTurkceSecenek.nextDouble();

            if (Secenek == 1) {

                Scanner inputTurkce = new Scanner(System.in);

                System.out.print("Türkçe Notu :");
                Turkce = inputTurkce.nextDouble();


                if ((Turkce>=0)&&(Turkce<=100)) {

                    ToplamDersPuani += Turkce;
                    ToplamDersSayisi++;

                }

            } else {

                System.out.println("Girilen Geçersiz Not Ortalama Hesaplamasına Dahil Edilmeyecektir!!");

            }



        }

        System.out.print("Kimya Notu :");
        double Kimya = input.nextDouble();

        if ((Kimya>=0)&&(Kimya <=100)) {

            ToplamDersPuani += Kimya;
            ToplamDersSayisi++;

        } else {

            System.out.println("Geçersiz Not Aralığı, Girilen Not 0 ile 100 Arasında Bir Değer Almalıdır!!");

            Scanner inputKimyaSecenek= new Scanner(System.in);

            System.out.print("Notu Tekrar Girmek İçin 1'i, Devam Etmek İçin 2'yi Tuşlayın :");
            double Secenek = inputKimyaSecenek.nextDouble();

            if (Secenek == 1) {

                Scanner inputKimya = new Scanner(System.in);

                System.out.print("Kimya Notu :");
                Kimya = inputKimya.nextDouble();


                if ((Kimya>=0)&&(Kimya<=100)) {

                    ToplamDersPuani += Kimya;
                    ToplamDersSayisi++;

                }

            } else {

                System.out.println("Girilen Geçersiz Not Ortalama Hesaplamasına Dahil Edilmeyecektir!!");

            }



        }

        System.out.print("Müzik Notu :");
        double Muzik = input.nextDouble();

        if ((Muzik>=0)&&(Muzik<=100)) {

            ToplamDersPuani += Muzik;
            ToplamDersSayisi++;

        } else {

            System.out.println("Geçersiz Not Aralığı, Girilen Not 0 ile 100 Arasında Bir Değer Almalıdır!!");

            Scanner inputMuzikSecenek= new Scanner(System.in);

            System.out.print("Notu Tekrar Girmek İçin 1'i, Devam Etmek İçin 2'yi Tuşlayın :");
            double Secenek = inputMuzikSecenek.nextDouble();

            if (Secenek == 1) {

                Scanner inputMuzik = new Scanner(System.in);

                System.out.print("Müzik Notu :");
                Muzik = inputMuzik.nextDouble();


                if ((Muzik>=0)&&(Muzik<=100)) {

                    ToplamDersPuani += Muzik;
                    ToplamDersSayisi++;

                }

            } else {

                System.out.println("Girilen Geçersiz Not Ortalama Hesaplamasına Dahil Edilmeyecektir!!");

            }



        }

        double Ortalama = ToplamDersPuani/ToplamDersSayisi;

        System.out.print("Not Ortalamanız :");
        System.out.println(Ortalama);

        String GecmeDurumu = Ortalama>=55 ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!";

        System.out.print(GecmeDurumu);










    }

}
