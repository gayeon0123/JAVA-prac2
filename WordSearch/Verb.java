package WordSearch;

class Verb {
    private String base;
    private String past;
    private String pastParticiple;

    public Verb(String base, String past, String pastParticiple) {
        this.base = base.toLowerCase();
        this.past = past.toLowerCase();
        this.pastParticiple = pastParticiple.toLowerCase();
    }

    public boolean isVerb(String word) {
        String w = word.toLowerCase();
        return w.equals(base) || w.equals(past) || w.equals(pastParticiple);
    }

    public String toString() {
        return base + "/" + past + "/" + pastParticiple;
    }
}
