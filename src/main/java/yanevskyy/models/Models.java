package yanevskyy.models;

/**
 * Uses for make new model employee.
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Models {
    /*First Name*/
    String firstName;
    /*Last Name*/
    String lastName;
    /*Pay Rate*/
    double payRate;
    /*Vacation*/
    int yearlyVacation;

    /**
     * A class representing a Employee or a Contractor or a Temporary
     * @param firstName First Name.
     * @param lastName Last Name.
     * @param payRate Pay Rate.
     * @param yearlyVacation Vacation.
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
