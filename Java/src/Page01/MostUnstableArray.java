
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
public class MostUnstableArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            switch (array[i][0]) {
                case 1:
                    System.out.println(0);
                    break;
                case 2:
                    System.out.println(array[i][1]);
                    break;
                default:
                    System.out.println(array[i][1] * 2);
                    break;
            }
        }
    }
}
