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

public class CyrusBeck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float xMin = sc.nextInt();
        float xMax = sc.nextInt();
        float yMin = sc.nextInt();
        float yMax = sc.nextInt();

        float x0, y0, x1, y1;
        x0 = sc.nextInt();
        y0 = sc.nextInt();
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        float dx = x1 - x0;
        float dy = y1 - y0;
        float te = 0, tl = 1;
        for (int i = 0; i < 4; i++) {
            float nid, t;
            if (i == 0) {
                System.out.print("Left          Ni=(-1,0)       ");
                nid = -dx;
            } else if (i == 1) {
                System.out.print("Right         Ni=(1,0)        ");
                nid = dx;
            } else if (i == 2) {
                System.out.print("Bottom        Ni=(0,-1)       ");
                nid = -dy;
            } else {
                System.out.print("Top           Ni=(0,1)        ");
                nid = dy;
            }
            System.out.print("nid=" + nid);
            if (nid != 0) {
                if (i == 0) {
                    t = -(x0 - xMin) / (x1 - x0);
                } else if (i == 1) {
                    t = -(x0 - xMax) / (x1 - x0);
                } else if (i == 2) {
                    t = -(y0 - yMin) / (y1 - y0);
                } else {
                    t = -(y0 - yMax) / (y1 - y0);
                }
                System.out.print("       t=" + t);
                if (nid > 0) {
                    System.out.print("          PL");
                    if (t < tl) {
                        tl = t;
                    }
                } else {
                    System.out.print("          PE");
                    if (t > te) {
                        te = t;
                    }
                }

            } else {
                System.out.print("       t=null        null");
            }
            System.out.println("       te=" + te + "       tl=" + tl);
        }
        if (te > tl) {
            System.out.println("line segment is outside clip window");
        } else {
            x1 =x0+ tl * dx;
            y1 =y0+ tl * dy;
            x0 += te * dx;
            y0 += te * dy;
            System.out.println("x0=" + x0 + ", y0=" + y0);
            System.out.println("x1=" + x1 + ", y1=" + y1);
        }
    }
}
