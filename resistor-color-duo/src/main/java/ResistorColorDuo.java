class ResistorColorDuo {
    int value(String[] colors) {
        String value = "";
        for (int i = 0; i < 2; i++) {
            switch (colors[i]) {
                case "black": value = value + "0"; break;
                case "brown": value = value + "1"; break;
                case "red": value = value + "2"; break;
                case "orange": value = value + "3"; break;
                case "yellow": value = value + "4"; break;
                case "green": value = value + "5"; break;
                case "blue": value = value + "6"; break;
                case "violet": value = value + "7"; break;
                case "grey": value = value + "8"; break;
                case "white": value = value + "9"; break;
            }
        }
        return Integer.parseInt(value);
    }
}
