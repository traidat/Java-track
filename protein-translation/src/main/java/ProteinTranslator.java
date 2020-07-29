import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> translate = new ArrayList<>();
        Map<String, String> codons = new HashMap<>();
        codons.put("AUG", "Methionine");
        codons.put("UUU", "Phenylalanine");
        codons.put("UUC", "Phenylalanine");
        codons.put("UUA", "Leucine");
        codons.put("UUG", "Leucine");
        codons.put("UCU", "Serine");
        codons.put("UCA", "Serine");
        codons.put("UCG", "Serine");
        codons.put("UCC", "Serine");
        codons.put("UAU", "Tyrosine");
        codons.put("UAC", "Tyrosine");
        codons.put("UGU", "Cysteine");
        codons.put("UGC", "Cysteine");
        codons.put("UGG", "Tryptophan");
        codons.put("UAA", "STOP");
        codons.put("UAG", "STOP");
        codons.put("UGA", "STOP");

        Set<String> set = codons.keySet();
        for (int i = 0; i < rnaSequence.length() / 3; i++) {
            String rna = rnaSequence.substring(i * 3, i * 3 + 3);
            if (codons.containsKey(rna)) {
                String name = codons.get(rna);
                if (name.equals("STOP")) {
                    break;
                } else {
                    translate.add(name);
                }
            }
        }
        return translate;
    }
}
