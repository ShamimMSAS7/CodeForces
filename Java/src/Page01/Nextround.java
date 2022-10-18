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
public class Nextround {
    public static void main (String[]args){
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       int array[]=new int [x];
       for (int i=0;i<x;i++)
           array[i]=sc.nextInt();
       int z=array[y-1];
       int count=0;
       for(int i=0;i<array.length;i++){
           if(array[i]>=z && array[i]!=0)
               count++;
       }
       System.out.println(count);
    }
}
