package main.java.com.shanswanlow.codingproblems.strings;

public class CountCharOccurrences
{
    public static void main(String[] args)
    {
        System.out.println(countCharOccurrences("foo", 'o'));
        System.out.println(countCharOccurrences("bar", 'b'));
        System.out.println(countCharOccurrences("aaaaa", 'a'));
        System.out.println(countCharOccurrences("aaaaa", 'b'));
    }

    private static long countCharOccurrences(String s, char searchChar)
    {
        return s.chars()
                .filter(c -> c == searchChar)
                .count();
    }
}
