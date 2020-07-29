class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return ((input * (input + 1)) / 2) * ((input * (input + 1)) / 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return this.computeSquareOfSumTo(input) - this.computeSumOfSquaresTo(input);
    }

}
