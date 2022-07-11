package main.sort.quick;

public class RightPivotQuickSort {

    public static void main(String[] args) {
        int[] intList = {10, 7, 9, 3, 2, 11, 23, 44, 32, 21, 34};
        sort(intList);
        for (int i : intList) {
            System.out.println(i);
        }
    }
    public static void sort(int[] a) {
        r_pivot_sort(a, 0, a.length - 1);
    }

    /**
     * 오른쪽 피벗 선택 방식
     *
     * @param a  정렬할 배열
     * @param lo 현재 부분배열의 왼쪽
     * @param hi 현재 부분배열의 오른쪽
     */
    private static void r_pivot_sort(int[] a, int lo, int hi) {

        if (lo >= hi) {
            return;
        }
        int pivot = partition(a, lo, hi);
        r_pivot_sort(a, lo, pivot - 1);
        r_pivot_sort(a, pivot + 1, hi);
    }


    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     *
     * @param a     정렬 할 배열
     * @param left  현재 배열의 가장 왼쪽 부분
     * @param right 현재 배열의 가장 오른쪽 부분
     * @return 최종적으로 위치한 피벗의 위치(lo)를 반환
     */
    private static int partition(int[] a, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = a[right];

        while (lo < hi) {

            while (a[lo] < pivot && lo < hi) {
                lo++;
            }

            while (a[hi] >= pivot && lo < hi) {
                hi--;
            }
            swap(a, lo, hi);
        }
        swap(a, right, hi);
        return hi;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
