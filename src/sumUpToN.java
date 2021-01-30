public class sumUpToN {

    public static void main(String[] args) {

        int num =14;
        int count = 1;
        int total = 0;

        while(count <= num)
        {
            total = total + count;
            count++;
        }

        System.out.println("Sum of numbers is: "+total);
    }
}

