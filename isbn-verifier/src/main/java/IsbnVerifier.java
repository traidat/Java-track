class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int total = 0;
        String convertString = stringToVerify.replaceAll("-", "");
        if (convertString.length() != 10) {
            return false;
        } else {
            for (int i = 0; i < 10; i++) {
                if ((convertString.charAt(i) >= '0' && convertString.charAt(i) <= '9')) {
                    total = total + (10 - i) * Integer.parseInt(String.valueOf(convertString.charAt(i)));
                } else if (convertString.charAt(i) == 'X') {
                    total = total + (10 - i) * 10;
                } else {
                    return false;
                }
            }
            if (total % 11 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

}
