package Giris;

public class UcBasamakliSayilardaArmstrongSayisiBulma {
    public static void main(String[] args) {


        int Sayi;
        int BasamakDegeri = 0;
        int BasamakSayisi = 0;
        int BasamakUssuSonucu = 1;
        int Sonuc = 0;

        for (Sayi = 100; Sayi<=999; Sayi++) {


            while (Sayi!=0) {
                Sayi /= 10;
                BasamakSayisi++;
            }
            while (Sayi!=0) {
                BasamakDegeri = Sayi %10;

                for (int a = 1; a<=BasamakSayisi; a++) {
                    BasamakUssuSonucu *= BasamakDegeri;
                }
                Sonuc += BasamakUssuSonucu;
                Sayi /= 10;
            }

            if (Sayi==Sonuc) {
                System.out.println(Sayi+" Bir Armstrong Sayısıdır.");
            }





        }


    }
}
