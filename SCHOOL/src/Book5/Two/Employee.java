package src.Book5.Two;

public abstract class Employee {
    abstract public double salary(double hour);
}

class professor extends Employee{

    @Override
    public double salary(double hour) {
        // TODO Auto-generated method stub
        return 5000 + 70*hour;
    }
    
}
