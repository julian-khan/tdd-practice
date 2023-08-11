import java.util.HashMap;
import java.util.List;

interface BankInt {
    public int getRate(String currOne, String currTwo);

    public void addRate(String currOne, String currTwo, int rate);
}

public class Bank implements BankInt {
    HashMap<Pair, Integer> rates = new HashMap<Pair, Integer>();
    
    //        rates.put(new Pair(currOne, currTwo), rate);

    public int getRate(String currOne, String currTwo) {

        if (currOne.equals(currTwo))
            return 1;
            
        return rates.get(new Pair(currOne, currTwo));
    }

    public void addRate(String currOne, String currTwo, int rate) {
        rates.put(new Pair(currOne, currTwo), (Integer) rate);
    }
    

}
