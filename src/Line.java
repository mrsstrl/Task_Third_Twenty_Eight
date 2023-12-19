public class Line {
    public double k;
    public double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public boolean isPointAboveLine(double x, double y) {
        return y >= k * x + b;
    }

    public boolean isPointBelowLine(double x, double y) {
        return y < k * x + b;
    }
}
