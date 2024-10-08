package main.java.dev.zk.loops;

public class NestedLoopOne {

    public static void main(String[] args) {

        // Loop-1
        for ( int i = 0; i < 3; i++ ) {

            for ( int j = 0; j < 3; j++ ) {
                System.out.println(i + " " + j);
            }
            System.out.println( );
        }

        System.out.println("------------------------------");
        // Loop-2
        System.out.println("     j  j  j ");
        for ( int i = 0; i < 3; i++ ) {
            System.out.print( "i  [");
            for ( int j = 0; j < 3; j++ ) {

                System.out.print(" " + j+" ");
            }
            System.out.print("] ");
            System.out.println( );
        }

        System.out.println("------------------------------");
        // Loop-3
        // Please Note : Due to variable scope of int i and int j,
        // There is no problem int i declaration again since it is in inside for loop.
        for ( int i = 0; i < 3; i++ ) {

            for ( int j = 2; j >= 0; j-- ) {
                System.out.println(i + " " + j);
            }
            System.out.println( );
        }
    }
}
