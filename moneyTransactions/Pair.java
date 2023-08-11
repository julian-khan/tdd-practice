import java.util.ArrayList;
import java.util.List;

public class Pair {
    public ArrayList<String> currencies = new ArrayList<String>();

    Pair(String currOne, String currTwo) {
        currencies.add(currOne);
        currencies.add(currTwo);
    }

    public boolean equals(Pair obj) {

        if (this.currencies.equals(obj.currencies))
            return true;

        // for (int i = 0; i < this.currencies.size(); i++) {
        //     if (this.currencies.indexOf(i) != obj.currencies.indexOf(i)) {
        //         return false;
        //     }
            return false;
        }
    

    public int hashCode() {
        return 0;
    }    
}
