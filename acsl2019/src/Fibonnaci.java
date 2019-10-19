
public class Fibonnaci {

    public static void main(String[] args) {
        int sum = 2;// holds sum of total even numbers
        int n1 = 0;// the last number in the fibonnaci sequence
        int n2 = 0;// the number before the last number in the fibonacci sequence
        int f = 0;// current fibbonacci number

        int i = 1;
        while (f <= 4000000) {


            if (i == 1) {
                n2 = 1;
                n1 = 2;

            }
            f = n1 + n2;
            if (f % 2 == 0) {
                sum = sum + f;
            }

            n2 = n1;
            n1 = f;

            i++;
        } // end of whilelop
        System.out.println(sum);


    }

}