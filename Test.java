public class Test {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("hello world");
        System.out.println("abc=" + abc(a, 2));
    }

    private static int abc(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
