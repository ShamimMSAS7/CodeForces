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

public class HellpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] array = new int[str.length() / 2 + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i * 2)));
        }
        Arrays.sort(array);
        String r = "";
        for (int i = 0; i < array.length - 1; i++) {
            r += String.valueOf(array[i]).concat("+");
        }
        r += String.valueOf(array[array.length - 1]);
        System.out.println(r);
    }

}
