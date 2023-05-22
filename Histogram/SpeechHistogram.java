package Histogram;

public class SpeechHistogram {
    private Speech speech;
    private int[] counts;

    public SpeechHistogram(Speech speech) {
        this.speech = speech;
        this.counts = new int[26];

        for (String word : speech.getWords()) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            if (firstChar >= 'a' && firstChar <= 'z') {
                counts[firstChar - 'a']++;
            }
        }
    }


    public int[] getCounts() {
        return counts;
    }

    public void print() {
        for (int i = 0; i < counts.length; i++) {
            char c = (char) ('a' + i);
            System.out.print(c + ": ");
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*package Histogram;

public class SpeechHistogram {
    private Speech speech;
    private int[] counts;

    public SpeechHistogram(Speech speech) {
        this.speech = speech;
        this.counts = new int[26];

        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        for (String word : speech.getWords()) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            if (firstChar >= 'a' && firstChar <= 'z') {
                counts[firstChar - 'a']++;
            }
        }
    }

    public int[] getCounts() {
        return counts;
    }

    public void print() {
        for (int i = 0; i < counts.length; i++) {
            char c = (char) ('a' + i);
            System.out.print(c + ": ");
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
