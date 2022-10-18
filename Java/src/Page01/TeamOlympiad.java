
import java.util.Arrays;
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
public class TeamOlympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter[] = new int[3];
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 1) {
                counter[0]++;
            } else if (array[i] == 2) {
                counter[1]++;
            } else {
                counter[2]++;
            }
        }
        Arrays.sort(counter);
        int x = counter[0];
        System.out.println(x);
        if (x != 0) {
            int[][] result = new int[x][3];
            for (int i = 0; i < 3; i++) {
                int k = 0;
                for (int j = 0; j < n; j++) {
                    if (array[j] == i + 1) {
                        result[k++][i] = j + 1;
                        if (k == x) {
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println(result[i][2]);
            }
        }
    }
}
