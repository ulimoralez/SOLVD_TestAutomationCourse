package Homework1.Task3;

public class main {
    public static void main(String[] args) {
        int[] numbers = new int[] {3, 7, 6, 13, 33, 9, -100, 25};
        bubbleSort(numbers);
        printArray(numbers);
    }
    public static void bubbleSort(int array[]) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
