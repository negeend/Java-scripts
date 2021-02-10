public class StudentCard extends Card {

    private int yearOfIssue;
    private String magneticStrip;

    public StudentCard(String name, int cardNumber, int expiryDate, int yearOfIssue, String magneticStrip) {
        super(name, cardNumber, expiryDate);
        this.yearOfIssue = yearOfIssue;
        this.magneticStrip = magneticStrip;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }

    public String getMagneticStrip() {
        return this.magneticStrip;
    }
}