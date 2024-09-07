package zk.dev.interviewq;

/*
Write a dynamic java program to find sum of the index number of all special characters present in the string.

Input-1 :  M@ngo@Banana#Apple$Grapes%$
Output-1:  [1, 5, 12, 18, 25, 26] => 87
*/

public class FindSpCharInStr {

    public static int sumIndex (char[] input){

        int sum = 0;
        for( int i = 0; i < input.length; i++ ) {
            int asciiVal = (int)input[i];
            if(!((asciiVal >= 65) && (asciiVal <= 122))){
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String inputStr = "M@ngo@Banana#Apple$Grapes%$";
        char[] charArry = inputStr.toCharArray( );

        System.out.println(sumIndex(charArry) );

    }
}
