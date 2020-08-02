import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();

    List<String> printToList(char a) {
        List<String> result = new ArrayList<String>();
        int charIndex = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == a) {
                charIndex = i;
                break;
            }
        }
        for (int i = 0; i <= charIndex; i++) {
            String line = "";
            for (int j = 0; j < 2 * charIndex + 1; j++) {
                if (j == charIndex - i || j == charIndex + i) {
                    line += Character.toString(alphabet[i]);
                } else {
                    line += " ";
                }
            }
            result.add(line);
        }
        for (int i = result.size() - 2; i >= 0; i--) {
            result.add(result.get(i));
        }

        return result;
    }

}
