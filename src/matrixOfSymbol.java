import java.util.Scanner;

public class matrixOfSymbol {
    public static void main(String[] args){
        /*
        * Matrix Creator
        *   - This prog will make Matrix using a symbol
        *   - And the number of row and col will be taken from user
        *   - The symbol can also be chosen by user
        * */

        Scanner scan = new Scanner(System.in);
//        Declaring the variable
        int row;
        int col;
        char symbol;

        System.out.println("Enter the number of Row: ");
        row = scan.nextInt();

        System.out.println("Enter the number of Column: ");
        col = scan.nextInt();

        System.out.println("Enter your favourite Symbol: ");
        symbol = scan.next().charAt(0);
        // when we use char if we want to use .next()
        // then we have to write charAt(0) - this means
        // give me the character at 0 index

//        First for loop is for number of row
        for( int i = 0; i < row; i++){
            //      Create a for loop for col
            for (int j = 0; j < col; j++){
                System.out.print(symbol);

            }
            System.out.println();
        }



/*      // Also we can use the below code
        for( int i = 1; i <= row; i++){
            //      Create a for loop for col
            for (int j = 1; j <= col; j++){
                System.out.print(symbol);

            }
            System.out.println();
        }
*/




        scan.close();
    }
}
