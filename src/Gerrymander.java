import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jason on 1/28/16.
 */
public class Gerrymander {

    int[][] multi;

    public Gerrymander(int row, int column) {

        this.multi = new int[row][column];

    }

    /**
      public int countDistrictsRecursive(){
     *
     *
     * >
     * }
     * <p>
     * public int countDistrictsIterative(){
     * <p>
     * <p>
     * <p>
     * }
     **/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to perform a method.");

        System.out.println("Enter 1 for the countDistrictsRecursive method");

        System.out.println("Enter 2 for the countDistrictsIterative method");

        int method = scan.nextInt();

        if (method == 1) {
            System.out.println("Please enter the number of rows.");
            int row = scan.nextInt();

            System.out.println("Please enter the number of columns.");
            int columns = scan.nextInt();

            Gerrymander gerry = new Gerrymander(row, columns);

            System.out.println("Please enter an index position to put value in array");

            int num = scan.nextInt();
            int insertRow = num/columns;
            int insertColumn = num%columns;

            gerry.multi[insertRow][insertColumn] = 1;
            System.out.println(Arrays.deepToString(gerry.multi));

            }





        if (method == 2) {
            System.out.println("Please enter the number of rows.");
            int row = scan.nextInt();

            System.out.println("Please enter the number of columns.");
            int columns = scan.nextInt();
        }

    }
}


