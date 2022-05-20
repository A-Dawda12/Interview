/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.

Asssumption - Array is sorted. Array may have duplicate values.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing first index
A number representing last index

Constraints
1 <= n <= 1000
1 <= n1, n2, .. n elements <= 100
1 <= d <= 100
Sample Input
15
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33
Sample Output
5
9
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
    
    int data = scn.nextInt();
    
    int lo = 0;
    int hi = arr.length - 1;
    int fi = -1;
    
    while(lo <= hi){
        int mid = (lo + hi) / 2;
        if(data > arr[mid]){
            lo = mid + 1;
        }
        else if(data < arr[mid]){
            hi = mid - 1;
        }
        else{
            fi = mid;
            hi = mid - 1;
        }
    }
    System.out.println(fi);
    
    lo = 0;
    hi = arr.length - 1;
    int li = -1;
    
    while(lo <= hi){
        int mid = (lo + hi) / 2;
        if(data > arr[mid]){
            lo = mid + 1;
        }
        else if(data < arr[mid]){
            hi = mid - 1;
        }
        else{
            li = mid;
            lo = mid + 1;
        }
    }
    System.out.println(li);
 }

}
