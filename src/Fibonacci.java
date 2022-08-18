public class Fibonacci {

    private static void iterativeFibonacci(int previous, int current, int maxValue) {
        int newCurrent;
        while (previous + current < maxValue) {
            System.out.print(current + " ");
            newCurrent = previous + current;
            previous = current;
            current = newCurrent;
        }
        System.out.println(current);
    }

    private static void iterativeFibonacci(int maxValue) {
        iterativeFibonacci(0, 1, maxValue);
    }

    private static int recursiveFibonacci(int previous, int current, int maxValue) {
        int newCurrent = previous + current;
        if (newCurrent < maxValue) {
            System.out.print(current + " ");
            return recursiveFibonacci(current, newCurrent, maxValue);
        }
        System.out.println(current);
        return current;
    }

    private static void recursiveFibonacci(int maxValue) {
        recursiveFibonacci(0, 1, maxValue);
    }

    public static void main(String[] args) {
        int maxValue = Helper.askIntValue();
        iterativeFibonacci(maxValue);
        recursiveFibonacci(maxValue);
    }
}

