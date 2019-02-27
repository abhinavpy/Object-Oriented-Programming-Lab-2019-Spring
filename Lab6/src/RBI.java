public class RBI {
    private int minimumInterestRate = 8;
    private int minimumBalance = 1000;
    private int maxWithdrawalLimit = 100;

    public int getMinimumInterestRate() {
        return minimumInterestRate;
    }

    public void setMinimumInterestRate(int minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(int maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }
}
