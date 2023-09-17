package Giris;

public class AracBilgileriDeneme {
    public static void main(String[] args) {
        Araba Mercedes = new Araba();
        Mercedes.Marka = "Mercedes-Benz";
        Mercedes.Model = "C 200 AMG";
        Mercedes.Tip = "Sedan";
        Mercedes.Renk = "Metalik Dağ Grisi";
        Mercedes.Hiz = 50;
        Mercedes.HizArtirma(50);
        Mercedes.HizArtirma(250);
        Mercedes.AracBilgileri();

        Araba BMW = new Araba();
        BMW.Marka = "BMW";
        BMW.Model = "520";
        BMW.Tip = "Sedan";
        BMW.Renk =  "Siyah";
        BMW.Hiz = 25.5;
        BMW.HizArtirma(250);
        BMW.AracBilgileri();
    }
}
