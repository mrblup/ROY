import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      double base1 = scnr.nextDouble();
      double height1 = scnr.nextDouble();
      triangle1.setBase(base1);
      triangle1.setHeight(height1);
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      double base2 = scnr.nextDouble();
      double height2 = scnr.nextDouble();
      triangle2.setBase(base2);
      triangle2.setHeight(height2);
      // TODO: Determine larger triangle (use getArea())
      double answer;
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      if(triangle1.getArea()>triangle2.getArea()){
         System.out.println(" triangle 1");
         triangle1.printInfo();
      }
      else{
         
         System.out.print(" triangle 2");
         triangle2.printInfo();;
      }
   }
}
