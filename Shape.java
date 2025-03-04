abstract class Shape {
    String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract double calculateVolume();
}
