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

public class WayToLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        for (String x : array) {
            int y = x.length();
            if (y <= 10) {
                System.out.println(x);
            } else {
                String str=String.valueOf(x.charAt(0));
                System.out.println(str+(y - 2) + x.charAt(y - 1));
            }
        }
    }
}
