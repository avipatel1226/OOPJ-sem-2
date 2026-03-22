public class PayrollTest {

    public static void main(String[] args) {

        // TODO 9: Create a CommissionEmployee object
        CommissionEmployee emp = new CommissionEmployee(
                "Avi",
                "Patel",
                "123-45-6789",
                10000.0,
                0.2
        );

        // TODO 10: Display employee details
        System.out.println(emp);

        // TODO 11: Display earnings
        System.out.println("Earnings: $" + emp.earnings());
    }
}