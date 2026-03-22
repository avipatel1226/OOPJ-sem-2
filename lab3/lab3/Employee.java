public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // TODO 1: Create a constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // TODO 2: Create getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // TODO 3: Declare abstract method earnings()
    public abstract double earnings();

    // TODO 4: Override toString()
    @Override
    public String toString() {
        return "First Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nSocial Security Number: " + socialSecurityNumber;
    }
}