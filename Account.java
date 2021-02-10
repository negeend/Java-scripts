import java.util.ArrayList;

public class Account {

    protected int accountsNumber;
    protected int bsb;
    protected double interestRate;

    public Account(int accountsNumber, int bsb, double interestRate, double initialBalance) {
        this.accountsNumber = accountsNumber;
        this.bsb = bsb;
        this.interestRate = interestRate;
        this.transactions = new ArrayList<Transaction>();

        makeTransaction(new Transaction(new SimpleDate(0, 0, 0), "initial balance", initialBalance));
    }

    public void makeTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    /**
	 * Finds the balance in the account at the start of the given date (any
	 * transactions on the specified date are not counted towards balance).
	 */
	public double getBalanceAt(SimpleDate date) {
		double balance = 0;
		for(int i = 0; i < transactions.size(); i++) {
			Transaction tr = transactions.get(i);
			if(tr.getDate().isGreaterThanOrEqualTo(date)) {
				break;
			}
			balance = balance + tr.getAmount();
		}
		return balance;
	}

	/**
	 * Gets a list of all transactions that occur in the date range of start -
	 * end (inclusive)
	 */
	public ArrayList<Transaction> getTransactionsInRange(SimpleDate start, SimpleDate end) {
		ArrayList<Transaction> results = new ArrayList<Transaction>();
		for(int i = 0; i < transactions.size(); i++) {
			Transaction tr = transactions.get(i);
			if(tr.getDate().isGreaterThanOrEqualTo(start) && tr.getDate().isLessThanOrEqualTo(end)) {
				results.add(tr);
			}
		}
		return results;
	}
	
	/**
	 * Create an invoice for the given date period
	 */
	public Invoice generateInvoice(SimpleDate startDate, SimpleDate endDate) {
		double startBalance = getBalanceAt(startDate);
		Invoice invoice = new Invoice(startBalance, startDate, endDate, this);
		return invoice;
	}
	
	/**
	 * Generate interest on the account according to the stored interest rate.
	 * Interest is assumed to be applied monthly, so the rate is divided by 12.
	 */
	public void gainInterest(SimpleDate date) {
		double balanceAtDate = getBalanceAt(date);
		double interest = balanceAtDate * (interestRate / 100 / 12);
		makeTransaction(new Transaction(date, "Account interest", interest));
	}
	
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public int getBsb() {
		return bsb;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account number: ").append(accountNumber).append("\n");
		sb.append("BSB: ").append(bsb).append("\n");
		sb.append("Interest rate: ").append(interestRate).append("%");
		return sb.toString();
	}





}