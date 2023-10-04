package txt;

public class Point {
    private int x =2;
    private int y =5;
    public Point(int x, int y) {
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }
}
