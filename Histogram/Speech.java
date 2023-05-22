package Histogram;

class Speech {
    private String[] speech;
    private String[] words;

    public Speech(String[] speech) {
        this.speech = new String[speech.length];
        for (int i = 0; i < speech.length; i++) {
            this.speech[i] = speech[i];
        }
    }

    public String getFirstCharOfWord(int idx) {
        if (idx >= 0 && idx < speech.length) {
            String word = speech[idx];
            return word.substring(0, 1).toLowerCase();
        } else {
            return null;
        }
    }

    public int getNumOfWords() {
        return speech.length;
    }

    public String[] getWords() {
        return words;
    }
}
