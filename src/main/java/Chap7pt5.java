/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author metan
 */
public class Chap7pt5 {
     public static void main(String args[])
   {
       int i,n;
       int[] a=

{12,34,23,44,22,67,11,67,98,10}; //Array initialized

       Scanner o = new Scanner(System.in); //Scanner class object created

       System.out.println("Enter number to check");
       n=o.nextInt();

       check(a,n);
   }

   public static void check(int[] a, int n) //static function defined in the same class of main
   {

       int i;

       for(i=0;i<10;i++)
       {
           if(a[i]>n) //checking for larger number than the given
           {
              

System.out.println(a[i]);
           }
       }
   }
         
}
