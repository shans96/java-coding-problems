package main.java.com.shanswanlow.codingproblems.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicatesInString
{
    public static void main(String[] args)
    {
        System.out.println(countDuplicates("aaaaaa"));
    }

    private static int countDuplicates(String s)
    {
        Map<Character, Long> stringChars = s
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        int count = 0;
        for (Long value : stringChars.values())
        {
            count += value - 1;
        }
        return count;
    }
}
