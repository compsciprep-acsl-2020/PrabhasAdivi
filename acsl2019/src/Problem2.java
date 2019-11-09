
public class problem2 {

    public static void main(String[] args) {
        int a[] = { 3, 2, 3, 2, 3 };
        int sum=1;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println("false");
                break;
            } else if (a[i] == 3) {
                sum++;
            }

        }
        if(sum==3) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }

}