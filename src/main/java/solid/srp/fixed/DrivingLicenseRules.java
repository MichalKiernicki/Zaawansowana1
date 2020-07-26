package solid.srp.fixed;

public class DrivingLicenseRules {

    private static final int DRIVING_LICENSE_REQUIRED_AGE = 18;
    private static final int DRIVING_LICENSE_REQUIRED_AGE_WHIT_MENTOR = 16;

    public static boolean canGetDrivingLicense(Person person) {
        return person.getAge() > DRIVING_LICENSE_REQUIRED_AGE;
    }
}
