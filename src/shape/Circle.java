package shape;

public class Circle extends Shape {

    private int diameter;
    private String color;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.diameter = source.getDiameter();
        this.color = source.getColor();
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }

    @Override
    public String getType() {
        return this.toString();
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
}
