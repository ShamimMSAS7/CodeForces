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

public class IsYourHorseshoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
