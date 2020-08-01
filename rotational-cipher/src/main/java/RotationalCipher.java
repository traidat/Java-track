import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class RotationalCipher {
    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> alphabets = Arrays.asList(alphabet);
        String[] alphabetUpperCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        List<String> alphabetsUpperCae = Arrays.asList(alphabetUpperCase);
        String cipher = "";
        for (int i = 0; i < data.length(); i++) {
            String temp = String.valueOf(data.charAt(i));
            if (alphabets.contains(temp)) {
                int index = (int) data.charAt(i) + this.shiftKey % 26;
                if ((index > 122)) {
                    index = index - 26;
                }
                cipher = cipher + (char) index;
            } else if  (alphabetsUpperCae.contains(temp)) {
                int index = (int) data.charAt(i) + this.shiftKey % 26;
                if ((index > 90)) {
                    index = index - 26;
                }
                cipher = cipher + (char) index;
            } else {
                cipher = cipher + temp;
            }

        }
        return cipher;
    }

}
