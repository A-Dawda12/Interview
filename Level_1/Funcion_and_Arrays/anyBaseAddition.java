/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.

Input Format
A base b
A number n1
A number n2

Output Format
A number representing the sum of n1 and n2 in base b.

Constraints
2 <= b <= 10
0 <= n1 <= 256
0 <= n2 <= 256

Sample Input
8
777
1

Sample Output
1000
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int res = 0;
       int c = 0;
       int p = 1;
       
       while(n1 > 0 || n2 > 0 || c > 0){
           int rem1 = n1 % 10;
           int rem2 = n2 % 10;
           
           n1 = n1/10;
           n2 = n2/10;
           
           int dig = rem1 + rem2 + c;
           c = dig/b;
           dig = dig % b;
           
           res += dig * p;
           p = p * 10;
       }
       return res;
   }
  }
