package zk.dev.leet;

import java.util.Arrays;

public class LongestCommonStringPrefix {

    private static String longestPrefixFromStringArray(String[] strarr) {
        StringBuilder sb = new StringBuilder( );
        Arrays.sort(strarr);

        String firstWord = strarr[0];
        String lastWord = strarr[strarr.length - 1];
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
