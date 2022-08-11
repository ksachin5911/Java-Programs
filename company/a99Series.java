package com.company;
import java.util.*;
import java.lang.Math;
public class a99Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int k = 0; k < n; k++)
            {
                res += (int) (Math.pow(2, k) * b);
                System.out.print(res + " ");
            }
        }
        in.close();
    }
}
