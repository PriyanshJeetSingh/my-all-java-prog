import java.util.*;
/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        int k = 0;
        int a;
        
        System.out.println("Enter elements in the array");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched");
        a = sc.nextInt();

        for (int i = 0; i < m.length; i++) {
            if (m[i] == a) {
                k = 1;
            }
        }

        if (k == 1) {
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is not present");
        }

    }
}