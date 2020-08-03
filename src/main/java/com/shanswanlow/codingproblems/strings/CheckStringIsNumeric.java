package main.java.com.shanswanlow.codingproblems.strings;

public class CheckStringIsNumeric
{
    public static void main(String[] args)
    {
        System.out.println(stringIsStrictlyNumeric("12345"));
        System.out.println(stringIsStrictlyNumeric("12345a"));
    }

    private static boolean stringIsStrictlyNumeric(String s)
    {
        return s.chars()
                .filter(i -> i < 48 || i > 57)
                .findFirst()
                .isEmpty();
    }
}
