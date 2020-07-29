import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class NaturalNumber {
    private int number;
    private Classification classification;

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= this.number / 2; i++) {
            if (this.number % i == 0) {
                factors.add(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < factors.size(); i++) {
            sum = sum + factors.get(i);
        }
        if (sum == this.number) {
            this.classification = Classification.PERFECT;
        } else if (sum < this.number) {
            this.classification = Classification.DEFICIENT;
        } else {
            this.classification = Classification.ABUNDANT;
        }

        return this.classification;
    }
}
