package OgrenciBilgiSistemi;

public class BilgiSistemi {
    public static void main(String[] args) {

        Ogretmen Hasan = new Ogretmen("Hasan","Fiziksel Metalurji","312xxx");
        Ogretmen Mehmet = new Ogretmen("Mehmet", "Kimyasal Metalurji", "313xxx");
        Ogretmen Volkan = new Ogretmen("Volkan", "Faz Diyagramları","314xxx");

        Ogrenciler Salih = new Ogrenciler("Salih", "151");
        Ogrenciler Ertugrul = new Ogrenciler("Ertuğrul", "152");
        Ogrenciler Ezgi = new Ogrenciler("Ezgi", "153");


        Ders KimyasalMetalurji = new Ders("Kimyasal Metalurji", "502");
        KimyasalMetalurji.DersBilgisi();
        KimyasalMetalurji.OgretmenAtama(Mehmet);
        KimyasalMetalurji.DersNotuEkleme("Salih",55,85);
        KimyasalMetalurji.DersNotuEkleme("Ertugrul",43,51);
        KimyasalMetalurji.DersNotuEkleme("Ezgi",90,90);

        Ders FizikselMetalurji = new Ders("Fiziksel Metalurji","501");
        FizikselMetalurji.DersBilgisi();
        FizikselMetalurji.OgretmenAtama(Hasan);
        FizikselMetalurji.DersNotuEkleme("Salih",65,63);
        FizikselMetalurji.DersNotuEkleme("Ertuğrul",41,92);
        FizikselMetalurji.DersNotuEkleme("Ezgi",45,82);







    }

}
