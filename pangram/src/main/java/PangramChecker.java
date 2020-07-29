import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> chars = new HashSet<>();
        String temp = input.toLowerCase();

        for (int  i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z')
            chars.add(temp.charAt(i));
        }
        if (chars.size() == 26) {
            return true;
        } else {
            return false;
        }
    }

}
