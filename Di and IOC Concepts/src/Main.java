public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(5,2);
        Square s1 = new Square(10);

        Rectangle r1 = new Rectangle(2,5);
        AreaCalculator ac = new AreaCalculator(t1);

        ac.printArea();
    }
}
