package OOP.Interfaces.FormExample;

public class Rectangle extends Form {
    private int length, width;
    public Rectangle(String color, String name, int length, int width) {
        super(color, name);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double berechneFläche() {
        return length * width;
    }
}
