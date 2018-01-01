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
     * Merge
     * @param list
     * @param p
     * @param q
     * @param r
     * @return
     */
    public void merge(final char[] list, final int p, final int q, final int r) {
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
}
