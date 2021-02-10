public class CreditCard extends Card {

    private String bankName;
    private String securityChip;

    public CreditCard(String name, int cardNumber, int expiryDate, String bankName, String securityChip) {
        super(name, cardNumber, expiryDate);
        this.bankName = bankName;
        this.securityChip = securityChip;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getSecurityChip() {
        return this.securityChip;
    }
}