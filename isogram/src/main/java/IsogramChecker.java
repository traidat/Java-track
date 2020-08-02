class IsogramChecker {

    boolean isIsogram(String phrase) {
        int size = phrase.length();
        String temp = phrase.toLowerCase();
        for (char c: temp.toCharArray()) {
            if (String.valueOf(c).matches("[a-z]")) {
                temp = temp.replaceAll("" + c, "");
                size--;
                if (temp.length() < size) {
                    return false;
                }
            }
        }
        return true;
    }

}
