/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..
All subsets

Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3

Sample Input
3
10
20
30

Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    
    int limit = (int)Math.pow(2, arr.length);
    for(int i = 0; i < limit; i++){
        /*convert i to binary and use 0 and 1 to know if to print element or not */
        String set = "";
        int temp = i;
        for(int j = arr.length - 1; j >= 0; j--){
            int r = temp % 2;
            temp = temp / 2;
            
            if(r == 0){
                set = "-\t" + set;
            }
            else{
                set = arr[j] + "\t" + set;
            }
        }
        System.out.println(set);
    }
 }
 
}
