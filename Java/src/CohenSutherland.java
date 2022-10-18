
import java.text.DecimalFormat;
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
public class CohenSutherland {

    public static int a1, b1, a2, b2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();

        float x1, y1, x2, y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        float m, inverseM;
        if (x1 == x2 || y1 == y2) {
            m = 0;
            inverseM = 0;
        } else {
            m = (y2 - y1) / (x2 - x1);
            inverseM = (x2 - x1) / (y2 - y1);
        }

        if (a2 < a1) {
            int temp = a1;
            a1 = a2;
            a2 = temp;
        }

        if (b2 < b1) {
            int temp = b1;
            b1 = b2;
            b2 = temp;
        }
        System.out.println("xMin=" + a1 + ", yMin=" + b1);
        System.out.println("xMax=" + a2 + ", yMax=" + b2);
        System.out.println("*************************************************");
        System.out.println("x1=" + x1 + ", y1=" + y1);
        System.out.println("x2=" + x2 + ", y2=" + y2);
        int[] outcode1 = calculateOutcode(x1, y1);
        int[] outcode2 = calculateOutcode(x2, y2);
        System.out.print("Outcode1 = ");
        for (int i : outcode1) {
            System.out.print(i);
        }
        System.out.println();
        System.out.print("Outcode2 = ");
        for (int i : outcode2) {
            System.out.print(i);
        }
        System.out.println();

        while (true) {
            int o1 = outcode1[0] + outcode1[1] + outcode1[2] + outcode1[3];
            int o2 = outcode2[0] + outcode2[1] + outcode2[2] + outcode2[3];
            int n = 0;
            for (int i = 0; i < outcode1.length; i++) {
                n += outcode1[i] * outcode2[i];
            }

            if (o1 == 0 && o2 == 0) {
                System.out.println("Completely inside");
                break;
            } else if (n != 0) {
                System.out.println("Completely outside");
                break;
            } else {
                if (o1 != 0) {
                    if (outcode1[0] == 1) {
                        System.out.println("Outcode1 has top bit");
                        x1 = x1 + inverseM * (b2 - y1);
                        y1 = b2;
                    } else if (outcode1[1] == 1) {
                        System.out.println("Outcode1 has bottom bit");
                        x1 = x1 + inverseM * (b1 - y1);
                        y1 = b1;
                    } else if (outcode1[2] == 1) {
                        System.out.println("Outcode1 has right bit");
                        y1 = y1 + m * (a2 - x1);
                        x1 = a2;
                    } else {
                        System.out.println("Outcode1 has left bit");
                        y1 = y1 + m * (a1 - x1);
                        x1 = a1;
                    }
                    x1=Math.round(x1);
                    y1=Math.round(y1);
                    outcode1 = calculateOutcode(x1, y1);
                } else {
                    if (outcode2[0] == 1) {
                        System.out.println("outcode2 has top bit");
                        x2 = x2 + inverseM * (b2 - y2);
                        y2 = b2;
                    } else if (outcode2[1] == 1) {
                        System.out.println("outcode2 has bottom bit");
                        x2 = x2 + inverseM * (b1 - y2);
                        y2 = b1;
                    } else if (outcode2[2] == 1) {
                        System.out.println("outcode2 has right bit");
                        y2 = y2 + m * (a2 - x2);
                        x2 = a2;
                    } else {
                        System.out.println("outcode2 has left bit");
                        y2 = y2 + m * (a1 - x2);
                        x2 = a1;
                    }
                    x2=Math.round(x2);
                    y2=Math.round(y2);
                    outcode2 = calculateOutcode(x2, y2);
                }
                System.out.println("**************************************");
                System.out.println("x1=" + x1 + ", y1=" + y1);
                System.out.println("x2=" + x2 + ", y2=" + y2);
                System.out.print("Outcode1 = ");
                for (int i : outcode1) {
                    System.out.print(i);
                }
                System.out.println();
                System.out.print("Outcode2 = ");
                for (int i : outcode2) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }

    static int[] calculateOutcode(float x, float y) {
        int o[] = new int[4];
        if (y > b2) {
            o[0] = 1;
        }
        if (y < b1) {
            o[1] = 1;
        }
        if (x > a2) {
            o[2] = 1;
        }
        if (x < a1) {
            o[3] = 1;
        }
        return o;
    }
}
