public class Code05 {
    /**
     * 앞에서 순차 검색
     * @param data
     * @param begin
     * @param end
     * @param target
     * @return
     */
    public int searchFirst(final int[] data, final int begin, final int end, final int target) {
        if (begin > end)
            return -1;
        else if (target == data[begin])
            return begin;
        else
            return searchFirst(data, begin + 1, end, target);
    }

    /**
     * 뒤에서 순차 검색
     * @param data
     * @param begin
     * @param end
     * @param target
     * @return
     */
    public int searchLast(final int[] data, final int begin, final int end, final int target) {
        if (begin > end)
            return -1;
        else if (target == data[end])
            return end;
        else
            return searchLast(data, begin, end - 1, target);
    }

    /**
     * 중간에서 순차 검색
     * @param data
     * @param begin
     * @param end
     * @param target
     * @return
     */
    public int searchMiddle(final int[] data, final int begin, final int end, final int target) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            if (target == data[middle])
                return middle;
            int index = searchMiddle(data, begin, middle - 1, target);
            if (index != -1)
                return index;
            else
                return searchMiddle(data, middle + 1, end, target);
        }
    }

    /**
     * 앞에서 최대값 찾기
     * @param data
     * @param begin
     * @param end
     * @return
     */
    public int findMaxFirst(final int[] data, final int begin, final int end) {
        if (begin == end)
            return data[begin];
        else
            return Math.max(data[begin], findMaxFirst(data, begin + 1, end));
    }

    /**
     * 중앙에서 최대값 찾기
     * @param data
     * @param begin
     * @param end
     * @return
     */
    public int findMaxMiddle(final int[] data, final int begin, final int end) {
        if (begin == end)
            return data[begin];
        else {
            int middle = (begin + end) / 2;
            int max1 = findMaxMiddle(data, begin, middle);
            int max2 = findMaxMiddle(data, middle + 1, end);
            return Math.max(max1, max2);
        }
    }

    /**
     * 이진 검색
     * @param items
     * @param target
     * @param begin
     * @param end
     * @return
     */
    public int binarySearch(final String[] items, final String target, final int begin, final int end) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0)
                return middle;
            else if (compResult < 0)
                return binarySearch(items, target, begin, middle - 1);
            else
                return binarySearch(items, target, middle + 1, end);
        }
    }
}
