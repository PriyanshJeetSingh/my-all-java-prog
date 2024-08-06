import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m[] = new int[10];
        int lb = 0, ub = 9;
        int p = 0;
        int k = 0;
        int n;

        System.out.println("Enter elements in ascending order");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched");
        n = sc.nextInt();

        while (lb<=ub) {
            p = (lb+ub)/2;
            if (m[p]<n) {
                lb = p+1;
                
            }

            if (m[p]>n) {
                ub = p-1;
            }

            if (m[p] == n) {
                k++;
                break;
            }
        }

        if (k==1) {
            System.out.println("Element is present");

        } else {
            System.out.println("Element not is present");

        }


    }
}
