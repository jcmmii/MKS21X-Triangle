public class DriveTri {
    public static void main(String[] args){
      Point P1 = new Point(0,0);
      Point P2 = new Point(0,3);
      Point P3 = new Point(4,0);
      Triangle C = new Triangle(0,12,0,0,5,0);
      Triangle D = new Triangle(P1,P2,P3);
      System.out.println(C);
    //  Triangle D = new Triangle(P1,P2,P3);
    //  System.out.print(D);
      System.out.println(C.getPerimeter());
      System.out.println("Point 0: " + D.getVertex(0));
      System.out.println("Point 1: " + D.getVertex(1));
      D.setVertex(0,P2);
      D.setVertex(1,P1);
      System.out.println("Point 0: " + D.getVertex(0));
      System.out.println("Point 1: " + D.getVertex(1));
    }
  }
