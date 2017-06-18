public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isPointInArea(){
        if(x >= -4 && x <= 4 && y >= -3 && y <= 0){
            return true;
        }else if (x >= -2 && x <= 2 && y >= 0 && y <= 4){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = -5;
        int y = 0;
        Point point = new Point(x, y);
        System.out.println(point.isPointInArea() ? "true" : "false");
    }
}
