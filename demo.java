public class demo{
  public static void main(String[]args){
    Point P1 = new Point(0,0);
    Point P2 = new Point(0,3);
    Point P3 = new Point(4,0);
    Triangle A = new Triangle(P1,P2,P3);

    System.out.println(A);
    System.out.println("The perimeter is: " + A.getPerimeter());
  }

}
