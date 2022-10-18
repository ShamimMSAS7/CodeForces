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
public class Tram {
    public static void main(String []args){
      Scanner sc= new Scanner (System.in);
      int n=sc.nextInt();
      int cp=0;
      int mp=0;
      for(int i=0;i<n;i++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        cp+=y-x;
        if(cp>mp)
            mp=cp;
      }
      System.out.println(mp);
    }
}
