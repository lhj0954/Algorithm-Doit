package doit.chap6.실습;

public class SixToSeventeen {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void heap(int[] arr, int left, int right) {
        int temp = arr[left];
        int child;
        int parent;

        for (parent = left; parent < (right+1)/2; parent = child) {
            int cl = parent*2+1;
            int cr = cl+1;

            child = (cr <= right && arr[cr] > arr[cl]) ? cr: cl;
            if (temp >= arr[child]) {
                break;
            }
            arr[parent] = arr[child];
        }
        arr[parent] = temp;
    }

    static void heapSort(int[] arr, int n) {
        for (int i = (n-1)/2; i >= 0; i--) {
            heap(arr, i, n-1);
        }

        for (int i = n -1; i >0; i--) {
            swap(arr, 0, i);
            heap(arr, 0, i - 1);
        }
    }

    public static void main(String[] args) {

    }
}
