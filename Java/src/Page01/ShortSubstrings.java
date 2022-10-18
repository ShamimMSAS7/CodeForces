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

public class ShortSubstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            if (s.length() != 2) {
                String str = String.valueOf(s.charAt(0));
                for (int j = 1; j < s.length(); j = j + 2) {
                    str += String.valueOf(s.charAt(j));
                }
                array[i] = str;
            }
        }
        for (String i : array) {
            System.out.println(i);
        }
    }
}
