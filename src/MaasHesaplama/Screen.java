package MaasHesaplama;

public  class Screen {
    public static void main(String[] args) {

        Employee Ertugrul = new Employee("Ertugrul",3500,60,2015);

        Ertugrul.Tax();
        Ertugrul.Bonus();
        Ertugrul.RaiseSalary();
        Ertugrul.ToString();


    }
}
