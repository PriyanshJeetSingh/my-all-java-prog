import java.util.Scanner;

public class sumOfRows {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns");
        int columns = sc.nextInt();

        int m[][] = new int[rows][columns];

        System.out.println("Enter Elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output: ");

        for (int i = 0; i < rows; i++) {
            int sumRow = 0; 
            for (int j = 0; j < columns; j++) {
                sumRow = sumRow + m[i][j];
            }
            System.out.println("Sum of row " + (i+1) + ": " +sumRow);
        }



    }
}
