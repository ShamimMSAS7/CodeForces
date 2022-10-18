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

public class SoldierAndBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int m = k * w * (w + 1) / 2;
        int s = m - n;
        if (s < 0) {
            System.out.println(0);
        } else {
            System.out.println(s);
        }
    }

}
