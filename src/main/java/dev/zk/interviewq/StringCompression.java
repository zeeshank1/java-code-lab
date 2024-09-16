package main.java.dev.zk.interviewq;

//AAABBCDDAA--> A3B2CD2A2
public class StringCompression {
    public static String stringCompress(String inputStr) {
        StringBuilder sb = new StringBuilder( );
        char[] inputStrArr = inputStr.toCharArray( );

        int loopStarter = 0;
        for ( int i = loopStarter; i < inputStrArr.length; i++ ) {

            char currentChar = inputStrArr[loopStarter];
            int count = 0;

            for ( int k = loopStarter; k < inputStrArr.length; k++ ) {
                if (currentChar == inputStrArr[k]) {
                    count++;
                    if (k == inputStrArr.length - 1) {
                        sb.append(currentChar).append(count);
                        return sb.toString( );
                    }
                } else {
                    sb.append(currentChar).append(count);
                    loopStarter = count + loopStarter;
                    break;
                }
            }
        }

        return sb.toString( );
    }

    public static void main(String[] args) {
        System.out.println(stringCompress("ABAA"));
    }
}
