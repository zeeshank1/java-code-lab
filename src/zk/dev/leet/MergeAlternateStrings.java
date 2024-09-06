package zk.dev.leet;

public class MergeAlternateStrings {

    public static String mergeStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder( );

        char[] charArr1 = str1.toCharArray( );
        char[] charArr2 = str2.toCharArray( );
        int loopLength = Math.max(str1.length( ), str2.length( ));
        for ( int i = 0; i < loopLength; i++ ) {
            if(i < str1.length()) {
                result.append(charArr1[i]);
            }
            if(i < str2.length()) {
                result.append(charArr2[i]);
            }
        }

        return result.toString( );
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("ZEE","ABCDEF") );
        System.out.println(mergeStrings("ZEE","ABC") );
    }
}
