public class Multiples {
    public static void main(String[] args) {

        short num_div = 0;

        for (int i =1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 ==0) {
                num_div ++;
            }
        }

        System.out.println(num_div);
    }
}
