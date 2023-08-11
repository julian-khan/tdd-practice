public class Money {
    String currency;
    int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public Money add(Money money) {
        BankInt bank = new Bank();
        int rate = bank.getRate(this.currency, money.currency);

        int newAmount = amount + money.getAmount()/rate;
        return new Money(newAmount, this.currency);
    }

    public String getCurrency() {
        return currency;
    }

}