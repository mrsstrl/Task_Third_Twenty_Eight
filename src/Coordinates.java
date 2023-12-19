public class Coordinates {
    public static final Parabola P = new Parabola(1, 0, -6);
    public static final Line L1 = new Line(0, -4);
    public static final Line L2 = new Line(0, 0);
    public static final Line L3 = new Line(0, 5);
    public static final Line L4 = new Line(0, 9);
    public static final VerticalLine VL1 = new VerticalLine(0, -6);
    public static final VerticalLine VL2 = new VerticalLine(0, 1);
    public static final VerticalLine VL3 = new VerticalLine(0, 4);
    public static final VerticalLine VL4 = new VerticalLine(0, 8);
    public static final VerticalLine VL5 = new VerticalLine(0, 0);

    public static Colour getColour(double x, double y) {
        boolean InsideBigRectangle = L1.isPointAboveLine(x, y) && L3.isPointBelowLine(x, y) && VL1.isPointRightToTheLine(x, y) && VL3.isPointLeftToTheLine(x, y);
        boolean InsideSmallRectangle = L2.isPointAboveLine(x, y) && L4.isPointBelowLine(x, y) && VL2.isPointRightToTheLine(x, y) && VL4.isPointLeftToTheLine(x, y);
        if ((P.isPointAboveParabola(x, y) && L1.isPointBelowLine(x, y)) || (P.isPointBelowParabola(x, y) && InsideBigRectangle && VL5.isPointLeftToTheLine(x, y))) {
            return Colour.ORANGE;
        } else if (!InsideBigRectangle && InsideSmallRectangle && P.isPointBelowParabola(x, y)) {
            return Colour.BLUE;
        } else if ((P.isPointAboveParabola(x, y) && !InsideBigRectangle && !InsideSmallRectangle) || (P.isPointBelowParabola(x, y) && InsideSmallRectangle && InsideBigRectangle)) {
            return Colour.WHITE;
        } else {
            return Colour.GRAY;
        }
    }
}
