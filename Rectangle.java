class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.shapeName = "Rectangle"; 
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
        return 0; // No volume for 2D shapes
    }
}
