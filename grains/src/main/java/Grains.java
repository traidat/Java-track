import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger number = BigInteger.valueOf(2);

        if (square > 64 || square <= 0) {
           throw new IllegalArgumentException("square must be between 1 and 64");
        } else return number.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger number = BigInteger.valueOf(2);
        return number.pow(64).add(BigInteger.valueOf(-1));
    }

}
