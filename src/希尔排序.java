import templet.PrintIntArr;

import java.util.Scanner;

public class 希尔排序 {
    public static int[] shellSort(int[] arr, int h){
        while (h>0) {
            for (int i = h; i < arr.length; i+=h) {
                for (int j = i; j > 0 && arr[j - h] > arr[j]; j -= h) {
                    int t = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = t;
                }
            }
            h/=2;
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        PrintIntArr.print(shellSort(arr, h));
    }
}
