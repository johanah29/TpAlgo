public class Circle {

    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public double area(){
        return this.radius * this.radius * 3.14;
    }

    public boolean containsPoint(Point p){
        if(Math.sqrt(Math.pow(p.getX()-this.point.getX(),2) + Math.pow(p.getY()-this.point.getY(),2)) < this.radius){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }
}
