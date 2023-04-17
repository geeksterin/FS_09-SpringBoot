public class Triangle implements Shapes{

    private int base;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    private int height;



    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void getArea() {
        System.out.println(0.5 * base * height);
    }
}
