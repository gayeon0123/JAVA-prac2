package 과제.Hash_해시값일치단어;

public class HashWord {

    String s;
    int hash;

    public HashWord(String word) {
        this.s = word;
        this.hash = calcHash();
    }

    public String getWord() {
        return s;
    }

    public int getHash()
    {
        return hash;
    }

    public boolean equals(HashWord word) {
        return hash == word.getHash();
    }

    private int calcHash() {
        int hash = 0;
        int n = s.length() - 1;

        for(int i = 0; i < s.length() - 1; i++, n--) {
            hash += (s.charAt(i) * (int)Math.pow(31,n));
        }
        return hash %s.length();
    }
}
