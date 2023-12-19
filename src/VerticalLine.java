public class VerticalLine {
    public double k;
    public double b;

    public VerticalLine(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public boolean isPointRightToTheLine(double x, double y) {
        return x >= y * k + b;
    }

    public boolean isPointLeftToTheLine(double x, double y) {
        return x < y * k + b;
    }
}
