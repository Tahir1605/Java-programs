class BubbleSort2 {
    public static void main(String[] args) {
        String[] a = {"deepak", "amit", "deepash", "vironika", "rahul"};
        String temp;
        int flag;

        for (int i = 0; i < a.length - 1; i++) {
            flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                  
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break; 
            }
        }

      
        for (String str : a) {
            System.out.println(str);
        }
    }
}
