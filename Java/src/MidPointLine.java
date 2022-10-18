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

public class MidPointLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int zone = findZone(x1, y1, x2, y2);
        System.out.println("Zone is " + zone);
        System.out.println("dx in zone "+zone+" = "+(x2-x1));
        System.out.println("dy in zone "+zone+" = "+(y2-y1)+"\n");
        int inZone0[] = new int[4];
        inZone0 = findInZone0(x1, y1, x2, y2, zone);
        x1 = inZone0[0];
        y1 = inZone0[1];
        x2 = inZone0[2];
        y2 = inZone0[3];
        int a[] = new int[5];
        a[0] = x1;
        a[1] = y1;
        a[2] = 2 * (y2 - y1) - (x2 - x1);
        int ne = 2 * (y2 - y1) - 2 * (x2 - x1);
        int e = 2 * (y2 - y1);
        System.out.println("Initial point in zone 0 =("+x1+","+y1+")");
        System.out.println("End point in zone 0 =("+x2+","+y2+")");
        System.out.println("dx in zone 0 = "+(x2-x1));
        System.out.println("dy in zone 0 = "+(y2-y1));
        System.out.println("increment of ne = "+ne);
         System.out.println("increment of e = "+e);
        if (a[2] > 0) {
            a[3] = 1;
            a[4] = a[2] + ne;
        } else {
            a[3] = 0;
            a[4] = a[2] + e;
        }
        System.out.println("x'          y'          D          E/NE        Dnew        x          y");
        System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
        if (a[3] == 0) {
            System.out.print("E          ");
        } else {
            System.out.print("NE          ");
        }
        int inZoneOriginal[] = new int[2];
        inZoneOriginal = findChangeToOriginal(a[0], a[1], zone);
        System.out.println(a[4] + "          " + inZoneOriginal[0] + "          " + inZoneOriginal[1]);

        while (a[0] != x2 || a[1] != y2) {
            a[0]++;
            a[1] += a[3];
            a[2] = a[4];
            if (a[2] > 0) {
                a[3] = 1;
                a[4] = a[2] + ne;
            } else {
                a[3] = 0;
                a[4] = a[2] + e;
            }
            System.out.print(a[0] + "          " + a[1] + "          " + a[2] + "          ");
            if (a[3] == 0) {
                System.out.print("E          ");
            } else {
                System.out.print("NE          ");
            }
            inZoneOriginal = findChangeToOriginal(a[0], a[1], zone);
            System.out.println(a[4] + "          " + inZoneOriginal[0] + "          " + inZoneOriginal[1]);
        }
    }

    static int findZone(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        if (dx < 0) {
            if (dy < 0) {
                if (Math.abs(dx) > Math.abs(dy)) {
                    return 4;
                } else {
                    return 5;
                }
            } else {
                if (Math.abs(dx) > Math.abs(dy)) {
                    return 3;
                } else {
                    return 2;
                }
            }
        } else {
            if (dy < 0) {
                if (Math.abs(dx) > Math.abs(dy)) {
                    return 7;
                } else {
                    return 6;
                }
            } else {
                if (Math.abs(dx) > Math.abs(dy)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }

    static int[] findInZone0(int x1, int y1, int x2, int y2, int zone) {
        int a[] = new int[4];
        if (zone == 0) {
            a[0] = x1;
            a[1] = y1;
            a[2] = x2;
            a[3] = y2;
        } else if (zone == 1) {
            a[0] = y1;
            a[1] = x1;
            a[2] = y2;
            a[3] = x2;
        } else if (zone == 2) {
            a[0] = y1;
            a[1] = -x1;
            a[2] = y2;
            a[3] = -x2;
        } else if (zone == 3) {
            a[0] = -x1;
            a[1] = y1;
            a[2] = -x2;
            a[3] = y2;
        } else if (zone == 4) {
            a[0] = -x1;
            a[1] = -y1;
            a[2] = -x2;
            a[3] = -y2;
        } else if (zone == 5) {
            a[0] = -y1;
            a[1] = -x1;
            a[2] = -y2;
            a[3] = -x2;
        } else if (zone == 6) {
            a[0] = -y1;
            a[1] = x1;
            a[2] = -y2;
            a[3] = x2;
        } else if (zone == 7) {
            a[0] = x1;
            a[1] = -y1;
            a[2] = x2;
            a[3] = -y2;
        }
        return a;
    }

    static int[] findChangeToOriginal(int x, int y, int zone) {
        int a[] = new int[2];
        if (zone == 0) {
            a[0] = x;
            a[1] = y;
        } else if (zone == 1) {
            a[0] = y;
            a[1] = x;
        } else if (zone == 2) {
            a[0] = -y;
            a[1] = x;
        } else if (zone == 3) {
            a[0] = -x;
            a[1] = y;
        } else if (zone == 4) {
            a[0] = -x;
            a[1] = -y;
        } else if (zone == 5) {
            a[0] = -y;
            a[1] = -x;
        } else if (zone == 6) {
            a[0] = y;
            a[1] = -x;
        } else if (zone == 7) {
            a[0] = x;
            a[1] = -y;
        }
        return a;
    }
}
