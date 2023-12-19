public class Parabola {
    double a;
    double b;
    double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointAboveParabola(double x, double y) {
        return y >= a * x * x + b * x + c;
    }

    public boolean isPointBelowParabola(double x, double y) {
        return y < a * x * x + b * x + c;
    }
}
