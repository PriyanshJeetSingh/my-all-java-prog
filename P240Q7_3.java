import java.util.*;
public class P240Q7_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m[] = new int[10];
        int n[] = new int[10];
        int j = 0;
        
        System.out.println("Enter elements");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
            
        }

        //for negative
        for (int i = 0; i < 10; i++) {
            if (m[i]<0) {
                n[j] = m[i];
                j++;
            }
            
        }

        //for positive
        for (int i = 0; i < 10; i++) {
            if(m[i]>0){
                n[j] = m[i];
                j++;
            }

        }

        //print
        System.out.println("Array: ");
        for (int i = 0; i < j; i++) {
            System.out.println(n[i]);

        }
        
    }
}
