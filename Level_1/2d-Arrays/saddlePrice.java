/*
The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Sample Input

4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output
41
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            int svj = 0;
            for(int j = 1; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][svj]){
                    svj = j;
                }
            }

            boolean  flag = true;
            for(int k = 0; k < arr.length; k++){
                if(arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}
