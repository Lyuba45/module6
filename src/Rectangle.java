public class Rectangle {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getArea(){
        System.out.println("Area is "+this.a*this.b);
    }

    public void getPerimeter(){
        System.out.println("Rectangle perimeter is "+((this.a+this.b)*2));
    }
}
