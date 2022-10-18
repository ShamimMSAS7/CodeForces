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
public class Team {
    public static void main (String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++){
        int array[]={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        if(array[0]+array[1]+array[2]>=2)
            count++;
      }
      System.out.println(count);
    }
}
