import java.util.Scanner;

public class SumOfRowsAndColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns");
        int columns = sc.nextInt();
        int m[][] = new int[rows][columns];
        int sumOfRows = 0,sumOfColumns = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                sumOfRows += m[i][j];
            }
        }
        // System.out.println("sum of rows:" + sumOfRows);

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                sumOfColumns += m[i][j];
            }
        }

        if (sumOfRows == sumOfColumns) {
            System.out.println("Yes, sum of rows is equals to sum of columns");
        }else{
            System.out.println("No, sum of rows is not equals to sum of columns");

        }

    }
}
