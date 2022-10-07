import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-3, -5, -12, 8, 3, 10};
        System.out.println(Arrays.toString(sort(numbers)));

        System.out.print(search(numbers , -5));
    }

    private static int[] sort(int[] numbers) {
        boolean change = false;
        for (int i = 0; i < numbers.length-1; i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];
            if (currentNumber > nextNumber) {
                numbers[i] = nextNumber;
                numbers[i + 1] = currentNumber;
                change = true;
            }
        }

        return change ? sort(numbers) : numbers;
    }
    private static boolean search(int[] numbers, int x){

        for (int i = 0; i < numbers.length-1; i++) {
            if ( x == numbers[i]){
                return true;

            }

        }
        return false;
    }

}