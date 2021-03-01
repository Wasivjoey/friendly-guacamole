public class SalesRep extends staffmember {
    private double allowance;

  
    public SalesRep(String fisrstName, String lastName, String deptNumber, double hoursworked, double allowance) {
        super(fisrstName, lastName, deptNumber, hoursworked);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "SalesRep [allowance=" + allowance + "]";
    }


    
}
