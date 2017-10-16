import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArray {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for(int i=0;i<k;i++)
            {
            int temp=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
                {
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
      return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(output[m]);
        }
        
    }
}
