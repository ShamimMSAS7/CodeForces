/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShamimMSAS7
 */
import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str = sc.next();
        String result = "YES";

        str = str.toLowerCase();
        char[] array = str.toCharArray();
        Arrays.sort(array);
        char c = 'a';
        if (array[0] == c) {
            for (int i = 0; i < array.length; i++) {
                if (c != array[i] && array[i] != ++c) {
                    result = "NO";
                    break;
                }
            }
        }
        if (result.equals("YES") && c != 'z') {
            result = "NO";
        }
        System.out.println(result);
    }
}
