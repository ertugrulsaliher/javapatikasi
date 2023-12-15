package BoksMaci;

public class Fighter {
    String Name;
    int Damage;
    int Weight;
    int Health;
    double Dodge;

    Fighter (String Name, int Damage, int Weight, int Health, double Dodge) {
        this.Name = Name;
        this.Damage = Damage;
        this.Weight = Weight;
        this.Health = Health;
        this.Dodge =  Dodge;
    }
    int Hit (Fighter Foe) {
        System.out.println(this.Name + " => " + Foe.Name + " " + this.Damage + "  Hasar Vurdu!!");
        if(Foe.isDodge()) {
            System.out.println(Foe.Name + " Gelen Hasarı Blokladı!!!" );
            return Foe.Health;
        }
        if (Foe.Health-this.Damage <0 ) {
            return 0;
        }
        return Foe.Health - this.Damage;
    }

    boolean isDodge() {
        double chanceDodge = Math.random() * 100;
        return chanceDodge <= this.Dodge;
    }
}
