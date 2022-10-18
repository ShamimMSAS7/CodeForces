/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShamimMSAS7
 */
import java.lang.*;
import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int [][]array=new int [5][5];
      int r=-1;
      int c=-1;
      for(int row=0;row<5;row++){
        for(int col=0;col<5;col++){
          int x=sc.nextInt();
          if(x==1){
            r=row;
            c=col;
            row=5;
            break;
          }
        }
      }
      int step=Math.abs(r-2)+Math.abs(c-2);
      System.out.println(step);
    }
}
