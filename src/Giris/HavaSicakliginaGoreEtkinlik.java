package Giris;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Celsius Cinsinden Girin (°C) :");
        Double Sicaklik = input.nextDouble();

        if (Sicaklik<5) {

            System.out.println("Kayak Yapabiliriniz...");

        } if (Sicaklik>=5 && Sicaklik<=15) {

            System.out.println("Sinemaya Gidebilirsiniz...");

        } if (Sicaklik>=10 && Sicaklik<=25) {

            System.out.println("Pikniğe Gidebilirsiniz...");

        } if (Sicaklik>=25) {

            System.out.println("Yüzmeye Gidebilirsiniz...");
        }

    }
}
