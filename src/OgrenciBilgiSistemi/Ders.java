package OgrenciBilgiSistemi;

public class Ders {
    String DersAdi;
    String DersKodu;
    Ogretmen OgretmenAdi;
    Ogretmen YetkinlikAlani;
    double VizeNotu;
    double FinalNotu;
    double NotOrtalamasi;
    String OgrenciAdi;
    String OgrenciNumarasi;


    Ders (String DersAdi, String DersKodu) {
        this.DersAdi = DersAdi;
        this.DersKodu = DersKodu;

    }
    void DersBilgisi() {
        System.out.println(DersAdi + " " + DersKodu);
    }
    void OgretmenAtama (Ogretmen OgretmenAdi) {
        if (this.DersAdi.equals(OgretmenAdi.YetkinlikAlani)) {
            System.out.println("Öğretmen Bu Dersi Verebilecek Yetkinliktedir.");
        } else {
            System.out.println("Öğretmen Yetkinlik Alanı Dışında Ders Ataması!");
        }
    }

    void DersNotuEkleme (String OgrenciAdi, double VizeNotu, double FinalNotu){
        this.OgrenciAdi = OgrenciAdi;
        this.VizeNotu = VizeNotu;
        this.FinalNotu = FinalNotu;
        System.out.println(OgrenciAdi + " Vize Notu :" + VizeNotu + " Final Notu :" + FinalNotu);
        NotOrtalamasi = (VizeNotu*0.4) + (FinalNotu*0.6);
        System.out.print("Öğrencinin Not Ortalaması :" + NotOrtalamasi);
        if (NotOrtalamasi>=60) {
            System.out.println("...Öğrenci Dersi Geçti!");
        } else {
            System.out.println("...Öğrenci Dersten Kaldı!");
        }

    }






}
