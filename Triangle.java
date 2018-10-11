public class Triangle {
  private Point p1;
  private Point p2;
  private Point p3;

  public Triangle(Point One, Point Two, Point Three) {
    p1 = new Point(One);
    p2 = new Point(Two);
    p3 = new Point(Three);
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    p1 = new Point(x1, y1);
    p2 = new Point(x2, y2);
    p3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double a = p1.distanceTo(p2);
    double b = p2.distanceTo(p3);
    double c = p3.distanceTo(p1);
    return a + b + c;
  }

  public Point getVertex(int index) {
    if (index == 0) {
      Point i = new Point(p1);
      return i;
    }
    if (index == 1) {
      Point o = new Point(p2);
      return o;
    }
    if (index == 2) {
      Point p = new Point(p3);
      return p;
    }
    return p1; // when index != 0,1,2. Default pt is first pt.
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      p1 = newP;
    }
    if (index == 1) {
      p2 = newP;
    }
    if (index == 2) {
      p3 = newP;
    }
  }

  public String toString() {
    return "A(" + p1 + ") B(" + p2 + ") C(" + p3 + ")";
  }
}
