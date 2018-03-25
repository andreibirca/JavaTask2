package pack1;

public class Employee {
    private double tariffPerHour = 5.5;
    public int hours;
    double getSalary(){
        return tariffPerHour * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("Tariff per Hour :"+ manager.getTariffPerHour()+
        " Manager salary : "+manager.getSalary());
    }
}
