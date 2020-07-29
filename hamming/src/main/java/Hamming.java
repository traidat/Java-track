public class Hamming {
    private String leffStand, rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        this.leffStand = leftStrand;
        this.rightStrand = rightStrand;

        if (this.leffStand.length() == 0 && this.rightStrand.length()!= 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (this.rightStrand.length() == 0 && this.leffStand.length() != 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (this.rightStrand.length() != this.leffStand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {

        int numberDifferent = 0;
        for (int i = 0; i < this.rightStrand.length(); i++) {
            if (this.rightStrand.charAt(i) != this.leffStand.charAt(i)) {
                numberDifferent++;
            }
        }
        return  numberDifferent;

    }
}
