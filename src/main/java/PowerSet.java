public class PowerSet {
    private final char[] data = {'a', 'b', 'c', 'd', 'e', 'f'};
    private final int n = data.length;
    private final boolean[] include = new boolean[n];

    /**
     * 멱집합
     * @param k
     */
    public void powerSet(final int k) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                if (include[i]) {
                    System.out.print(String.format("%s ", data[i]));
                }
            }
            System.out.println();
            return;
        }
        include[k] = false;
        powerSet(k + 1);
        include[k] = true;
        powerSet(k + 1);
    }
}
