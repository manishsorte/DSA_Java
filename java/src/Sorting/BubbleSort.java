package Sorting;

public class BubbleSort {

    static void bubbleSort(int[] arr, int n) {
        for (int i = n -1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting:");
        for (int k = 0; k < n ; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 4, 11, 56, 34};
        int len = arr.length;
        bubbleSort(arr, len);
    }
}
