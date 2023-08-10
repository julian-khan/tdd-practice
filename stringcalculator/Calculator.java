

public class Calculator {
    private static int _getSum(String[] splitString) {
        int sum = 0;
        for (String comp : splitString) {
            if (comp == "")
                continue; 
            sum += Integer.parseInt(comp);
        }
        return sum;
    }

    public static int add(String input) {
        String delim;

        String[] newlineSplit = input.split("\n");
        delim = newlineSplit.length > 1 ? newlineSplit[0] : ",";

        String[] splitString;
        if (delim != ",") {
            splitString = newlineSplit[1].split(delim);
        } else {
            splitString = input.split(delim);
        }

        return _getSum(splitString);
    }
}