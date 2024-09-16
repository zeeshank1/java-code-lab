package main.java.dev.zk.loops;

public class StarPatterns {

    public static void main(String[] args) {

        //Simple Pattern-1
        for ( int i = 1; i <= 3; i++ ) {

            for ( int j = 1; j < i + 1; j++ ) {

                System.out.print("* ");

            }
            System.out.println( );
        }

        System.out.println("------------------------------");

        //Reverse Star Pattern-2
        for ( int i = 1; i <= 3; i++ ) {

            for ( int j = 3; j > i - 1; j-- ) {

                System.out.print("* ");

            }
            System.out.println( );
        }

        System.out.println("------------------------------");

        //Special Star Pattern-3
        for ( int i = 1; i <= 3; i++ ) {

            for ( int j = 3; j > i - 1; j-- ) {
                System.out.print(" ");
            }

            for ( int k = 0; k < i; k++ ) {
                System.out.print("* ");
            }

            System.out.println( );
        }


    }
}
