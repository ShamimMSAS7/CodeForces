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

public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int step = sc.nextInt();
        String str = sc.next();
        char array[] = str.toCharArray();
        while (step > 0) {
            int count = 0;
            for (int i = 1; i < str.length(); i++) {
                if (array[i - 1] == 'B' && array[i] == 'G') {
                    count++;
                    array[i] = 'B';
                    array[i - 1] = 'G';
                    i++;
                }

            }
            if (count == 0) {
                break;
            }
            step--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
