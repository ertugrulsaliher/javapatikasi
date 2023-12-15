package BoksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int MinWeight;
    int MaxWeight;

    Match (Fighter f1, Fighter f2, int MinWeight, int MaxWeight ) {

        this.f1 = f1;
        this.f2 = f2;
        this.MinWeight = MinWeight;
        this.MaxWeight = MaxWeight;
    }

      void run() {
        if (isCheck()) {
            while(this.f1.Health >0 && this.f2.Health >0) {

                System.out.println("=== Yeni Round ==");

                this.f2.Health = this.f1.Hit(f2);
                this.f1.Health = this.f2.Hit(f1);


                System.out.println(f2.Name +" "+ f2.Health + " Canı Kaldı!");
                System.out.println(f1.Name + " "+ f1.Health + " Canı Kaldı!");


                if (isWin()) {
                    break;
                }



            }

        } else {
            System.out.println("Sporcuların Sikletleri Karşılaşma Kurallarına Uymamaktadır!");
        }

    }

    boolean isCheck () {
        return (this.f1.Weight >= MinWeight && this.f2.Weight >= MinWeight) && (this.f1.Weight <= MaxWeight && this.f2.Weight <= MaxWeight);
    }

    boolean isWin () {

        if(this.f1.Health <= 0 && this.f2.Health <= 0) {
            System.out.println("Maç Berabere Sona Erdi!!!");
            return true;
        }
        if (this.f1.Health <= 0) {
            System.out.println(this.f2.Name + " Maçı Kazandı!!");
            return true;
        }
        if(this.f2.Health <= 0) {
            System.out.println(this.f1.Name + " Maçı Kazandı!!");
            return true;
        }
        if(this.f1.Health <= 0 && this.f2.Health <= 0) {
            System.out.println("Maç Berabere Sona Erdi!!!");
            return true;
        }
        return false;
    }
}
