class InsertElementInArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int index_pos = 3;
        int element = 100;

        // Create a new array with one more space
        int[] newArray = new int[a.length + 1];

        for (int i = 0; i < index_pos; i++) {
            newArray[i] = a[i];
        }

        newArray[index_pos] = element;

        for (int i = index_pos; i < a.length; i++) {
            newArray[i + 1] = a[i];
        }

        // Print new array
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
