public class DriveTri {
    public static void main(String[] args){
      Point P1 = new Point(0,0);
      Point P2 = new Point(0,3);
      Point P3 = new Point(4,0);
      Triangle A = new Triangle(P1,P2,P3);
      //uses first method
      Triangle B = new Triangle(0,12,0,0,5,0);
      //uses second method

      System.out.println("Triangle A: " + A);
      //prints out Triangle A's vertices

      System.out.println("Triangle B: " + B);
      //prints out Triangle B's vertices

      System.out.println("Triangle A's perimeter: " + A.getPerimeter());
      //prints out Triangle A's perimeter

      System.out.println("Triangle B's perimeter: " + B.getPerimeter());
      //prints out Triangle B's perimeter

      System.out.println("A, vertex 1: " + A.getVertex(0));
      System.out.println("A, vertex 2: " + A.getVertex(1));
      System.out.println("A, vertex 3: " + A.getVertex(2));
      //prints out A's vertices individually

      Point P4 = new Point (100,100);
      A.setVertex(0,P4);
      //changes vertex 1 from 0,0 to 100,100

      System.out.println("A, new vertex 1: " + A.getVertex(0));
      System.out.println("New Triangle A: " + A);
      System.out.println("New Triangle A's perimeter: " + A.getPerimeter());
    }
  }
