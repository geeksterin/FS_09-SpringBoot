public class Square implements Shapes{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

 @Override
    public void getArea() {
        System.out.println(side*side);
    }
}
