package yanevskyy.models;

/**
 * Created by MM on 23.05.2016.
 */
public class Models {
    String firstName;
    String lastName;
    double payRate;
    int yearlyVacation;

    /**
     * A class representing a Employee or a Contractor or a Temporary
     * @param firstName
     * @param lastName
     * @param payRate
     * @param yearlyVacation
     */
    public Models(String firstName, String lastName, double payRate,
                  int yearlyVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payRate = payRate;
        this.yearlyVacation = yearlyVacation;
    }

    /**
     * Returns name in the format “Last Name, First Name".
     * @return
     */
    public String getName() {
        return lastName + ", " + firstName;
    }

    /**
     * Returns hourly pay rate.
     * @return
     */
    public double getPayRate() {
        return payRate / 24 / 8;
    }

    /**
     * Returns the amount of yearly vacation for the employee
     * @return
     */
    public int getYearlyVacation() {
        return yearlyVacation;
    }

}
