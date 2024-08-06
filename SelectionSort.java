import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int m[] = new int[10];
        int min,t;

        System.out.println("Enter Elements");
        for (int i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            min = i;

            for (int j = i+1; j < 10; j++) {
                if (m[j]<m[min]) {
                    min = j;
                }
            }
            t = m[i];
            m[i] = m[min];
            m[min] = t;
                
        }

        System.out.println("No in ascending order are");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }


    }
}
