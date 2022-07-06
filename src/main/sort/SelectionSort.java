package main.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intList = {10, 7, 9, 3, 2, 11, 23, 44, 32, 21, 34};
        doSelectSort(intList);
    }

    private static void doSelectSort(int[] intList) {
        for (int i = 0; i < intList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < intList.length; j++) {
                if (intList[j] < intList[minIndex]) {
                    minIndex = j;
                }
            }
            swap(intList, minIndex, i);
        }
        for (int i : intList) {
            System.out.println(i);
        }
    }

    private static void swap(int[] intList, int minIndex, int j) {
        int temp = intList[minIndex];
        intList[minIndex] = intList[j];
        intList[j] = temp;

    }
}
