// num % 2 == 0 not 1 and nums to num
public class easy1_solution {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        printEvenNumbers(numbers);
    }

    public static void printEvenNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.printf("%d is even \n", num);
            }
        }
    }

    
}
