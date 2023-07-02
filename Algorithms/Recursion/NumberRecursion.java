public class NumberRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // base condition
        // if there is no base condition the function will keep on calling itself
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // each time a function is called, it takes a separate place in the memory
        print(n + 1);
    }
}