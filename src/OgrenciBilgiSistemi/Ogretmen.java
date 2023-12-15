package OgrenciBilgiSistemi;

public class Ogretmen {
    String OgretmenAdi;
    String TelefonNumarasi;
    String YetkinlikAlani;

    Ogretmen (String OgretmenAdi, String YetkinlikAlani, String TelefonNumarasi) {
        this.OgretmenAdi = OgretmenAdi;
        this.TelefonNumarasi = TelefonNumarasi;
        this.YetkinlikAlani = YetkinlikAlani;

    }
    void OgretmenBilgileri() {
        System.out.println(OgretmenAdi+"\n"+TelefonNumarasi+"\n"+YetkinlikAlani);
    }



}
