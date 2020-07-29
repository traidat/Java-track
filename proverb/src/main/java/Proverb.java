class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String recite = "";
        if (this.words.length == 1) {
            recite = recite + String.format("And all for the want of a %s.", this.words[0]);
        } else if (this.words.length > 1) {
            for (int i = 0; i < this.words.length - 1; i++) {
                recite = recite + String.format("For want of a %s the %s was lost.\n", this.words[i], this.words[i + 1]);
            }
            recite = recite + String.format("And all for the want of a %s.", this.words[0]);
        }
        return recite;
    }

}
