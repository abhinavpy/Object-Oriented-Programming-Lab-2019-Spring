public class SBI extends RBI {

    private int balance;
    private int interest;
    private int withdrawal;

    public SBI(int initialDeposit, int interest) {
        this.balance = initialDeposit;
        this.interest = interest;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public void makeWithdrawal(int withdrawal) {
        if(withdrawal > getMaxWithdrawalLimit()) {
            System.out.println("Exceeding max withdrawal limit\n");
        }
        else if(withdrawal > getBalance()) {
            System.out.println("Sufficient Balance not available\n");
        }
        else {
            int temp = getBalance();
            temp -= withdrawal;

            setBalance(temp);
            System.out.println("Your new balance is now:" + getBalance());
        }
    }

}
