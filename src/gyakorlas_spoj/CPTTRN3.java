/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

            if (line < 2) {
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        if ((i == 1 || j == 1 || i == 4 || j == 4)) {
                            System.out.print("*");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println("");
                }
            } else {
                for (int i = 1; i <= 1 + (line * 3); i++) {
                    for (int j = 1; j <= 1 + (coloumn * 3); j++) {
                        if (i == 1
                                || j == 1
                                || i == 1 + (line * 3)
                                || j == 1 + (coloumn * 3)
                                || j == 1 + (coloumn * 3)) {
                            System.out.print("*");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println("");
                }

            }
        }

    }

}
