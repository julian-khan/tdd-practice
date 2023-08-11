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
        Money sum = new Money(5, "AUD").add(new Money(3, "AUD"));
        assertEquals(8, sum.getAmount());
    }

    @Test
    public void testGetCurrency() {
        assertEquals("AUD", new Money(5, "AUD").getCurrency());
    }

    @Test
    public void testAddWithSameCurrency() {
        Money moneyOne = new Money(5, "AUD");
        Money moneyTwo = new Money(10, "AUD");

        Money sum = moneyOne.add(moneyTwo);
        assertEquals(new Money(15, "AUD").getAmount(), sum.getAmount());
    }

    @Test 
    public void testAddWithDifferentCurrency() {
        Money moneyTwo = new Money(10, "AUD");
        Money moneyOne = new Money(5, "USD");

        Bank bank = new Bank();
        bank.addRate("AUD", "USD", 2);

        Money sum = moneyOne.add(moneyTwo);

        assertEquals(10, sum.getAmount());
    }

    
}
