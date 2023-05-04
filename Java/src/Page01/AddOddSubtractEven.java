
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
public class AddOddSubtractEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int a = array[i][0];
            int b = array[i][1];
            if (a == b) {
                System.out.println(0);
            } else if (a < b) {
                int c = b - a;
                if (c % 2 == 0) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                int c = a - b;
                if (c % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
