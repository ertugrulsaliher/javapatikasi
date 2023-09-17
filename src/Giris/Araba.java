package Giris;

public class Araba {
    String Marka, Model, Tip, Renk;
    double Hiz;
    double HizLimiti = 250;

    void HizArtirma (double ArtisMiktari) {
        if (ArtisMiktari+Hiz<=250) {
            Hiz+=ArtisMiktari;
        } else if (ArtisMiktari+Hiz>250) {
            Hiz = 250;
        }
    }
    void HizAzaltma (double AzalisMiktari) {
        if(Hiz-AzalisMiktari>0) {
            Hiz-=AzalisMiktari;
        } else if (Hiz-AzalisMiktari<=0) {
            Hiz = 0;
        }
    }

    void AracBilgileri (){
        System.out.println(Marka+"\n"+Model+"\n"+Tip+"\n"+Renk+"\n"+Hiz+" km/h");
    }
}
