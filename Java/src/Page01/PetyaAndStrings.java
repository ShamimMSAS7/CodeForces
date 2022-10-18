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
public class PetyaAndStrings {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2=sc.next();
      int x=str1.compareToIgnoreCase(str2);
      if(x==0)
          System.out.println(0);
      else if (x>0)
          System.out.println(1);
      else
          System.out.println(-1);
    }
}
