/*
1. You are given a string str. 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. 
Use sample input and output to take idea about subsequences. Note -> The online judge can't force you to write the function recursively but that is what the 
spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= str.length <= 20

Format
Input
A string str

Output
Contents of the arraylist containing subsequences as shown in sample output

Example
Sample Input
abc

Sample Output
[, c, b, bc, a, ac, ab, abc]
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> ress = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : ress){
            mres.add("" + rstr);
        }
        for(String rstr : ress){
            mres.add(ch + rstr);
        }
        return mres;
    }

}

