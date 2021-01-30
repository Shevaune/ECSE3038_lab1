import java.util.Scanner;
public class sumUpToN {

    public static void main(String[] args) {

        int num;
        int count = 1;
        int total = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        num = in.nextInt();

        System.out.println("Input Integer is:" +num);

        while(count <= num)
        {
            total = total + count;
            count++;
        }

        System.out.println("Sum of numbers is: "+total);
    }
}