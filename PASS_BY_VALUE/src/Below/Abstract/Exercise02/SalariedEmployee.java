package src.Below.Abstract.Exercise02;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        // TODO Auto-generated constructor stub
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee " + super.toString();
    }

}
