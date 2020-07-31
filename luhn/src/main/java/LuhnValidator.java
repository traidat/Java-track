import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

class LuhnValidator {

    boolean isValid(String candidate) {
        List<Integer> numbers = new ArrayList<>();
        candidate = candidate.replaceAll(" ", "");
        if (candidate.length() <= 1) {
            return false;
        }
        String reverseString = "";
        for (int i = candidate.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + candidate.charAt(i);
        }

        for (int i = 0; i < reverseString.length(); i++) {
            if (reverseString.charAt(i) >= '0' && reverseString.charAt(i) <= '9') {
                int number = Integer.parseInt(String.valueOf(reverseString.charAt(i)));
                if (i % 2 == 1) {
                    if (number >= 5) {
                        numbers.add(number * 2 - 9);
                    } else {
                        numbers.add(number * 2);
                    }
                } else {
                    numbers.add(number);
                }
            } else {
                return false;
            }
        }
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
