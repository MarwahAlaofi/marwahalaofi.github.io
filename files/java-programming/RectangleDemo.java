

public class RectangleDemo {

    public static void main(String[] s)
    {
      Rectangle rec1 = new Rectangle();
      Rectangle rec2 = new Rectangle(3.5, 35.9);
      
      System.out.println("The perimeter of the first rectangle is: " + rec1.getPerimeter() + "\n");
      System.out.println("The perimeter of the second rectangle is: " + rec2.getPerimeter() + "\n");

      System.out.println("The area of the first rectangle is: " + rec1.getArea() + "\n");
      System.out.println("The area of the second rectangle is: " + rec2.getArea() + "\n");

    }
}
 class Rectangle {
  
    private double width;
    private double height;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return width * 2 + height * 2;
    }


}
