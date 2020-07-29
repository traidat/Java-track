import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Acronym {
    private  String phrase;

    Acronym(String phrase) {
        phrase = phrase.replaceAll("-", " ");
        phrase = phrase.replaceAll("_", " ");
        this.phrase = phrase;
    }

    String get() {
        List<String> words = new ArrayList<>();
        words = Arrays.asList(this.phrase.split("\\s+"));
        String acronym = "";
        for (String s : words) {
            if (s != " ") {
                acronym = acronym + (s.charAt(0));
            }
        }
        return acronym.toUpperCase();
    }

}
