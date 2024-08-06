import java.util.Scanner;

public class firstAnd2ndGreatest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int m[] = new int[10];
        int greatest = 0, secondGreatest = 0;

        System.out.println("Enter Elements");
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(m[i]>m[i-1]){
                greatest = m[i];
            }

            if ((m[i]<m[i-1]&&(m[i]<greatest))) {
                secondGreatest = m[i];
                
            }
        }

        System.out.println("Greatest: " + greatest);
        System.out.println("Second Greatest: " + secondGreatest);

    }
    
}