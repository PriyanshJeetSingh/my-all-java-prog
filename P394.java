import java.util.*;
public class P394{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int j = 0;
        int m[] = new int[5];
        int n[] = new int[5];
        int r[] = new int[10];

        System.out.println("Enter elemnts in array 1");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
            
        }

        System.out.println("Enter elemnts in array 2");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            
        }

        for (int i = 2; i < 12; i++) {
            if((i%2) == 0){
                r[j] = m[a];
                j++;
                a++;
            }else{
                r[j] = n[b];
                j++;
                b++;
            }
            
        }

        System.out.println("Array: ");
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
            
        }

    }
}