
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

public class BitPlusPlus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
