/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Constraints
0 <= n <= 10^9
0 <= d <= 9
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int rev = 0;
        
        while( n > 0){
            int dig = n % 10;
            n = n /10;
            if(dig == d){
               rev++;
            }
        }
    return rev;
    }
}
