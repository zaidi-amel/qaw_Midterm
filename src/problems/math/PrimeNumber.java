package problems.math;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {
        int n = 0;
        for(int i = 2; i <= 20;){

            int pr = 1;

            for(int j = 2; j <= i; j++) {
                if((i % j) == 0 && j != i) {
                    pr = 0;
                }
            }

            if (pr != 0){
                System.out.println(i+" it's prime number");
                i++;
                n++;
            }
            else
                i ++;
        }
        System.out.println("The number of Prime numbers is "+n);
    }
}
