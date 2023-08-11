import java.util.HashMap;

interface BankInt {
    public int getRate(String currOne, String currTwo);
}

public class Bank implements BankInt {
    HashMap<Pair, Integer> rates = new HashMap<>();
    
    //        rates.put(new Pair(currOne, currTwo), rate);

    public int getRate(String currOne, String currTwo) {
        if (currOne.equals(currTwo))
            return 1;
            
        return 2;
    }

        public void addRate(String currOne, String currTwo, int rate) {
        }
}
