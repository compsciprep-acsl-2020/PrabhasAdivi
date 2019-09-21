import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    if(a>128){
        System.out.print(1);
    }
    else{
        System.out.print(0);
    }
    if( a>64 &&(a%128 != a%64)){
        System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        if( a>32 &&(a%64 != a%32)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        if( a>16 &&(a%32!= a%16)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        if( a>8 &&(a%16 != a%8)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        if( a>4 &&(a%8 != a%4)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        } if( a>2 &&(a%4 != a%2)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        if( a>1 &&(a%2 != a%1)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }



    }
}
