import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binaryString = Integer.toBinaryString(number);
        String reverseString = "";
        for (int i = binaryString.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + binaryString.charAt(i);
        }

        List<Signal> signals = new ArrayList<>();
        if (reverseString == "") {
            return signals;
        }
        if (reverseString.charAt(0) == '1') {
            signals.add(Signal.WINK);
        }
        if (reverseString.length() >= 2 && reverseString.charAt(1) == '1') {
            signals.add(Signal.DOUBLE_BLINK);
        }
        if (reverseString.length() >= 3 && reverseString.charAt(2) == '1') {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if (reverseString.length() >= 4 && reverseString.charAt(3) == '1') {
            signals.add(Signal.JUMP);
        }
        if (number < 16) {
            return signals;
        } else {
            List<Signal> signalsReverse = new ArrayList<>();
            for (int i = signals.size() - 1; i >= 0; i--) {
                signalsReverse.add(signals.get(i));
            }
            return signalsReverse;
        }
    }

}
