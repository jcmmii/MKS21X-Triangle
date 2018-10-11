//fix up copying points + making up new points?
//might be just original points being used right now

public class Triangle {
  private Point p1;
  private Point p2;
  private Point p3;
  private int v1;
  private int v2;
  private int v3;

  public Triangle(Point One, Point Two, Point Three) {
    Point a = new Point(One);
    Point b = new Point(Two);
    Point c = new Point(Three);
    p1 = a;
    p2 = b;
    p3 = c;

  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
    p1 = a;
    p2 = b;
    p3 = c;
  }

  public double getPerimeter() {
    double a = p1.distanceTo(p2);
    double b = p2.distanceTo(p3);
    double c = p3.distanceTo(p1);
    return a + b + c;
  }

  public Point getVertex(int index) {
    if (index == 0) {
      return p1;
    }
    if (index == 1) {
      return p2;
    }
    return p3;
  }

  public void setVertex(int index, Point newP) {
    Point x,y,z;
    if (index == 0) {
      x = p1;
      p1 = newP;
    }
    if (index == 1) {
      y = p2;
      p2 = newP;
    }
    if (index == 2) {
      z = p3;
      p3 = newP;
    }
  }

  public String toString() {
    return "Triangle: A(" + p1 + ") B(" + p2 + ") C(" + p3 + ")";
  }
}
