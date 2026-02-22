public class EvenNumbers {
    public static void main(String[] args) {

        int min = 2;
        int max = 100;
        int sum = 0;

        System.out.println("Even numbers between 1 to 100:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\n\nMinimum even number: " + min);
        System.out.println("Maximum even number: " + max);
        System.out.println("Sum of even numbers: " + sum);
    }
}
