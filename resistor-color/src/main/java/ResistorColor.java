class ResistorColor {
    int colorCode(String color) {
        ResistorColor resistorColor = new ResistorColor();
        int colorCode = 0;
        for (int i = 0; i < 10; i++) {
            if (color.equals(resistorColor.colors()[i])) {
                colorCode = i;
            }
        }
        return colorCode;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
