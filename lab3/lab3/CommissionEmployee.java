public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    // TODO 5: Create constructor using super()
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    // TODO 6: Create getters and setters with validation
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0.0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("Gross sales must be >= 0");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0.0 && commissionRate < 1.0) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Commission rate must be between 0 and 1");
        }
    }

    // TODO 7: Override earnings()
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    // TODO 8: Override toString()
    @Override
    public String toString() {
        return "Commission Employee\n"
                + super.toString()
                + "\nGross Sales: " + grossSales
                + "\nCommission Rate: " + commissionRate;
    }
}