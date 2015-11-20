public class Rectangle{
    double width;
    double height;
    public static void main (String [] args){
        Rectangle r1 = new Rectangle();
        r1.setHeight(5.2);
        r1.setWidth(5.346);
        System.out.println(r1.getArea());
    }
    public void setWidth(double x){
        width =x;
    }
    public void setHeight(double x){
        height = x;
    }
    public double getArea(){
        return (width*height);
    }
}