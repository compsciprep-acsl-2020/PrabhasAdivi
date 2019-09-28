import java.util.Scanner;

//farenhit to celcius method
public class twooMethodClas {

    public static double FarentoCelcius(double farenhit) {

        return 5.0/9*(farenhit-32);

    }


    //Celcius to farenhit to mathod
    public static double CelciustoFarenhit(double celcius) {
        return ( 9.0/5*celcius) +32;

    }




    // runs stuff
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("odds for Celcius fo farenhit, evens for farenhit to celcius");
        int type = sc.nextInt();



        if (type % 2 == 0) {
            System.out.println("Enter the value temperature of your farenhit");
            double tempp = sc.nextDouble();
            System.out.println(" The value of " +tempp+ " farenhit to celcius  is:" +  FarentoCelcius(tempp)+" degreess");

        }

        else {
            System.out.println("Enter the value of your celcius");
            double tempp = sc.nextDouble();
            System.out.println( "the value of "+tempp + " celcius to farenhit is:  "+CelciustoFarenhit(tempp)+" degreesss");
        }
    }
}