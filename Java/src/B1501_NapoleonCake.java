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

public class B1501_NapoleonCake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[i] = new int[x];
            for (int j = 0; j < x; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = a[i].length - 1; j >= 0; j--) {
                if (a[i][j] > max) {
                    max = a[i][j] - 1;
                    a[i][j] = 1;
                } else if (max > 0) {
                    max--;
                    a[i][j] = 1;
                }
            }
        }
        String str="";
        for (int i = 0; i < n; i++) {
            for (int j : a[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
