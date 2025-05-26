class InsertionSort {
    public static void main(String[] args) {
        int[] a = {38, 52, 9, 18, 6, 62, 13};
        int temp, j;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
