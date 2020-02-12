package shape;

public abstract class Shape {

    private int sizeX;
    private int sizeY;
    private String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this();
        this.sizeX = source.getSizeX();
        this.sizeY = source.getSizeY();
        this.color = source.getColor();
    }


    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public String getColor() {
        return color;
    }

    public abstract String getType();

    public abstract Shape cloneShape();

}
