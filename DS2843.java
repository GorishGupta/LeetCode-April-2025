public class DS2843 {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            int len = s.length();
            if (len % 2 != 0)
                continue;
            int half = len / 2;
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < half; j++) {
                sum1 += s.charAt(j);
                sum2 += s.charAt(half + j);

            }
            if (sum1 == sum2) {
                c++;

            }
        }
        return c;
    }

    public static void main(String[] args) {
        DS2843 ds = new DS2843();
        int low = 1;
        int high = 1000;
        System.out.println(ds.countSymmetricIntegers(low, high)); // Output: 0
    }
}
