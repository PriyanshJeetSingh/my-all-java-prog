import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        int t;

        System.out.println("enter elements");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < (9-i); j++) {
                if (m[j]>m[j+1]) {
                    t = m[j];
                    m[j] = m[j+1];
                    m[j+1] = t;
                }
            }
        }
        System.out.println("Ascending order");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }

    }
}
