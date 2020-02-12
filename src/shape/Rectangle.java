package shape;

public class Rectangle extends Shape {

    private int width;
    private int height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.getWidth();
        this.height = source.getHeight();
        this.color = source.getColor();
    }


    @Override
    public Shape cloneShape() {
        return new Rectangle(this);
    }

    @Override
    public String getType() {
        return this.toString();
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
