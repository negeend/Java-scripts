public class Card {

    protected String name;
    protected int cardNumber;
    protected int expiryDate;

    public Card(String name, int cardNumber, int expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return this.name;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public int expiryDate() {
        return this.expiryDate;
    }
}