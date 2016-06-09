package yanevskyy.models;

/**
 * Created by MM on 23.05.2016.
 */
public class Contractor extends  Models {
    String agencyName;

    /**
     * By policy, all contractors have 0 days of vacation.
     * @param firstName
     * @param lastName
     * @param payRate
     * @param agencyName
     */
    public Contractor(String firstName, String lastName, double payRate,
                      String agencyName) {
        super(firstName, lastName, payRate, 0);
        this.agencyName = agencyName;
    }

    /**
     * Returns the name of the contracting agency that represents the
     * contractor
     * @return
     */
    public String getAgency() {
        return agencyName;
    }

}
