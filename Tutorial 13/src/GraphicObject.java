
public abstract class GraphicObject {

    public abstract void drawObject();
    public abstract void printNumberOfSides();
    public abstract void splitAcrossAxisOfSymmetry();

    public void ColorObject(String color) {
        System.out.println("Coloring the object");
    }

    public void EnlargeObject(int scale) {
        System.out.println("Enlarging the object");
    }

    public void DuplicateObject() {
        System.out.println("Duplicating the object");
    }

    public void RotateObject() {
        System.out.println("Rotating the object");
    }

    public void TranslateObject(int x, int y) {
        System.out.println("Translating the object");
    }

}
