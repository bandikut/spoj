package gyakorlas_spoj;

import java.util.Scanner;

/**
 *
 * @author hajdu.andrea
 */
public class CPTTRN3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        for (int a = 0; a < counter; a++) {
            int line = sc.nextInt();
            int coloumn = sc.nextInt();
            for (int i = 1; i <= 1 + (line * 3); i++) {
                for (int j = 1; j <= 1 + (coloumn * 3); j++) {
                    if (j % 3 == 1
                            || i % 3 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }

    }

}
