

public class Manager extends staffmember{

private double bonus;

public double getBonus() {
    return bonus;
}

public void setBonus(double bonus) {
    this.bonus = bonus;
}
public Manager(String fisrstName, String lastName, String deptNumber, double hoursworked, double bonus) {
    super(fisrstName, lastName, deptNumber, hoursworked);
    this.bonus = bonus;
}

@Override
public String toString() {
    return "Manager [bonus=" + bonus + "]";
}


}