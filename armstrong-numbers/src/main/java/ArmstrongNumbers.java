import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        List<Integer> arrayNumber = new ArrayList();
        int i = 0;
        int temp = numberToCheck;
        if (numberToCheck < 10)  return true;
        while (temp != 0) {
            arrayNumber.add(temp % 10);
            temp = temp / 10;
            i++;
        }
        int total = 0;
        int size = arrayNumber.size();
        for (int t : arrayNumber) {
            total = (int) (total + Math.pow(t, size));
        }
        if (total == numberToCheck) {
            return true;
        } else {
            return false;
        }

    }

}
