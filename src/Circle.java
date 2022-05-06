public class Circle extends Shape{
    private double radius;
    static final int DEFAULT_RADIUS = 5;

    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    public Circle(double x, double y) {
        super(x, y);
        this.radius = DEFAULT_RADIUS;
    }

    public void checkColor() {
        if (isInBoundary()) {
            color = ShapeColor.GREEN;
        } else {
            color = ShapeColor.RED;
        }
    }

    public boolean isInBoundary() {
        if (-1 * Circle.screenSize > x - this.radius || Circle.screenSize < x + this.radius) {
            return false;
        }
        if (-1 * Circle.screenSize > y - this.radius || Circle.screenSize < y + this.radius) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + " x=" + super.getX() +
                ", y=" + super.getY() + ", color=" + super.getColor() + "}\n";
    }

    public void draw() {
        StdDraw.setPenColor(color.getColor());
        StdDraw.filledCircle(x, y, radius);
    }
}