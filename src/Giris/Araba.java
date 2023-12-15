package Giris;

public class Araba {
    String Marka, Model, Tip, Renk;
    double Hiz;
    double HizLimiti;

    Araba(String Marka, String Model, String Tip, String Renk) {
        this.Marka = Marka;
        this.Model = Model;
        this.Tip = Tip;
        this.Renk = Renk;
        this.HizLimiti = 250;
    }

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
        if (Hiz>143&&Hiz<195) {
            System.out.println("Hız Sınırı Geçildi!! Cezai İşlem 943 TL");
        } else if (Hiz>=195) {
            System.out.println("Hız Sınırı Geçildi!! Cezai İşlem 4093 TL");
        }
    }



}
