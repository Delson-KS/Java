public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter=2*3.14*radius;
        return perimeter;
    }
}
