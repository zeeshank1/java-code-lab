package main.java.dev.zk.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneKeyLetterCombination {

    public static List<StringBuilder> letterCombinations(String digits) {

        int digitLength = digits.length( );

        List<StringBuilder> result = new ArrayList<>(digitLength * 3 + 1);
        Map<Character, String> keypad = Stream.of(new Object[][]{{'1', ""}, {'2', "abc"}, {'3', "def"}, {'4', "ghi"}, {'5', "jkl"}, {'6', "mno"}, {'7', "pqrs"}, {'8', "tuv"}, {'9', "wxyz"}}).collect(Collectors.toMap(data -> (Character) data[0], data -> (String) data[1]));

        if (digitLength == 0) {
            return result;
        } else if (digitLength == 1) {
            for ( char u : (keypad.get(digits.charAt(0))).toCharArray( ) ) {
                result.add(new StringBuilder(String.valueOf(u)));
            }
            return result;
        } else {
            //["2","3"]
            char[] digitsCharArray = digits.toCharArray( );

            // i=0 -> 2 and i=1 ->3
            for ( int digIndex = 0; digIndex < digitsCharArray.length; digIndex++ ) {
                String keypadVal = keypad.get(digitsCharArray[digIndex]);

                //['a','b','c']
                char[] keypadValChar = keypadVal.toCharArray( );
                System.out.println(keypadValChar);

                for ( int i = 0; i < keypadValChar.length; i++ ) {
                    char currentChar = keypadValChar[i];
                    System.out.println(">>>   "+currentChar);
                    if (digIndex == 0) {
                        for ( int g = 0; g < keypadValChar.length; g++ ) {
                            result.add(new StringBuilder(String.valueOf(currentChar)));
                        }
                    } else {
                        for ( int g = (i * keypadValChar.length); g < keypadValChar.length * (i + 1); g++ ) {
                            System.out.println(digIndex*g*keypadValChar.length +"  -  "+(i*keypadValChar.length) );
                            result.set(digIndex * g, result.get(digIndex * g).append(currentChar));
                            System.out.println("==================================" + result);
//                        result.add(result.get(i).append(item[i]));
                        }
                    }

                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                }
                System.out.println("..  .  . ..  ..  .   .   .   .   .   .    .        .      .    .      .    .");
            }

            return result;
        }
    }

    public static void main(String[] args) {
        //[a, b, c, d, e, f]
        //["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(letterCombinations("23"));
    }
}

