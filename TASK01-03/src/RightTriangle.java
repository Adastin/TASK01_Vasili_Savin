public class RightTriangle {
    double a;
    double b;
    double c;

    public RightTriangle(double a, double b){
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double getArea(){
        return (a + b)/2;
    }

    public double getPerimeter(){
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        RightTriangle triangle = new RightTriangle(a, b);
        System.out.println("S = " + triangle.getArea());
        System.out.println("P = " + triangle.getPerimeter());
    }
}
