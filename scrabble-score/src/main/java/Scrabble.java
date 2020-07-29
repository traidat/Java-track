class Scrabble {
    private  String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;
        String temp = this.word.toLowerCase();
        String onePoint = new String("aeioulnrst");
        String twoPoint = new String("dg");
        String threePoint = new String("bcmp");
        String fourPoint = new String("fhvwy");
        String fivePoint = new String("k");
        String eightPoint = new String("jx");
        String tenPoint = new String("qz");

        for (int i = 0; i < temp.length(); i++) {
            String s = String.valueOf(temp.charAt(i));
            if (onePoint.contains(s)) {
                score = score + 1;
            } else if (twoPoint.contains(s)) {
                score = score + 2;
            } else if (threePoint.contains(s)) {
                score = score + 3;
            } else if (fourPoint.contains(s)) {
                score = score + 4;
            } else if (fivePoint.contains(s)) {
                score = score + 5;
            } else if (eightPoint.contains(s)) {
                score = score + 8;
            } else if (tenPoint.contains(s)) {
                score = score + 10;
            }
        }
        return score;
    }

}
