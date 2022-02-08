public class Square extends Rectangle{

    public Square(int a) {
        super(a, a);
    }

    @Override
    public void getPerimeter(){
        System.out.println("Square perimeter is "+this.a*4);
    }
}
