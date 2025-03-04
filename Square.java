class Square extends Shape {
    double side;

    Square(double side) {
        this.shapeName = "Square"; // Manually setting shape name
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return 4 * side;
    }

    double calculateVolume() {
        return 0; // No volume for 2D shapes
    }
}