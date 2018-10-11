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

  public double distanceTo(Point ok) {
    double w = 0;
    double h = 0;
    if (this.x > ok.x) {
      w = this.x - ok.x;
    }
    if (this.x < ok.x) {
      w = ok.x - this.x;
    }
    if (this.y > ok.y) {
      h = this.y - ok.y;
    }
    if (this.y < ok.y) {
      h = ok.y - this.y;
    }
    return Math.sqrt(w*w + h*h);
  }

  public static double distance(Point a, Point b) {
    double w = 0;
    double h = 0;
    if (a.x > b.x) {
      w = a.x - b.x;
    }
    if (a.x < b.x) {
      w = b.x - a.x;
    }
    if (a.y > b.y) {
      h = a.y - b.y;
    }
    if (a.y < b.y) {
      h = b.y - a.y;
    }
    return Math.sqrt(w*w + h*h);
  }

  public String toString() {
    return "" + this.x + "," + this.y;
  }
}
