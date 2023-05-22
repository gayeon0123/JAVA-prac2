package WordSearch;

class Noun {
    private String singular;
    private String plural;

    public Noun(String singular, String plural) {
        this.singular = singular.toLowerCase();
        this.plural = plural.toLowerCase();
    }

    public boolean isNoun(String word) {
        String w = word.toLowerCase();
        return w.equals(singular) || w.equals(plural);
    }

    public String toString() {
        return singular + "/" + plural;
    }
}
