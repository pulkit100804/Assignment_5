class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    double calculateVolume() {
        return 0; // Rectangle has no volume
    }
}
