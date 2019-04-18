package thread;

public class FirstTask {
    public static void main(String[] args) {
        print(10, "Test");
    }

    public static void print(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }

    }
}
