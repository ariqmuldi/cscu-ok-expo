// The numbers in the for loop and also - to + in the print statement

public class easy2_solution {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The sum of the list is: " + sum_of_list(numbers));  // Mistake kept
    }

    public static int sum_of_list(int[] numbers) {
        int total = 0;
        for (int number : numbers) {  // Mistake kept: 'number' instead of 'numbers'
            total += number;
        }
        return total;
    }
}
