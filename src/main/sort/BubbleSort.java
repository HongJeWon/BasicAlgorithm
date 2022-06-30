package main.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intList = {10, 7, 9, 3, 2, 11, 23, 44, 32, 21, 34};
        doBubbleSort(intList);
    }

    private static void doBubbleSort(int[] intList) {
        int temp;
        for (int i = intList.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intList[j] > intList[j + 1]) {
                    temp = intList[j];
                    intList[j] = intList[j + 1];
                    intList[j + 1] = temp;
                }
            }
        }
        for (int j : intList) {
            System.out.println(j);
        }
    }
}
