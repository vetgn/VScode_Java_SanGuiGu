package src.Below.Abstract.Exercise01;

public class Manger extends Employee {
    private double bonus;

    public Manger(double bonus) {
        this.bonus = bonus;
    }

    public Manger(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
