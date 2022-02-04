public class Circle{
   private static double a, r, c; //area, circumference
   
   public static void main(String[] args){
      Circle circle = new Circle(2.5);
      double a1 = circle.getRadius();
      double a2 = circle.area();
      double a3 = circle.circumference();
      String a4 = circle.toString();
      System.out.println("Radius: " + a1);
      System.out.println("Area: " + a2);
      System.out.println("Circumference: " + a3);
      System.out.println(a4);
   }
   
   public Circle(double rad){
      r = rad;
   }
   
   public static double area(){
      a = Math.PI * (r * r);
      return a;
   }
   
   public static double circumference(){
      c = (2 * Math.PI) * r;
      return c;
   }
   
   public static double getRadius(){
      return r;
   }
   
   public String toString(){
      String circleInfo = "Circle{radius=" + r + "}";
      return circleInfo;
   }
   
}