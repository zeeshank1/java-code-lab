package main.java.dev.zk.leet;

import java.util.Arrays;

public class LongestCommonStringPrefix {

    public static String longestPrefixFromStringArray(String[] strs) {
        StringBuilder sb = new StringBuilder( );
        Arrays.sort(strs);

        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];
        int loopLength = Math.min(firstWord.length( ), lastWord.length( ));
        for ( int i = 0; i < loopLength; i++ ) {
            if (firstWord.charAt(i) != lastWord.charAt(i)) {
                return sb.toString( );
            }
            sb.append(firstWord.charAt(i));
        }
        return sb.toString( );
    }

    public static void main(String[] args) {
//        String[] inputArray_testcase_1 = {"flower","flow","fluid"};
//        String result = longestPrefixFromStringArray(inputArray_testcase_1);

        String[] inputArray_testcase_2 = {"dog","warcars","car"};
        String result2 = longestPrefixFromStringArray(inputArray_testcase_2);
    }
}
