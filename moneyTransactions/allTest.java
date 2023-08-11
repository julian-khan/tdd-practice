import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class allTest {


    @Test
    public void testGetAmount() {
        Money money = new Money(10, "AUD");
        assertEquals(10, money.getAmount());
    }

    @Test
    public void testAddMoney() {
        Money sum = new Money(5, "AUD").add(new Money(3, "AUD"), new Bank());
        assertEquals(8, sum.getAmount());
    }

    @Test
    public void testGetCurrency() {
        assertEquals("AUD", new Money(5, "AUD").getCurrency());
    }

    @Test
    public void testAddWithSameCurrency() {
        Bank bank = new Bank();
        Money moneyOne = new Money(5, "AUD");
        Money moneyTwo = new Money(10, "AUD");

        Money sum = moneyOne.add(moneyTwo, bank);
        assertEquals(new Money(15, "AUD").getAmount(), sum.getAmount());
    }

    @Test 
    public void testAddWithDifferentCurrency() {
        Money moneyTwo = new Money(10, "AUD");
        Money moneyOne = new Money(5, "USD");

        Bank bank = new Bank();
        bank.addRate("AUD", "USD", 4);
        bank.addRate("USD", "AUD", 2);

        Money sumOne = moneyOne.add(moneyTwo, bank);
        Money sumTwo = moneyTwo.add(moneyOne, bank);

        assertEquals(10, sumOne.getAmount());
        assertEquals(15, sumTwo.getAmount());


    }

    @Test
    public void testGetRate() {
        Bank bank = new Bank();
        bank.addRate("AUD", "USD", 2);
        assertEquals(2, bank.getRate("AUD", "USD"));
    }

    //need to handle decimal conversion factors between currencies -
        // convert to double instead of int for currency conversion factors?

    
}
