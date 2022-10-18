
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
public class MidPointCircle6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = sc.nextInt();
        System.out.println("enter the coordinates");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[] = new int[5];
        a[0] = 0;
        a[1] = (-1)*r;
        a[2] = 1 - r;
        if (a[2] < 0) {
            a[3] = 0;
        } else {
            a[3] = 1;
        }
        if (a[3] == 0) {
            a[4] = a[2] + 2 * a[0] + 3;
        } else {
            a[4] = a[2] + 2 * a[0] + 2 * a[1] + 5;
        }
        System.out.println("x'          y'          D          E/NE        Dnew        SCx        SCy          x          y");
        System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
        if (a[3] == 0) {
            System.out.print("E          ");
        } else {
            System.out.print("NE          ");
        }
        System.out.println(a[4] + "          " + a[0] + "          " + a[1] + "          " + a[0] + "          " + a[1]);

        while (a[0] < (-1)*a[1]) {
            a[0]++;

            a[1] += a[3];
            a[2] = a[4];
            if (a[2] < 0) {
                a[3] = 0;
            } else {
                a[3] = 1;
            }
            if (a[3] == 0) {
                a[4] = a[2] + 2 * a[0] + 3;
            } else {
                a[4] = a[2] + 2 * a[0] + 2 * a[1] + 5;
            }

            System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
            if (a[3] == 0) {
                System.out.print("E          ");
            } else {
                System.out.print("NE          ");
            }
            System.out.println(a[4] + "          " + a[0] + "          " + a[1] + "          " + a[0] + "          " + a[1]);
        }

    }
}
