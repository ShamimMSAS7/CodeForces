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

public class MidPointCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the zone");
        int zone = sc.nextInt();
        System.out.println("enter the radius");
        int r = sc.nextInt();
        System.out.println("enter the coordinates");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[] = new int[5];
        a[0] = 0;
        a[1] = r;
        a[2] = 1 - r;
        if (a[2] < 0) {
            a[3] = 0;
        } else {
            a[3] = 1;
        }
        if (a[3] == 0) {
            a[4] = a[2] + 2 * a[0] + 3;
        } else {
            a[4] = a[2] + 2 * a[0] - 2 * a[1] + 5;
        }
        int[] inZoneZ = fromZone1ToZoneZ(a[0], a[1], zone);
        int xInActualPosition = inZoneZ[0] + x;
        int yInActualPosition = inZoneZ[1] + y;
        System.out.println("x'          y'          D          E/SE        Dnew        SCx        SCy          x          y");
        System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
        if (a[3] == 0) {
            System.out.print("E          ");
        } else {
            System.out.print("SE          ");
        }
        System.out.println(a[4] + "          " + inZoneZ[0] + "          " + inZoneZ[1] + "          " + xInActualPosition + "          " + yInActualPosition);

        while (a[0] < a[1]) {
            a[0]++;

            a[1] -= a[3];
            a[2] = a[4];
            if (a[2] < 0) {
                a[3] = 0;
            } else {
                a[3] = 1;
            }
            if (a[3] == 0) {
                a[4] = a[2] + 2 * a[0] + 3;
            } else {
                a[4] = a[2] + 2 * a[0] - 2 * a[1] + 5;
            }

            inZoneZ = fromZone1ToZoneZ(a[0], a[1], zone);
            xInActualPosition = inZoneZ[0] + x;
            yInActualPosition = inZoneZ[1] + y;
            System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
            if (a[3] == 0) {
                System.out.print("E          ");
            } else {
                System.out.print("SE          ");
            }
            System.out.println(a[4] + "          " + inZoneZ[0] + "          " + inZoneZ[1] + "          " + xInActualPosition + "          " + yInActualPosition);
        }

    }

    public static int[] fromZone1ToZoneZ(int x, int y, int zone) {
        int a[] = new int[2];
        if (zone == 0) {
            a[0] = y;
            a[1] = x;
        } else if (zone == 1) {
            a[0] = x;
            a[1] = y;
        } else if (zone == 2) {
            a[0] = -x;
            a[1] = y;
        } else if (zone == 3) {
            a[0] = -y;
            a[1] = x;
        } else if (zone == 4) {
            a[0] = -y;
            a[1] = -x;
        } else if (zone == 5) {
            a[0] = -x;
            a[1] = -y;
        } else if (zone == 6) {
            a[0] = x;
            a[1] = -y;
        } else if (zone == 7) {
            a[0] = y;
            a[1] = -x;
        }
        return a;
    }
}
