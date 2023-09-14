package Giris;

public class Fonksiyonlar {
    static int Fonksiyon (int X, int Y) {
        int Sonuc = 1;
        for (int i=1; i<=Y; i++) {
            Sonuc *= X;
        }
        return Sonuc;
    }
    public static void main(String[] args) {

        int case1 = Fonksiyon(2,3);
        System.out.println(case1);

        System.out.print(Fonksiyon(10,2));

    }
}
