class Yacht {
    private int[] dices;
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dices = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        int score = 0;
        switch (this.yachtCategory) {
            case ONES: {
                for (int i : dices) {
                    if (i == 1) {
                        score = score + 1;
                    }
                }
            } break;
            case TWOS: {
                for (int i : dices) {
                    if (i == 2) {
                        score = score + 2;
                    }
                }
            } break;
            case THREES: {
                for (int i : dices) {
                    if (i == 3) {
                        score = score + 3;
                    }
                }
            } break;
            case FOURS: {
                for (int i : dices) {
                    if (i == 4) {
                        score = score + 4;
                    }
                }
            } break;
            case FIVES: {
                for (int i : dices) {
                    if (i == 5) {
                        score = score + 5;
                    }
                }
            } break;
            case SIXES: {
                for (int i : dices) {
                    if (i == 6) {
                        score = score + 6;
                    }
                }
            } break;
            case FULL_HOUSE: {
                int [][] temp = {{1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6, 0}};
                for (int i : dices) {
                    temp[i - 1][1] = temp[i - 1][1] + 1;
                }

                for (int i = 0; i < 6; i++) {
                    if (temp[i][1] == 4 || temp[i][1] == 1 || temp[i][1] == 5) {
                        score = 0;
                        break;
                    } else {
                        score = score + (i + 1) * temp[i][1];
                    }
                }
            } break;
            case FOUR_OF_A_KIND: {
                int [][] temp = {{1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6, 0}};
                for (int i : dices) {
                    temp[i - 1][1] = temp[i - 1][1] + 1;
                }

                for (int i = 0; i < 6; i++) {
                    if (temp[i][1] == 4 || temp[i][1] == 5) {
                        score = score + (i + 1) * 4;
                        break;
                    }
                }
            } break;
            case LITTLE_STRAIGHT: {
                int [][] temp = {{1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6, 0}};
                for (int i : dices) {
                    temp[i - 1][1] = temp[i - 1][1] + 1;
                }

                if (temp[0][1] != 0 && temp[1][1] != 0 && temp[2][1] != 0
                        && temp[3][1] != 0 && temp[4][1] != 0) {
                    score = 30;
                }
            } break;
            case BIG_STRAIGHT: {
                int [][] temp = {{1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6, 0}};
                for (int i : dices) {
                    temp[i - 1][1] = temp[i - 1][1] + 1;
                }

                if (temp[5][1] != 0 && temp[1][1] != 0 && temp[2][1] != 0
                        && temp[3][1] != 0 && temp[4][1] != 0) {
                    score = 30;
                }
            } break;
            case CHOICE: {
                for (int i : dices) {
                    score = score + i;
                }
            } break;
            case YACHT: {
                int [][] temp = {{1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6, 0}};
                for (int i : dices) {
                    temp[i - 1][1] = temp[i - 1][1] + 1;
                }

                for (int i = 0; i < 6; i++) {
                    if (temp[i][1] == 5) {
                        score = 50;
                        break;
                    }
                }
            } break;
        }
        return score;
    }

}
