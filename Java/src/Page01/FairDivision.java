/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShamimMSAS7
 */
import java.util.Scanner;

public class FairDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                a[i][0] += x;
                a[i][x]++;

            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i][0] % 2 != 0 || (a[i][2] % 2 != 0 && a[i][1] == 0)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
