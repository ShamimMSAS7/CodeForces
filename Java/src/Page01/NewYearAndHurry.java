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

public class NewYearAndHurry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int rem = 240 - y;
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (5 * i <= rem) {
                rem -= 5 * i;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
