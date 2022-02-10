class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rna = new String("");

        for(int idx = 0 ; idx < dnaStrand.length() ; idx++) {
            char cur_char = dnaStrand.charAt(idx);
            switch(cur_char) {
                case 'G':
                    rna += "C";
                    break;
                case 'C':
                    rna += "G";
                    break;
                case 'T':
                    rna += "A";
                    break;
                case 'A':
                    rna += "U";
                    break;
            }
        }
        return rna;
    }

}
