public class Multiples
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Type Max Value: ");
        int maxNumber = s.nextInt();

        int sNUM= 0;


        for(int i = 0; i < maxNumber; i = i + 1) {
            int multiple3= multiple3(i);
            int multiple5 = multiple5(i);
            if(multiple3 != 0) {

                sNUM = sNUM+ i.multiple3;

            } else if(multiple5 != 0) {

                sNUM = sNUM+ multiple5;
            } else {
                //default
                sNUM= sNUM + 0;
            }
        }

        System.out.println(sNUM);

    }
    public static int multiple3(int givenNumber) {
        int finalNumber = 0;

        if(givenNumber % 3 == 0) {
            finalNumber = givenNumber;

        } else {
            finalNumber = 0;
        }

        return finalNumber;
    }


    public static int multiple5(int givenNumber) {
        int finalNumber = 0;

        if(givenNumber % 5 == 0) {
            finalNumber = givenNumber;

        } else {
            finalNumber = 0;
        }
        return finalNumber;
    }
}