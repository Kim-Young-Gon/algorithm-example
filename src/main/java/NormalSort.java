import java.util.Arrays;
import java.util.List;

public class NormalSort {
    /**
     * Selection Sort
     * @param list
     * @param n
     * @return
     */
    public Integer[] selectionSort(final Integer[] list, final int n) {
        Integer[] tmp = Arrays.copyOf(list, list.length);
        if (1 <= n) {
            for (int i = 0; i < n; i++) {
                if (list[i] < list[i + 1]) {
                    if (tmp[n] < list[i + 1]) {
                        tmp[n] = list[i + 1];
                        tmp[i + 1] = list[n];
                    }
                } else {
                    if (tmp[n] < list[i]) {
                        tmp[n] = list[i];
                        tmp[i] = list[n];
                    }
                }
            }
            return selectionSort(tmp, n - 1);
        } else {
            return tmp;
        }
    }

    /**
     * Bubble Sort
     * @param list
     * @param n
     * @return
     */
    public Integer[] bubbleSort(final Integer[] list, final int n) {
        if (1 <= n) {
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if (list[i] > list[i + 1]) {
                    tmp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = tmp;
                }
            }
            return bubbleSort(list, n - 1);
        } else {
            return list;
        }
    }

    /**
     * Insertion Sort
     * @param list
     * @return
     */
    public List<Integer> insertionSort(final List<Integer> list) {
        int num = 0;
        for (int i = 1; i < list.size(); i++) {
            num = list.get(i);
            int k = 0;
            for (int j = i; 0 < j; j--) {
                if (num < list.get(j - 1)) {
                    list.set(j, list.get(j - 1));
                    k = j;
                }
            }
            list.set(k - 1, num);
        }
        return list;
    }

    /**
     * Merge Sort
     * @param list
     * @param p
     * @param r
     * @return
     */
    public void mergeSort(final char[] list, final int p, final int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(list, p, q);
            mergeSort(list, q + 1, r);
            merge(list, p, q, r);
        }
    }

    /**
     * Merge Sort total merge
     * @param list
     * @param p
     * @param q
     * @param r
     * @return
     */
    private void merge(final char[] list, final int p, final int q, final int r) {
        int i = p, j = q + 1, k = p;
        final char[] result = new char[list.length];
        while (i <= q && j <= r) {
            if (list[i] <= list[j]) {
                result[k++] = list[i++];
            } else {
                result[k++] = list[j++];
            }
        }
        while (i <= q) {
            result[k++] = list[i++];
        }
        while (j <= r) {
            result[k++] = list[j++];
        }
        for (i = p; i <= r; i++) {
            list[i] = result[i];
        }
    }

    /**
     * Quick Sort
     * @param list
     * @param p
     * @param r
     */
    public void quickSort(final Integer[] list, final int p, final int r) {
        if (p < r) {
            final int q = partition(list, p, r);
            quickSort(list, p, q - 1);
            quickSort(list, q + 1, r);
        }
    }

    /**
     * Quick Sort Partition
     * @param list
     * @param p
     * @param r
     * @return
     */
    private int partition(final Integer[] list, final int p, final int r) {
        final int x = list[r];
        int i = p - 1;
        int tmp;
        for (int j = p; j <= r - 1; j++) {
            if (list[j] <= x) {
                i = i + 1;
                tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
            }
        }
        list[r] = list[i + 1];
        list[i + 1] = x;
        return i + 1;
    }

    /**
     * Heap Sort
     * @param list
     */
    public void heapSort(final Integer[] list) {
        final int n = list.length;
        // Heap 만들기
        for (int i = n / 2 - 1; 0 <= i; i--) {
            heapify(list, n, i);
        }
        // Heap 을 사용한 정렬처리
        int tmp;
        for (int i = n - 1; 0 <= i; i--) {
            // 최대값을 배열의 제일뒤로 보낸다.
            tmp = list[0];
            list[0] = list[i];
            list[i] = tmp;
            heapify(list, i, 0);
        }
    }

    /**
     * Heap으로 만들기
     * @param list
     * @param n
     * @param i
     */
    private void heapify(final Integer[] list, final int n, final int i) {
        int maxIdx = i;
        final int l = 2 * i + 1;
        final int r = 2 * i + 2;

        // 왼쪽 노드 확인
        if (l < n && list[l] > list[maxIdx]) {
            maxIdx = l;
        }
        // 오른쪽 노드 확인
        if (r < n && list[r] > list[maxIdx]) {
            maxIdx = r;
        }
        // 최대값이 원래의 root와 다르면 변경
        if (maxIdx != i) {
            final int tmp = list[i];
            list[i] = list[maxIdx];
            list[maxIdx] = tmp;
            // 하위 노드 Heap으로 만들기
            heapify(list, n, maxIdx);
        }
    }
}
