import java.util.*;

class SumOfMultiples {
    private int number;
    private int [] set;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        Set<Integer> factors = new HashSet<>();
        for (int i = 0; i < this.set.length; i++) {
            if (set[i] !=  0) {
                for (int j = 1; j < number; j++) {
                    if (j % set[i] == 0) {
                        factors.add(j);
                    }
                }
            }
        }
        int sum = 0;
        for (int i : factors) {
            sum = sum + i;
        }
        return sum;
    }

}
