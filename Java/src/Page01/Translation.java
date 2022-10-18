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

public class Translation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = "YES";
        if (str1.length() == str2.length()) {
            int l = str1.length();
            for (int i = 0; i < l; i++) {
                if (str1.charAt(i) != str2.charAt(l - i - 1)) {
                    result = "NO";
                    break;
                }

            }
        } else {
            result = "NO";
        }
        System.out.println(result);
    }
}
