/*
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

Input Format
A number n
A base b1
A base b2

Output Format
A number of base b2 equal in value to n of base b1.

Constraints
0 <= n <= 512
2 <= b1 <= 10
2 <= b2 <= 10

Sample Input
111001
2
3
Sample Output
2010
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      
      int d = getValues(n, b1, b2);
      System.out.println(d);
   }   
   
   public static int getValues(int n, int b1, int b2){
       int dec = getValueInDecimal(n, b1);
       int dn = getValueInBase(dec, b2);
       
       return dn;
       
   }
   
   public static int getValueInBase(int n, int b){
       int res = 0;
       int p = 1;
       while(n > 0){
           int dig = n % b;
           n = n / b;
           
           res += dig * p;
           p = p * 10;
       }
       return res;
   }
   
   public static int getValueInDecimal(int n, int b){
       int res = 0;
       int p = 1;
       while(n > 0){
           int dig = n % 10;
           n = n / 10;
           
           res += dig * p;
           p = p * b;
       }
       return res;
   }
  }
