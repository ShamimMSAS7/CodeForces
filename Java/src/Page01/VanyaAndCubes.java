
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
public class VanyaAndCubes {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int i=1,j=1;
      while(j<=x){
        x=x-j;
        i++;
        j=(i*(i+1))/2;
      }
      System.out.println(i-1);
    }
}
