package main.java.com.shanswanlow.codingproblems.strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength
{
    public static void main(String[] args)
    {
        System.out.println(
                Arrays.toString(sortByLength(new String[] { "quux", "baz", "a", "11"})));
    }

    private static String[] sortByLength(String[] a)
    {
        Arrays.sort(a, Comparator.comparing(s -> s.length()));
        return a;
    }
}
