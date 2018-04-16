package Test1;

public class App{

    static int add(int x, int y){
        while (y != 0) {
            int a = x & y;
            x = x ^ y;
            y = a << 1;
        }
        return x;
    }

    public static void main(String arg[]) {
        System.out.println(add(1, 5));
    }
}
