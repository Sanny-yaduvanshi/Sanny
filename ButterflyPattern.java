public class ButterflyPattern {
    public static void main(String[] args) {
        System.out.println("Welcome to the Butterfly Pattern");
        int n = 6;

        // upper Pattern
        for(int i=1; i<=n; i++){

            // first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }

        // Lower Pattern
        for(int i=n; i>=1; i--){

            // first part 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    
}
