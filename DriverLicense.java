public class DriverLicense extends Card {

    private String address;
    private int licenseNumber;
    private String stateOfIssue;

    public DriverLicense(String name, int cardNumber, int expiryDate, String address, int licenseNumber, String stateOfIssue) {
        super (name, cardNumber, expiryDate);
        this.address = address;
        this.licenseNumber = licenseNumber;
        this.stateOfIssue = stateOfIssue;
    }

    public String getAddress() {
        return this.address;
    }

    public int getLicenseNumber() {
        return this.licenseNumber;
    }

    public String getStateOfIssue() {
        return this.stateOfIssue;
    }
}