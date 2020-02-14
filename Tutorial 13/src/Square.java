
public class Square extends GraphicObject{

    private String axis;

    public Square(String axis) {
        this.axis = axis;
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing the square");
    }

    @Override
    public void printNumberOfSides() {
        System.out.println("A square has 4 sides");
    }

    @Override
    public void splitAcrossAxisOfSymmetry() {
        System.out.println("Splitting the square across the " + axis + " axis");
    }

    public void flip() {
        System.out.println("Flipping the square");
    }

}
