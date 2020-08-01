import java.util.ArrayList;
import java.util.List;

class Sieve {
    private int maxPrime;
    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        if (this.maxPrime == 1) {
            return  primes;
        }
        boolean[] isPrime = new boolean[this.maxPrime + 1];
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= this.maxPrime; i++) {
            isPrime[i] = true;
        }
        for (int i = 2 ; i <= Math.sqrt(this.maxPrime); i++) {
            if (isPrime[i] == true) {
                for (int j = 2; j <= this.maxPrime / i; j++) {
                    isPrime[j * i] = false;
                }
            }
        }
        for (int i = 0; i <= this.maxPrime; i++) {
            if (isPrime[i] == true) {
                primes.add(i);
            }
        }
        return primes;
    }
}
