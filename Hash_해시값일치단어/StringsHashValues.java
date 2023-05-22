package 과제.Hash_해시값일치단어;

public class StringsHashValues {

    private HashWord[] words;

    public StringsHashValues(String str) {
        String[] sarr = str.split(" ");

        int count = 0;
        for (int i = 0; i < sarr.length; i++) {
            if (!sarr[i].equals(" ")) {
                count++;
            }
        }

        words = new HashWord[count];
        int wordsldx = 0;
        for (int i = 0; i < sarr.length; i++) {
            if (!sarr[i].equals(" ")) {
                words[wordsldx] = new HashWord(sarr[i]);
                wordsldx++;
            }
        }
    }

    public void printWordsWithSameHash(String s) {

        HashWord h = new HashWord(s);
        System.out.printf("hash: %d\n", h.getHash());

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(h)) {
                System.out.printf("%s:%d\n", words[i].getWord(), words[i].getHash());
            }
        }
    }

    public static void main(String[] args) {
        String s = "In blandit lacus ac sapien dictum, elementum "
                + "fringilla sem varius. Vestibulum consectetur "
                + "metus at felis porttitor, a rhoncus neque "
                + "consectetur. Integer  vehicula felis non metus "
                + "eleifend, in blandit risus ullamcorper. Phasellus "
                + "mauris nisi, facilisis et quam placerat, congue "
                + "venenatis diam. Praesent in erat odio. Phasellus "
                + "sit amet efficitur sem. Ut quis mi venenatis, "
                + "feugiat justo eu,  rhoncus velit. Suspendisse "
                + "iaculis tempus sapien. Integer mauris neque, "
                + "posuere sed mi at, aliquet facilisis nibh. Cras "
                + "vel blandit lorem. Aliquam suscipit, nisl id "
                + "condimentum condimentum, purus magna maximus "
                + "sem, vitae vehicula diam nisi ac enim.";

        StringsHashValues values = new StringsHashValues(s);
        System.out.println("Aliquam");
        values.printWordsWithSameHash("Aliquam");
        System.out.println("posuere");
        values.printWordsWithSameHash("posuere");
    }

}
