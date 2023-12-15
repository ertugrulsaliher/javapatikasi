package MaasHesaplama;

public class Employee {
    String Name;
    double Salary;
    double WorkHours;
    int HireYear;
    Double TaxedSalary;
    double LastSalary;
   




    Employee (String Name, double Salary, double Workhours, int HireYear) {

        this.Name = Name;
        this.Salary = Salary;
        this.WorkHours = Workhours;
        this.HireYear = HireYear;

    }
    
    void Tax () {
        if(this.Salary>1000) {
            TaxedSalary = Salary*0.97;
            System.out.println("%3 Vergi Kesintisi Sonrası Maaş : "+TaxedSalary);
        }
    }
    void Bonus (){
        if (this.WorkHours>40) {
            LastSalary = TaxedSalary +((WorkHours-40)*30);
            System.out.println("Bonus Eklenmiş Maaş : "+LastSalary);
        }
    }
    void RaiseSalary (){
        if(2023-this.HireYear<10){
            LastSalary += (Salary*0.05);
        } else if (2023-this.HireYear<20) {
            LastSalary += (Salary*0.1);
        } else {
            LastSalary += (Salary*0.15);
        }
        System.out.println("Kıdem Tazminatlı Maaş : " + LastSalary);
    }
    void ToString () {
        System.out.println("Çalışan İsmi = "+Name);
        System.out.println("Çalışanın Brüt Maaşı = "+ Salary );
        System.out.println("Çalışanın İşe Giriş yılı = "+ HireYear);
        System.out.println("Çalışanın Net Maaşı = "+LastSalary);
    }

}
