
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShamimMSAS7
 */
public class MidPointLine6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a[] = new int[5];
        a[0] = x1;
        a[1] = y1;
        a[2] =(y2 - y1) + 2*(x2 - x1);
        int se = 2 * (y2 - y1) + 2 * (x2 - x1);
        int s = 2 * (x2 - x1);
        System.out.println("increment of se = "+se);
         System.out.println("increment of s = "+s);
        if (a[2] > 0) {
            a[3] = 1;
            a[4] = a[2] + se;
        } else {
            a[3] = 0;
            a[4] = a[2] + s;
        }
        System.out.println("x'          y'          D          S/SE        Dnew        x          y");
        System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
        if (a[3] == 0) {
            System.out.print("S          ");
        } else {
            System.out.print("SE          ");
        }
        System.out.println(a[4] + "          " + a[0] + "          " + a[1]);

        while (a[0] != x2 || a[1] != y2) {
            a[0]+=a[3];
            a[1]--;
            a[2] = a[4];
            if (a[2] > 0) {
                a[3] = 1;
                a[4] = a[2] + se;
            } else {
                a[3] = 0;
                a[4] = a[2] + s;
            }
            System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
            if (a[3] == 0) {
                System.out.print("E          ");
            } else {
                System.out.print("NE          ");
            }
            System.out.println(a[4] + "          " + a[0] + "          " + a[1]);
        }
    }
}
