class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        for (int  i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)) {
                case 'G': result = result + "C"; break;
                case 'C': result = result + "G"; break;
                case 'T': result = result + "A"; break;
                case 'A': result = result + "U"; break;
            }
        }
        return result;
    }

}
