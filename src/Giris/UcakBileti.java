package Giris;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen gitmek istediğiniz konumun mesafesini km cinsinden yazın :");
        double Mesafe = input.nextDouble();

        double MesafeUcreti = ((Mesafe * 0.1));

        if (Mesafe>0) {

            Scanner inputyas = new Scanner(System.in);

            System.out.print("Lütfen Yaşınızı girin :");
            double Yas = inputyas.nextDouble();

            if (Yas>=0) {

                System.out.print("Lütfen bilet tipini seçiniz \n1 Tek yön \n2 Gidiş dönüş...:");
                int BiletTipi = input.nextInt();


                switch (BiletTipi) {
                    case 1:


                        if (Yas < 12 && Yas > 0) {
                            double MesafeVeYasIndirimi = (MesafeUcreti * 0.5);


                            System.out.print("Bilet Ücretiniz TL 1:");
                            System.out.print(MesafeVeYasIndirimi);

                        } else if (Yas >= 12 && Yas <= 24) {
                            double MesafeVeYasIndirimi = (MesafeUcreti * 0.1);


                            System.out.print("Bilet Ücretiniz TL :");
                            System.out.print(MesafeVeYasIndirimi);


                        } else if (Yas > 24 && Yas < 65) {

                            System.out.print("Bilet Ücretiniz Tl :");
                            System.out.print(MesafeUcreti);

                        } else if (Yas >= 65) {
                            double MesafeVeYasIndirimi = (MesafeUcreti * 0.3);


                            System.out.print("Bilet Ücretiniz TL :");
                            System.out.print(MesafeVeYasIndirimi);

                        }

                        break;
                    case 2:

                        if (Yas < 12) {
                            double MesafeVeYasIndirimi = (MesafeUcreti * 0.5);
                            double BiletUcretiSon = (MesafeVeYasIndirimi * 0.2);

                            System.out.print("Bilet Ücretiniz TL :");
                            System.out.print(BiletUcretiSon*2);

                        } else if (Yas >= 12 && Yas <= 24) {
                            double MesafeVeYasIndirimi = (MesafeUcreti * 0.1);
                            double BiletUcretiSon = (MesafeVeYasIndirimi * 0.2);

                            System.out.print("Bilet Ücretiniz TL :");
                            System.out.print(BiletUcretiSon*2);


                        } else if (Yas > 24 && Yas < 65) {

                            double BiletUcretiSon = (MesafeUcreti * 0.2);

                            System.out.print("Bilet Ücretiniz TL :");
                            System.out.print(BiletUcretiSon*2);

                        } else if (Yas > 65) {
                            double MesafeVeYasIndirimi = (MesafeUcreti * 0.3);
                            double BiletUcretiSon = (MesafeVeYasIndirimi * 0.2);

                            System.out.print("Bilet Ücretiniz TL :");
                            System.out.print(BiletUcretiSon*2);
                        }

                        break;
                    default:
                        System.out.println("Hatalı Bilet Seçimi!!!");
                }


            } else {

                System.out.print("Hatalı yaş girdiniz!!");

            }

        } else {
            System.out.println("Hatalı Mesafe Girdiniz!!");
        }



    }
}
