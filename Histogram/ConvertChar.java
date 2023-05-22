package Histogram;

public class ConvertChar {
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch - 'A' + 'a');
        }
        return ch;
    }

    public static char toUpperCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char)(ch - 'a' + 'A');
        }
        return ch;
    }
}