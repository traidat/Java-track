class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException();
        } else {
            int count = 0;
            int prime = 1;
            while (count != nth) {
                boolean isPrime = false;
                prime++;
                for (int i = 2; i <= Math.sqrt(prime); i++) {
                    if (prime % i == 0) {
                        isPrime = true;
                    }
                }
                if (!isPrime) {
                    count++;
                }
            }
            return prime;
        }
    }

}
