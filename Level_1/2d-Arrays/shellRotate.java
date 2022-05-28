/*
s = 2
r = 3
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
*/

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][] arr =  new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int s = scn.nextInt();
    int r = scn.nextInt();
    rotateShell(arr, s, r);
    display(arr);
  }

  public static void rotateShell(int[][] arr, int s, int r) {
    int[] oned = fillOneFromShell(arr, s);
    rotate(oned, r);
    fillShellFromOned(arr, s, oned);
  }

  public static int[] fillOneFromShell(int[][] arr, int s) {
    int minr = s - 1;
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr[0].length - s;
    int sz = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;

    int[] oned = new int[sz];
     
    int idx = 0; 
    for (int i = minr, j = minc; i <= maxr; i++) {
      oned[idx] = arr[i][j];
      idx++;
    }
    for (int i = maxr, j = minc + 1; j <= maxc; j++) {
      oned[idx] = arr[i][j];
      idx++;
    }
    for (int i = maxr - 1, j = maxc; i >= minr; i--) {
      oned[idx] = arr[i][j];
      idx++;
    }
    for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
      oned[idx] = arr[i][j];
      idx++;
    }
    return oned;
  }

  public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
    int minr = s - 1;
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr[0].length - s;
    
    int idx = 0; 
    //lw
    for (int i = minr, j = minc; i <= maxr; i++) {
      arr[i][j] = oned[idx];
      idx++;
    }
    //bw
    for (int i = maxr, j = minc + 1; j <= maxc; j++) {
      arr[i][j] = oned[idx];
      idx++;
    }
    //rw
    for (int i = maxr - 1, j = maxc; i >= minr; i--) {
      arr[i][j] = oned[idx];
      idx++;
    }
    //tw
    for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
      arr[i][j] = oned[idx];
      idx++;
    }
  }

  public static void rotate(int[] oned, int r) {
    r = r % oned.length;
    if ( r < 0) {
      r = r + oned.length;
    }

    reverse(oned, 0, oned.length - r - 1);
    reverse(oned, oned.length - r, oned.length - 1);
    reverse(oned, 0, oned.length - 1);
  }

  public static void reverse(int[] oned, int li, int ri) {
    while (li < ri) {
      int temp = oned[li];
      oned[li] = oned[ri];
      oned[ri] = temp;

      li ++;
      ri --;
    }
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
