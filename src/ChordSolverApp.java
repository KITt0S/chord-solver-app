public class ChordSolverApp {

    public static void main(String[] args) {

        double a = 1.0;
        double b = 2.0;
        double eps = 0.01;
        double x = a;
        int c = 1;
        while( true ) {

            System.out.print( "Iteration " + c++ + ": " );
            double tmp = getX( x, b );
            System.out.print( "x=" + tmp + "; " );
            double err = Math.abs( tmp - x );
            System.out.print( "err=" + err + "\n" );
            if( err < eps ) {

                break;
            } else {

                x = tmp;
            }
        }
    }

    private static double getF( double x ) {

        return Math.pow( x, 4 ) - 2 * x - 4;
    }

    private static double getX( double a, double b ) {

        return a - ( b - a ) * getF( a ) / ( getF( b ) - getF( a ) );
    }
}
