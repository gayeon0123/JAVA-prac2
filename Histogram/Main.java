package Histogram;

public class Main {
    public static void main(String[] args) {
        String[] words = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog", "Apple", "Ball", "Cat", "Dog", "Egg", "Fish", "Giraffe", "Hat", "Ink", "Jungle", "King", "Lion", "Man", "Noodle", "Orange", "Peach", "Queen", "Rat", "Sausage", "Tomato", "Umbrella", "Violin", "Watch", "Xylophone", "Yellow", "Zoo"};

        Speech speech = new Speech(words);
        SpeechHistogram speechHistogram = new SpeechHistogram(speech);

        // print number of words starting with 'a' and 'b'
        int[] counts = speechHistogram.getCounts();
        System.out.println("Number of words starting with 'a': " + counts[0]);
        System.out.println("Number of words starting with 'b': " + counts[1]);

        // print histogram of word counts grouped by first letter of word
        speechHistogram.print();
    }
}
