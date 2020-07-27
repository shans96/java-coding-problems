package main.java.com.shanswanlow.codingproblems.strings;

import java.util.HashMap;

public class CountDuplicatesInString
{
    public static void main(String[] args)
    {
        System.out.println(countDuplicates("aaaaaa"));
    }

    private static int countDuplicates(String s)
    {
        HashMap<Character, Integer> stringChars = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            if (stringChars.get(current) != null)
            {
                stringChars.put(current, stringChars.get(current) + 1);
            }
            else
            {
                stringChars.put(current, 1);
            }
        }

        for (int value : stringChars.values())
        {
            count += value - 1;
        }

        return count;
    }
}
