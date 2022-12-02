package problems.math;

public class Factorial {
    public static int CalculFactorial(int nbr){
        if ((nbr==0) || (nbr==1)){
            return 1;
        }else{
            return (nbr*CalculFactorial(nbr-1));
        }
    }
    public static void main(String args[]) {
        //run your code here
        System.out.println("Factorial of 6 is "+CalculFactorial(6));


    }
}
