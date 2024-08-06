import java.util.Scanner;

public class SumOfColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns");
        int columns = sc.nextInt();

        int m [][] = new int[rows][columns];

        System.out.println("Enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output");
        for (int j = 0; j < columns; j++) {
            int sumOfColumns = 0;
            for (int i = 0; i < rows; i++) {
                sumOfColumns+=m[i][j];
            }
            System.out.println("Sum of column" + (j+1)+ ": " + sumOfColumns);
        }

    }
}
