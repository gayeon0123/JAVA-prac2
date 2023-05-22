package WordSearch;

import java.util.ArrayList;
import java.util.List;

class Words {
    private List<Noun> nouns;
    private List<Verb> verbs;
    private List<String> prepositions;
    private List<String> conjunctions;

    public Words() {
        nouns = new ArrayList<>();
        verbs = new ArrayList<>();
        prepositions = new ArrayList<>();
        conjunctions = new ArrayList<>();
    }

    public void addNoun(Noun noun) {
        nouns.add(noun);
    }

    public void addVerb(Verb verb) {
        verbs.add(verb);
    }

    public void addPreposition(String preposition) {
        prepositions.add(preposition.toLowerCase());
    }

    public void addConjunction(String conjunction) {
        conjunctions.add(conjunction.toLowerCase());
    }

    public boolean isNoun(String word) {
        for (Noun noun : nouns) {
            if (noun.isNoun(word)) {
                return true;
            }
        }
        return false;
    }

    public boolean isVerb(String word) {
        for (Verb verb : verbs) {
            if (verb.isVerb(word)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPreposition(String word) {
        return prepositions.contains(word.toLowerCase());
    }

    public boolean isConjunction(String word) {
        return conjunctions.contains(word.toLowerCase());
    }
}
