public class AreaCalculator {

    Shapes genericShape;

    public AreaCalculator(Shapes genericShape)
    {
        this.genericShape = genericShape;
    }
    void printArea()
    {
        genericShape.getArea();
    }
}
