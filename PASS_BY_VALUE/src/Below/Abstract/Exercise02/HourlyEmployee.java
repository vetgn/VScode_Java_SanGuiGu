package src.Below.Abstract.Exercise02;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        // TODO Auto-generated constructor stub
        this.hour = hour;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee " + super.toString();
    }

}
