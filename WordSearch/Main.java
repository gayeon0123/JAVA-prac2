package WordSearch;

public class Main {
    private Words words;
    private String[] searchWords;
    private int numOfSearchWords;

    public static void main(String[] args) {
        String[] searchWords = {"computers", "dog", "had"};
        Main program = new Main(searchWords);

        // test if searchWords contain any nouns
        for (String word : searchWords) {
            if (program.words.isNoun(word)) {
                System.out.println(word + " is a noun.");
            } else {
                System.out.println(word + " is not a noun.");
            }
        }

        // test if searchWords contain any verbs
        for (String word : searchWords) {
            if (program.words.isVerb(word)) {
                System.out.println(word + " is a verb.");
            } else {
                System.out.println(word + " is not a verb.");
            }
        }
    }

    public Main(String[] searchWords) {
        this.searchWords = searchWords;
        numOfSearchWords = searchWords.length;

        words = new Words();

        // add Nouns
        words.addNoun(new Noun("computer", "computers"));
        words.addNoun(new Noun("dog", "dogs"));
        words.addNoun(new Noun("cat", "cats"));

        // add Verbs
        words.addVerb(new Verb("have", "had", "had"));
        words.addVerb(new Verb("go", "went", "gone"));
        words.addVerb(new Verb("eat", "ate", "eaten"));

        // add Prepositions
        words.addPreposition("in");
        words.addPreposition("on");
        words.addPreposition("at");

        // add Conjunctions
        words.addConjunction("and");
        words.addConjunction("but");
        words.addConjunction("or");
    }

    private String trimSpecialCharAndSpace(String s) {
        return s.trim().replaceAll("[.,]", "");
    }

    private String[] splitWords(String line) {
        String[] words = line.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = trimSpecialCharAndSpace(words[i]);
        }

        return words;
    }
}

/*public class Main {
    private Words words;
    private String[] searchWords;
    private int numOfSearchWords;

    public static void main(String[] args) {
        String[] searchWords = {"computers", "dog", "had"};
        Main program = new Main(searchWords);

        // test if searchWords contain any nouns
        for (String word : searchWords) {
            if (program.words.isNoun(word)) {
                System.out.println(word + " is a noun.");
            } else {
                System.out.println(word + " is not a noun.");
            }
        }

        // test if searchWords contain any verbs
        for (String word : searchWords) {
            if (program.words.isVerb(word)) {
                System.out.println(word + " is a verb.");
            } else {
                System.out.println(word + " is not a verb.");
            }
        }
    }

    public Main(String[] searchWords) {
        this.searchWords = searchWords;
        numOfSearchWords = searchWords.length;

        words = new Words();

        // add Nouns
        words.addNoun(new Noun("computer", "computers"));
        words.addNoun(new Noun("dog", "dogs"));
        words.addNoun(new Noun("cat", "cats"));

        // add Verbs
        words.addVerb(new Verb("have", "had", "had"));
        words.addVerb(new Verb("go", "went", "gone"));
        words.addVerb(new Verb("eat", "ate", "eaten"));

        // add Prepositions
        words.addPreposition("in");
        words.addPreposition("on");
        words.addPreposition("at");

        // add Conjunctions
        words.addConjunction("and");
        words.addConjunction("but");
        words.addConjunction("or");
    }

    private String trimSpecialCharAndSpace(String s) {
        return s.trim().replaceAll("[.,]", "");
    }
}*/