public class NumberOfbites191 {
    public static void main(String[] args) {
        int n = 1001;
        System.out.println(Integer.toBinaryString(n-1));
        int count = hammingWeight(n);
        System.out.println(count);
    }
    public static int hammingWeight(int n) {
        int bits = 0;
        int mask =1;
        for (int i = 0; i < 32; i++) {
            if ((n&mask) !=0){
                bits++;
            }
            mask<<=1;
//            System.out.println(Integer.toBinaryString(mask));
        }
        return bits;
    }
}
