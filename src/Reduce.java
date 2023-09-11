public class Reduce {
    public static void main(String[] args) {
        byte number = 100;
        short num_steps = 0;

        while (number > 0) {
            if (number % 2 == 0) {
                number = (byte) (number/2);
            }
            else {
                number --;
            }
            num_steps ++;
        }
        System.out.println(num_steps);
    }
}
