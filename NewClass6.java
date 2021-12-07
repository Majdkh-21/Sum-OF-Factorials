package as4qs1;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.print(" enter number :");
        int x = input.nextInt();
        int produ = 1;
        int sum = 0;
       for ( int i= x ;i > 0;i--) {
            for (int c = i; c > 0; c--) {
                produ *= c;

            }
            sum += produ;
                        produ = 1;

        }
        System.out.println("it is Equal = " + sum);

    }
}
