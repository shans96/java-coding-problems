package main.java.com.shanswanlow.codingproblems.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStringsWithDelimiter
{
    public static void main(String[] args) {
        System.out.println(joinWithDelimiter(" ", "foo", "bar"));
        System.out.println(joinWithDelimiter("\n", "baz", "quux", "quuux"));
    }

    private static String joinWithDelimiter(String delimiter, String... args)
    {
        return Arrays.stream(args)
                .collect(Collectors.joining(delimiter));
    }
}
