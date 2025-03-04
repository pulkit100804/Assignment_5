class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.shapeName = "Circle"; 
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    double calculateVolume() {
        return 0; // No volume for 2D shapes
    }
}
