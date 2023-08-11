import java.util.ArrayList;
import java.util.List;

public class Pair {
    public List<String> currencies = new ArrayList<String>();

    Pair(String currOne, String currTwo) {
        currencies.add(currOne);
        currencies.add(currTwo);
    }

    @Override
    public boolean equals(Object obj) {
        Pair objTwo = (Pair) obj;
        if (this.currencies.equals(objTwo.currencies))
            return true;

        return false;
    }
        
    @Override
    public int hashCode() {
        return 0;
    }    
}
