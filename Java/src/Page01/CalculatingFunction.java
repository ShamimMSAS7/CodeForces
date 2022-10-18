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

public class CalculatingFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if (x % 2 == 0) {
            System.out.println(x / 2);
        } else {
            System.out.println(x / 2 - x);
        }
    }

}
