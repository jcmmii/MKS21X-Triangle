public class Point{
  private double x,y;

  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public Point Copy() {
    return new Point(this);
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    double w = 0;
    double h = 0;
    h = Math.pow(x - other.x, 2);
    w = Math.pow(y - other.y, 2);
    return Math.sqrt(h+w);
  }

  public static double distance(Point a, Point b) {
    double w = 0;
    double h = 0;
    h = Math.pow(a.x - b.x, 2);
    w = Math.pow(a.x - b.x, 2);
    return Math.sqrt(w + h);
  }

  public String toString() {
    return "" + this.x + "," + this.y;
  }
}
