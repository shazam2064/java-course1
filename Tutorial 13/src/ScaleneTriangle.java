public class ScaleneTriangle extends GraphicObject{

    @Override
    public void drawObject() {
        System.out.println("Drawing the scalene triangle");
    }

    @Override
    public void printNumberOfSides() {
        System.out.println("A scalene triangle has 3 sides");
    }

    @Override
    public void splitAcrossAxisOfSymmetry() {
        System.out.println("A scalene triangle has no axis of symmetry");
    }

    public void fold() {
        System.out.println("Folding the scalene triangle");
    }

}
