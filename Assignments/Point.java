public class Point {
    private int x, y;
    
    public static void main(String[] args){
       Point p1 = new Point(17, 9);
       Point p2 = new Point(4, -1);
       Point p3 = p2;
       
       p1.translate(3, 1);
       p2.x = 50;
       p3.translate(-4, 5);
       
       System.out.println(p1 + ", " + p2 + ", " + p3);
    }
    
    // Constructor
    public Point(int initX, int initY) {
        x = initX;
        y = initY;
    }
    
    // These accessors return the Point's x and y coordinates.
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    // Shifts this point's x/y by the given amounts.
    public void translate(int dx, int dy) {  
        x += dx;
        y += dy;
    }

    // Returns this point's distance from (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    // A string version of the Point that is suitable for printing.
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }
}