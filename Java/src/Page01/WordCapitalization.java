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

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String x = String.valueOf(str.charAt(0));
        x=x.toUpperCase();
        str=str.substring(1);
        str = x.concat(str);
        System.out.println(str);

    }
}
