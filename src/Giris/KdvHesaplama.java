package Giris;

public class KdvHesaplama {
    public static void main(String[] args) {

        double UrunKdvSiz = 1342 ;
        double KademeBirKdv = 0.18;
        double KademeİkiKdv = 0.08;

        double UrunsonFiyat = (UrunKdvSiz<=1000 ? (UrunKdvSiz+(UrunKdvSiz*KademeBirKdv)) : UrunKdvSiz+(UrunKdvSiz*KademeİkiKdv));

        System.out.print("KDV Dahil Fiyat :");
        System.out.print(UrunsonFiyat);
    }
}
