public class Main {
    public static double pow(double x){
        if (x >= 0){
            return Math.pow(x, 2);
        }else {
            return Math.pow(x, 4);
        }
    }

    public static void main(String[] args) {
        double a = 3;
        double b = -3;
        double c = -2;

        System.out.println("a = " + pow(a));
        System.out.println("b = " + pow(b));
        System.out.println("c = " + pow(c));

    }
}
