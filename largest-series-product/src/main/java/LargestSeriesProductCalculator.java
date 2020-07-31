class LargestSeriesProductCalculator {
    private String input;

    LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.matches("[0-9]*")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        } else {
            input = inputNumber;
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > input.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } else if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        } else {
            long number = 1;
            long max = 0;
            for (int i = 0; i <= input.length() - numberOfDigits; i++) {
                for (int j = 0; j < numberOfDigits; j++) {
                    number = number *  Integer.parseInt(String.valueOf(input.charAt(i + j)));
                }
                if (max < number) {
                    max = number;
                }
                number = 1;
            }
            return max;
        }
    }
}
