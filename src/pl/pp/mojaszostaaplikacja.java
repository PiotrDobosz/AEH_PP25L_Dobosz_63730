package pl.pp;

class mojaPiataAplikacja {
    public static void main(String[] args) {
        int N = 20;

        System.out.println("Obliczanie silni liczby " + N + " metodą iteracyjną:");
        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(N);
        long endIterative = System.nanoTime();
        System.out.println("Wynik: " + resultIterative);
        System.out.println("Czas wykonania (iteracyjnie): " + (endIterative - startIterative) + " ns");

        System.out.println("\nObliczanie silni liczby " + N + " metodą rekurencyjną:");
        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(N);
        long endRecursive = System.nanoTime();
        System.out.println("Wynik: " + resultRecursive);
        System.out.println("Czas wykonania (rekurencyjnie): " + (endRecursive - startRecursive) + " ns");
    }

    private static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}