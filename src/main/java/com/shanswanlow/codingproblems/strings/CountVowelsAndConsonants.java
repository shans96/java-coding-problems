package main.java.com.shanswanlow.codingproblems.strings;

public class CountVowelsAndConsonants
{
    public static void main(String[] args)
    {
        System.out.println(countVowels("aeious"));
        System.out.println(countConsonants("aeious"));
    }

    private static int countVowels(String s)
    {
        return s
                .chars()
                .map(c -> isVowel(c) ? 1 : 0)
                .sum();
    }

    private static boolean isVowel(int c)
    {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }

    private static int countConsonants(String s)
    {
        return s.length() - countVowels(s);
    }
}
