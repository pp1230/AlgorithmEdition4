import templet.PrintIntArr;

import java.util.Scanner;

public class 选择排序 {
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i< arr.length;i++){
            int min = i;
            for (int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) min = j;
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
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
        PrintIntArr.print(selectionSort(arr));
    }
}
