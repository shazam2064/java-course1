
public class Main {

    public static void main(String[] args) {

        GraphicObject goSquare = new Square("horizontal");
        goSquare.drawObject();
        goSquare.splitAcrossAxisOfSymmetry();

        Square square = new Square("vertical");
        square.flip();

        GraphicObject goScaleneTriangle = new ScaleneTriangle();
        goScaleneTriangle.drawObject();

        ScaleneTriangle scaleneTriangle = new ScaleneTriangle();
        scaleneTriangle.fold();

    }

}
