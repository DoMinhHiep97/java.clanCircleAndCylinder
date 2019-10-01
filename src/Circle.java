public class Circle {
    private double radius=5;
    private String color="black";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "Circle: radius: "+getRadius()+", color: "+getColor()+", Area: "+getArea();
    }
}
