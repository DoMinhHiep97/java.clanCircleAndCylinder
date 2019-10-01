public class Cylinder extends Circle {
    private double height=3;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*height*getRadius()*getRadius();
    }
    @Override
    public String toString(){
        return super.toString()+"Cylinder: height:"+getHeight()+", Volume:"+getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1=new Cylinder(5.3);
        System.out.println(cylinder1);

        Cylinder cylinder2=new Cylinder(5.3,"blue",7.5);
        System.out.println(cylinder2);

    }
}
