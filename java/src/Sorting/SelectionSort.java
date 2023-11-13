package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] arr = {13, 46, 24, 52, 20, 9};
        sort.selectSort(arr);
    }

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
