class RaindropConverter {

    String convert(int number) {
        String convert = "";

        if (number % 3 == 0) {
            convert = convert + "Pling";
        }
        if (number % 5 == 0) {
            convert = convert + "Plang";
        }
        if (number % 7 == 0) {
            convert = convert + "Plong";
        }
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            convert = convert + String.valueOf(number);
        }
        return convert;

    }

}
