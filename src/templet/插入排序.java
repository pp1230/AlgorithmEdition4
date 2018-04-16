package templet;

import java.util.Scanner;

public class 插入排序 {
    public static int[] insertionSort(int[] arr){
        for (int i = 1;i<arr.length;i++){
            for(int j = i;j>0 && arr[j-1]>arr[j];j--){
                int t= arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
            }
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
        PrintIntArr.print(insertionSort(arr));
    }
}
